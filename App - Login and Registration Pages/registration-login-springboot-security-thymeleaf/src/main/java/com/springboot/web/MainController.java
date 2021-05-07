package com.springboot.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

	//login template

	@GetMapping("/login")
	public String login() {
		return "login";
	}
	
	//homePage
	@GetMapping("/index")
	public String home() {
		return "index";
	}
	
}
