package com.example.myfirstapp.login;


import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class logincontroller {
	@RequestMapping(value="/log-in", method=RequestMethod.GET)
	public String login() {
		return "login";
	}
	
	@RequestMapping(value="/log-in", method=RequestMethod.POST)
	public String Welcome(@RequestParam String name, @RequestParam String password, ModelMap map) {
		map.addAttribute("name", name);
		map.addAttribute("password", password);
		return "welcome";
	}
}
