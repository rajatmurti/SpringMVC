package com.app.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.app.pojos.Customer;
import com.app.service.ICustomerService;

@Controller
@RequestMapping("/user")
public class UserController {
@Autowired
private ICustomerService service;
	@GetMapping("/login")
	public String CustomerLogin() {
		System.out.println("in login get");
		return "user/login";
	}
	@PostMapping("/login")
	public String customerLoginPost(Model map,@RequestParam String username,@RequestParam String password,HttpSession hs) {
		System.out.println("in login post");
		Customer cust= service.validateCustomer(username, password);
		map.addAttribute("status", "LoginSuccessfull");
		hs.setAttribute("userDetails",cust);
		if(cust.getName().equals("rajat"))
		{
			return "redirect:/admin/list";
		}
			else
		return "/customer/details";
	}
	
}
