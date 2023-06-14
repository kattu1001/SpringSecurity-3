package com.example.in.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.in.entity.User;
import com.example.in.service.UserService;

@Controller
public class UserController {

	private UserService userService;

	@Autowired
	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	@GetMapping(value = "/")
	public String showHomePage() {
		return "home";
	}

	@GetMapping(value = "/register")
	public String showRegistrationPage() {
		return "registration";
	}

	@PostMapping(value = "/register")
	public String saveRegistrationPage(@ModelAttribute User user) {
		userService.saveUser(user);
		return "home";
	}

	@GetMapping(value = "/admin")
	public String showAdminPage() {
		return "admin";
	}

	@GetMapping(value = "/student")
	public String showStudentPage() {
		return "student";
	}

	@GetMapping(value = "/employee")
	public String showEmployeePage() {
		return "employee";
	}
	
	@GetMapping(value = "/welcome")
	public String showWelcomePage() {
		return "welcome";
	}
	
	@GetMapping(value = "/access-denied")
	public String showAccessDeniedPage() {
		return "access-denied";
	}

}
