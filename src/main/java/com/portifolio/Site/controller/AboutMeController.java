package com.portifolio.Site.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AboutMeController {

	@GetMapping("/aboutMe")
	public String aboutMe() {
		return "aboutMe";
	}
}
