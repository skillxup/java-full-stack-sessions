package com.studycomrade.myfirstwebapp.todo;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Size;

// after generating the constructor, Getters ..., toString()
// now, its turn to start or work with Database (e.g., MySql)

// Database: MySql
// Static List of todos => Database(H2, MySql) 


// JPA
// Bean -> Database Table

@Entity()
public class Todo {
	
	// default constructor
	public Todo() {
		
	}
	
	// generate the constructor using fields by right click, choose 'source'
	public Todo(int id, String username, String description, LocalDate targetDate, boolean done) {
		super();
		this.id = id;
		this.username = username;
		this.description = description;
		this.targetDate = targetDate;
		this.done = done;
	}
	
	// id, username, description, targetDate, done
	@Id
	@GeneratedValue
	private int id;
	
	// @Column(name = "name")
	private String username;
	
	@Size(min=10, message="Enter atleast 10 characters!!")
	private String description;
	// for LocalDate, we have to import (press cntrl + space)
	private LocalDate targetDate;
	private boolean done;
	
	// generate Getters and Setters, by right click, choose 'source' - Getters.. - after done
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public LocalDate getTargetDate() {
		return targetDate;
	}
	public void setTargetDate(LocalDate targetDate) {
		this.targetDate = targetDate;
	}
	public boolean isDone() {
		return done;
	}
	public void setDone(boolean done) {
		this.done = done;
	}
	
	// generate toString() method
	@Override
	public String toString() {
		return "Todo [id=" + id + ", username=" + username + ", description=" + description + ", targetDate="
				+ targetDate + ", done=" + done + "]";
	}	
}
