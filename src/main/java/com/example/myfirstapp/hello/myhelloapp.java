package com.example.myfirstapp.hello;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Component
public class myhelloapp {
    
	@RequestMapping("Hello-you")
	@ResponseBody
	public String hello1() {
		return "Hello!, how you doing today?";
	}
}
