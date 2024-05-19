package com.example.myfirstapp.login;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class logincontroller {
    private Logger logger = LoggerFactory.getLogger(getClass());
	@RequestMapping("/log-in")
	public String login(@RequestParam String name, ModelMap model) {
		model.put("name", name);
		logger.debug("name if param is : {}", name);
		return "login";
	}
}
