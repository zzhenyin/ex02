package com.ex02.controller;

import org.springframework.stereotype.Controller;
import org.springframework.security.core.AuthenticatedPrincipal;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMapping;

import lombok.extern.log4j.Log4j;

@Log4j
@Controller
//@RequestMapping("/")
public class CommonController {
	
	@GetMapping("/accessError")
	public void accessDenied(AuthenticatedPrincipal auth, Model model) {
		log.info("access Denied : " + auth);
		
		model.addAttribute("msg", "Acess Denied");
	}
	
	@GetMapping("/customLogin")
	public void loginInput(String error, String logout, Model model) {
		
		
		if(error != null) {
			model.addAttribute("error", "Login error Check Your Account");
			log.info("error: " + error);
			
		}
		if(logout != null) {
			model.addAttribute("logout", "LogOut-!");
			log.info("logout: " + logout);
		}
	}
	
	@GetMapping("/customLogout")
	public void logoutGET() {
		log.info("custom logout");
	}
	
}
