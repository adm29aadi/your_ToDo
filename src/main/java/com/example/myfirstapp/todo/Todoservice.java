package com.example.myfirstapp.todo;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class Todoservice {
    private static List<Todo>todos = new ArrayList<Todo>();
static {
    	todos.add(new Todo(1, "Nihal1", "spring Learning1", LocalDate.now(),false));
    	todos.add(new Todo(2, "Nihal2", "spring Learning2", LocalDate.now(),false));
    	todos.add(new Todo(3, "Nihal3", "spring Learning3", LocalDate.now(),false));
    	todos.add(new Todo(4, "Nihal4", "spring Learning4", LocalDate.now(),false));
}
    	public List<Todo> fun1() {
		// TODO Auto-generated method stub
		return todos;
	}
	public void fun2(int id, String username, String description, LocalDate target, boolean status) {
		// TODO Auto-generated method stub
		todos.add(new Todo(id,username,description,target,status));
	}
	
	public void delete(int id) {
		for(Todo todo:todos) {
			if(todo.getId() == id) {
				todos.remove(todo);
				break;
			}
		}
	}
	
	public void update(int id) {
		for(Todo todo:todos) {
			if(todo.getId() == id) {
				todo.setUsername("Ramji");
				break;
			}
		}
	}
}