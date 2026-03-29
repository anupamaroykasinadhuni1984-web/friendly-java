package com.example.mctask.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import com.example.mctask.McUser.McUser1;

@Controller
public class UserController {
@GetMapping("/api/v1/McUser1")
public String showForm()
{
	return "Landing";
}
@PostMapping("/api/v1/McUser1")
public String contactform(McUser1 user, org.springframework.ui.Model model)
{
	model.addAttribute("name",user.getFname());
	model.addAttribute("email",user.getEmailaddress());
	
	return "SUCCESS";
}
}
