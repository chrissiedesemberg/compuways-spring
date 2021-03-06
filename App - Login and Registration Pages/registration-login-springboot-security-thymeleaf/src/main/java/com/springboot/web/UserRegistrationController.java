package com.springboot.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.springboot.service.UserService;
import com.springboot.web.dto.UserRegistrationDto;

@Controller
@RequestMapping("/registration")
public class UserRegistrationController {
	
	private UserService userService;

	public UserRegistrationController(UserService userService) {
		super();
		this.userService = userService;
	}
	
	//create user object from registration form th:object="${user}"
	@ModelAttribute("user")
	public UserRegistrationDto userRegistrationDto() {
		return new UserRegistrationDto();
	}
	
	
	//show registration page
	@GetMapping
	public String showResgistrationForm() {
		return "registration";
	}
	
	//Handler Method
	@PostMapping
		public String registerUserAccount(@ModelAttribute("user") UserRegistrationDto userDto ) {
			userService.save(userDto);
			return "redirect:/registration?succcess";
		}

	
}
