package com.suyad.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ControllerClass
{
	public ControllerClass() 
	{
		System.out.println("Controller Class Constructor");
	}
	@GetMapping("/welcome")
	public ModelAndView getmessage()
	{
		System.out.println("Welcome message called");
		ModelAndView m = new ModelAndView();
		m.addObject("msg", "Welcome to my home page");
		m.setViewName("message");
		return m;
	}
	
	@GetMapping("/greet")
	public ModelAndView greeting()
	{
		System.out.println("greeting message called");
		ModelAndView m = new ModelAndView();
		m.addObject("msg", "Good Afternoon");
		m.setViewName("message");
		return m;
	}
}
