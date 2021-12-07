package com.essentials.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.essentials.demo.models.entity.Usuario;
import com.essentials.demo.models.service.IUsuarioService;

@Controller
public class LoginController {

	@Autowired
	private IUsuarioService usuarioService;
	
	@GetMapping("/auth/login")
	public String login(Model model) {
		model.addAttribute("usuario", new Usuario());
		return "login";
	}
	
	@GetMapping("/auth/register")
	public String registerForm(Model model) {
		model.addAttribute("usuario", new Usuario());
		return "register";
	}
	
	@PostMapping("/auth/register")
	public String register(@Validated @ModelAttribute Usuario usuario, BindingResult result, Model model) {
		if (result.hasErrors()) {
			return "redirect:/auth/register";
		} else {
			model.addAttribute("usuario", usuarioService.registrar(usuario));
		}
		return "redirect:/auth/login";
	}
	
	
	
}
