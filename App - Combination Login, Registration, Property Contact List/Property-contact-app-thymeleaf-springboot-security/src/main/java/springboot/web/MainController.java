package springboot.web;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import springboot.model.User;
import springboot.repository.UserRepository;
import springboot.web.dto.UserRegistrationDto;

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
//	
//	@Autowired
//	UserRepository userR;
//	@GetMapping
//	public String currentUser(@ModelAttribute("user") @Valid UserRegistrationDto userDto, BindingResult result, Model model) {
//
//	    Authentication loggedInUser = SecurityContextHolder.getContext().getAuthentication();
//	    String email = loggedInUser.getName(); 
//
//	     User user = userR.findByEmail(email);
//	    String firstname = user.getFirstName();
//	     model.addAttribute("firstName", firstname);
//	    model.addAttribute("emailAddress", email);
//
//	    return "userProfile1"; //this is the name of my template
//	}
	
}
