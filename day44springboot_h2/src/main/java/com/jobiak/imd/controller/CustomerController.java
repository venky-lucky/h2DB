package com.jobiak.imd.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.jobiak.imd.model.Customer;
import com.jobiak.imd.repository.CustomerRepo;


@Controller
public class CustomerController {
	
	@Autowired
	CustomerRepo repo;
	
	public CustomerController()
	{
		
	}
	
	public CustomerController(CustomerRepo repo) {
		//super();
		this.repo = repo;
	}
	@RequestMapping(path="/test",method=RequestMethod.GET)
	public String redirect()
	{
		return "signup";
	}
	@RequestMapping(path="/signup",method=RequestMethod.POST)
	public String doSignUp(@ModelAttribute("customer")Customer cus)
	{
		repo.save(cus);
		return "success";
		
	}

}
