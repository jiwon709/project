package com.my.ssday0919;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {
	

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home() {
		
		return "HOME";
	}
	
	@RequestMapping(value = "/loginForm", method = RequestMethod.GET)
	public String loginForm() {
		
		return "LOGIN";
	}
	
	@RequestMapping(value = "/signupForm", method = RequestMethod.GET)
	public String signupForm() {
		
		return "SIGN-UP";
	}
	
	@RequestMapping(value = "/aboutus", method = RequestMethod.GET)
	public String aboutus() {
		
		return "ABOUT-US";
	}
}
