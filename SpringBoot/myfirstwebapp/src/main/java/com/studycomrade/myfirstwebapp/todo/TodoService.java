package com.studycomrade.myfirstwebapp.todo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import org.springframework.stereotype.Service;

import jakarta.validation.Valid;

@Service
public class TodoService {
	private static List<Todo> todos = new ArrayList<>();
	
	// defaultly setting todosCount as 0 as an id
	private static int todosCount = 0;
	
	// here incrementing the id with ++todosCount
	static {
		todos.add(new Todo(++todosCount, "studycomrade", "Learn AWS 1", 
				LocalDate.now().plusYears(1), false)); 
		todos.add(new Todo(++todosCount, "studycomrade", "Learn DevOps 1", 
				LocalDate.now().plusYears(2), false)); 
		todos.add(new Todo(++todosCount, "studycomrade", "Learn Full Stack Development 1", 
				LocalDate.now().plusYears(3), false)); 
	}
	
	public List<Todo> findByUsername(String username) {
		Predicate<? super Todo> predicate = 
				todo -> todo.getUsername().equalsIgnoreCase(username);
		return todos.stream().filter(predicate).toList();
	}
	
	// addTodo method for adding the new Todo Item
	public void addTodo(String username, String description, LocalDate targetDate, boolean done) {
		Todo todo = new Todo(++todosCount, username, description, targetDate, done);
		todos.add(todo);
	}
	
	// deleteById - deleting the todoList
	public void deleteById(int id) {
		Predicate<? super Todo> predicate = todo -> todo.getId() == id;
		todos.removeIf(predicate);
	}
	
	// findById
	public Todo findById(int id) {
		Predicate<? super Todo> predicate = todo -> todo.getId() == id;
		Todo todo = todos.stream().filter(predicate).findFirst().get();
		return todo;
	}
	
	// updateTodo
	public void updateTodo(@Valid Todo todo) {
		// we are first deleting the existing todo
		deleteById(todo.getId());
		
		// and then, adding the latest one, in the same
		todos.add(todo);
	}
	
}