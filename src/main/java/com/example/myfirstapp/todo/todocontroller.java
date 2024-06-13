package com.example.myfirstapp.todo;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import ch.qos.logback.core.model.Model;

@Controller
public class todocontroller {
	Todoservice todoservice;
	@Autowired
	public todocontroller(Todoservice todoservice){
		super();
		this.todoservice = todoservice;
	}
	@RequestMapping("todo-list")
	public String fun(ModelMap model) {
		List<Todo>t1 = todoservice.fun1();
		for(Todo t2: t1)
	     System.out.println("Adarsh" + t2);
		model.addAttribute("list", t1);
		return "todo-list";
	}
	@RequestMapping("delete-todo")
	public String fun3(@RequestParam int id) {
		todoservice.delete(id);
		return "redirect:todo-list";
	}
	
	@RequestMapping("update-todo")
	public String fun4(@RequestParam int id) {
		todoservice.update(id);
		return "redirect:todo-list";
	}
	
	@RequestMapping(value="/add-todo", method=RequestMethod.POST)
	public String add_todo_controller(int id, String username, String description, LocalDate Target, boolean status) {
		todoservice.fun2(id,username,description,Target,status);
		return "redirect:todo-list";
	}
	@RequestMapping(value="/add-todo", method=RequestMethod.GET)
	public String add_todo_controller() {
		return "add-todo";
	}
}