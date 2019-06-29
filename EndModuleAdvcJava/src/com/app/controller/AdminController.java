package com.app.controller;

import org.springframework.ui.Model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.app.service.ICustomerService;

@Controller
@RequestMapping("/admin")
public class AdminController {
@Autowired
	private ICustomerService service;
	
@GetMapping("/list")
public String showCustomers(Model map) {
	map.addAttribute("cust_list", service.getAllCustomer());
	return "/admin/list";
}
}
