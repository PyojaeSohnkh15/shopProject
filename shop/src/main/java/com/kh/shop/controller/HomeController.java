package com.kh.shop.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
//wefwefwe
public class HomeController {

	@RequestMapping("/")
	public String home() {
		
		return "/WEB-INF/views/home.jsp";
	}
}
