package com.example.myfirstapp.hello;

import org.apache.catalina.core.ApplicationContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class myhelloapp {
    
	@RequestMapping("Hello-you")
	@ResponseBody
	public String hello1() {
		return "Hello!, how you doing today?";
	}
	@RequestMapping("Hello-html")
	public String hello2() {
		return "hello_world";
	}
}
