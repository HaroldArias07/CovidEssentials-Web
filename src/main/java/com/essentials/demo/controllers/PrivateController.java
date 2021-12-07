package com.essentials.demo.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import com.essentials.demo.models.entity.Usuario;
import com.essentials.demo.models.service.IUsuarioService;

@Controller
@RequestMapping("/private")
public class PrivateController {

	@Autowired
	private IUsuarioService usuarioService;
	
	@GetMapping("/index")
	public String index(Authentication auth, HttpSession session) {
		String username = auth.getName();
		
		if(session.getAttribute("usuario") == null) {
			Usuario usuario = usuarioService.findByUsername(username);
			usuario.setPassword(null);
			session.setAttribute("usuario", usuario);
		}
		return "index";
	}
	
	@GetMapping("/stores")
	public String stores(Authentication auth, HttpSession session) {
		String username = auth.getName();
		
		if(session.getAttribute("usuario") == null) {
			Usuario usuario = usuarioService.findByUsername(username);
			usuario.setPassword(null);
			session.setAttribute("usuario", usuario);
		}
		return "stores";
	}
	
	@GetMapping("/shop")
	public String shop(Authentication auth, HttpSession session) {
		String username = auth.getName();
		
		if(session.getAttribute("usuario") == null) {
			Usuario usuario = usuarioService.findByUsername(username);
			usuario.setPassword(null);
			session.setAttribute("usuario", usuario);
		}
		return "shop";
	}
	
	@GetMapping("/aboutus")
	public String aboutus(Authentication auth, HttpSession session) {
		String username = auth.getName();
		
		if(session.getAttribute("usuario") == null) {
			Usuario usuario = usuarioService.findByUsername(username);
			usuario.setPassword(null);
			session.setAttribute("usuario", usuario);
		}
		return "aboutus";
	}
	
	@GetMapping("/blog")
	public String blog(Authentication auth, HttpSession session) {
		String username = auth.getName();
		
		if(session.getAttribute("usuario") == null) {
			Usuario usuario = usuarioService.findByUsername(username);
			usuario.setPassword(null);
			session.setAttribute("usuario", usuario);
		}
		return "blog";
	}
	
	@GetMapping("/contact")
	public String contact(Authentication auth, HttpSession session) {
		String username = auth.getName();
		
		if(session.getAttribute("usuario") == null) {
			Usuario usuario = usuarioService.findByUsername(username);
			usuario.setPassword(null);
			session.setAttribute("usuario", usuario);
		}
		return "contact";
	}
	
	@GetMapping("/cuatrocerocuatro")
	public String cuatrocerocuatro(Authentication auth, HttpSession session) {
		String username = auth.getName();
		
		if(session.getAttribute("usuario") == null) {
			Usuario usuario = usuarioService.findByUsername(username);
			usuario.setPassword(null);
			session.setAttribute("usuario", usuario);
		}
		return "404";
	}
	
	@GetMapping("/singlepost")
	public String singlepost(Authentication auth, HttpSession session) {
		String username = auth.getName();
		
		if(session.getAttribute("usuario") == null) {
			Usuario usuario = usuarioService.findByUsername(username);
			usuario.setPassword(null);
			session.setAttribute("usuario", usuario);
		}
		return "single-post";
	}
	
	@GetMapping("/singleproduct")
	public String singleproduct(Authentication auth, HttpSession session) {
		String username = auth.getName();
		
		if(session.getAttribute("usuario") == null) {
			Usuario usuario = usuarioService.findByUsername(username);
			usuario.setPassword(null);
			session.setAttribute("usuario", usuario);
		}
		return "single-product";
	}
	
	@GetMapping("/profile")
	public String profile(Authentication auth, HttpSession session) {
		String username = auth.getName();
		
		if(session.getAttribute("usuario") == null) {
			Usuario usuario = usuarioService.findByUsername(username);
			usuario.setPassword(null);
			session.setAttribute("usuario", usuario);
		}
		return "profile";
	}
	
}
