package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Register {
	@RequestMapping("/")
	public String start() {
		return "input.html";
	}
	
	@RequestMapping("/register")
	public ModelAndView register
		(@ModelAttribute RegisterBean rb, ModelAndView mav) {
		mav.addObject("rb", rb);
		mav.setViewName("register.html");
		return mav;
	}
	
}
