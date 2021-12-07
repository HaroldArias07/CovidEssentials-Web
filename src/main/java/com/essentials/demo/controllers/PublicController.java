package com.essentials.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/public")
public class PublicController {
	
	@GetMapping("/index")
	public String index() {
		return "index";
	}
	
	@GetMapping("/stores")
	public String stores() {
		return "stores";
	}
	
	@GetMapping("/shop")
	public String shop() {
		return "shop";
	}
	
	@GetMapping("/blog")
	public String blog() {
		return "blog";
	}
	
	@GetMapping("/aboutus")
	public String aboutus() {
		return "aboutus";
	}
	
	@GetMapping("/singlepost")
	public String singlepost() {
		return "single-post";
	}
	
	@GetMapping("/contact")
	public String contact() {
		return "contact";
	}
	
	@GetMapping("/cuatrocerocuatro")
	public String cuatrocerocuatro() {
		return "404";
	}
}
