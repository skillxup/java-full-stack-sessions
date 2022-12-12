package com.studycomrade.myfirstwebapp.todo;

import java.time.LocalDate;
import java.util.List;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import jakarta.validation.Valid;

@Controller
@SessionAttributes("name")
public class TodoControllerJpa {
	
	public TodoControllerJpa(TodoRepository todoRepository) {
		super();
		this.todoRepository = todoRepository;
	}
	
	// let's start of repository, 
	// let's make it an autoWired
	// to make it an autoWired, let's add the TodoRepository todoRepository in 
	// constructor ie., TodoController(TodoService todoService) {}
	private TodoRepository todoRepository;
	
	// the url: /list-todos
	@RequestMapping("list-todos")
	public String listAllTodos(ModelMap model) {
		String username = getLoggedinUsername(model);
		
		List<Todo> todos = todoRepository.findByUsername(username);
		model.addAttribute("todos", todos);
		return "listTodos"; // we need to create listTodos.jsp
	}

	private String getLoggedinUsername(ModelMap model) {
		Authentication authentication = 
				SecurityContextHolder.getContext().getAuthentication();
		return authentication.getName();
	}
	
	// GET, POST
	// adding the concept of /add-todo
	@RequestMapping(value = "add-todo", method = RequestMethod.GET)
	public String showNewTodoPage(ModelMap model) {
		String username = getLoggedinUsername(model);
		Todo todo = new Todo(0, username, "", LocalDate.now().plusYears(1), false);
		model.put("todo", todo);
		return "todo";
	}
	
	// Add - POST
	@RequestMapping(value = "add-todo", method = RequestMethod.POST)
	public String addNewTodoPage(ModelMap model, @Valid Todo todo, BindingResult result) {
		
		// if any Errors, we are just staying at 'todo'
		if(result.hasErrors()) {
			return "todo";
		}
		
		// this statements is fetching the username
		String username = getLoggedinUsername(model);
		
		todo.setUsername(username);
		todoRepository.save(todo);
		
		// fetch the data from TodoService
		//		todoService.addTodo(username, todo.getDescription(), 
		//				todo.getTargetDate(), false);
		
		return "redirect:list-todos";
	}
	
	// delete todo
	@RequestMapping("delete-todo")
	public String deleteTodo(@RequestParam int id) {
		// Delete Todo
		// after writing the deleteById() method in TodoService.java, 
		// then, here give a call
		todoRepository.deleteById(id);
		return "redirect:list-todos";
	}
	
	// update todo
	@RequestMapping(value = "update-todo", method = RequestMethod.GET)
	public String showUpdateTodoPage(@RequestParam int id, ModelMap model) {
		Todo todo = todoRepository.findById(id).get();
		model.addAttribute("todo", todo);
		return "todo";
	}
	
	// Update - POST
	@RequestMapping(value = "update-todo", method = RequestMethod.POST)
	public String updateTodo(ModelMap model, @Valid Todo todo, BindingResult result) {
			
		// if any Errors, we are just staying at 'todo'
		if(result.hasErrors()) {
			return "todo";
		}
			
		// this statements is fetching the username
		String username = getLoggedinUsername(model);
		
		// to get a clarity, which user is updating
		todo.setUsername(username);
		
		todoRepository.save(todo);
		return "redirect:list-todos";
	}
}
