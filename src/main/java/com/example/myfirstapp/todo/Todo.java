package com.example.myfirstapp.todo;

import java.time.LocalDate;
import java.time.LocalTime;

public class Todo {
	private int id;
	private String username;
	private String description;
	private LocalDate target;
	private Boolean status;
	
	public Todo(int id, String username, String description, LocalDate target, boolean status) {
		super();
		this.id = id;
		this.username = username;
		this.description = description;
		this.target = target;
		this.status = status;
	}

	public int getId() {
		return id;
	}

	public String getUsername() {
		return username;
	}

	public String getDescription() {
		return description;
	}

	public LocalDate getTarget() {
		return target;
	}

	public Boolean getStatus() {
		return status;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void setTarget(LocalDate target) {
		this.target = target;
	}

	public void setStatus(Boolean status) {
		this.status = status;
	}
	
	@Override
	public String toString() {
		return "Todo [id=" + id + ", username=" + username + ", description=" + description + ", target=" + target
				+ ", status=" + status + "]";
	}
}
