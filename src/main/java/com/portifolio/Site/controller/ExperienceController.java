package com.portifolio.Site.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.portifolio.Site.model.Experience;
import com.portifolio.Site.repository.ExperienceRepository;

@Controller
public class ExperienceController {

	@Autowired
	private ExperienceRepository repo;
	
	@GetMapping("/experience")
	public String experience(Model model) {
		List<Experience> experiences = repo.findAll();
		model.addAttribute("experiences", experiences);
		return "experience";
	}
}
