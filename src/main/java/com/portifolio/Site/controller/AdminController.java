package com.portifolio.Site.controller;

import java.io.IOException;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.portifolio.Site.dto.DeleteExperience;
import com.portifolio.Site.dto.NewExperience;
import com.portifolio.Site.dto.NewProject;
import com.portifolio.Site.model.Experience;
import com.portifolio.Site.model.Projects;
import com.portifolio.Site.repository.ExperienceRepository;
import com.portifolio.Site.repository.ProjectsRepository;

@Controller
@RequestMapping("admin")
public class AdminController {

	@Autowired
	ProjectsRepository projectRepo;
	
	@Autowired
	ExperienceRepository experienceRepo;
	
	@GetMapping("admin")
	public String acsses(Model model) {
		return "admin/admin";
	}
	
	@PostMapping("newProject")
	public String newProject(@Valid NewProject requisition, BindingResult result) throws IOException {
		System.out.println("ok");
		if(result.hasErrors()) {
			return "/admin/admin";
		}
		Projects project = requisition.toProject();
		projectRepo.save(project);
		
		return "admin/admin";
	}
	
	@PostMapping("newExperience")
	public String newExperience(NewExperience requisition) throws IOException{
		
		Experience experience = requisition.toExperience();
		experienceRepo.save(experience);
		
		return "admin/admin";
	}

}
