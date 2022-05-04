package com.portifolio.Site.controller;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

import com.portifolio.Site.model.Projects;
import com.portifolio.Site.repository.ProjectsRepository;

@Controller
public class ProjectsController {

	private String caminhoImagens = "D:\\Códigos\\Portfolio\\src\\main\\resources\\static\\images";
	
	@Autowired
	private ProjectsRepository repo;
	
	@GetMapping("/projects")
	public String projects(Model model) {
		List<Projects> projects = repo.findAll();
		model.addAttribute("projects", projects);
		return "projects";
	}
	
	@GetMapping("/projects/showImage/{image}")
	@ResponseBody
	public byte[] showImage(@PathVariable("image") String image) throws IOException {
		File imageArchive = new File(caminhoImagens + image);
		if (image != null || image.trim().length() > 0) {
			return Files.readAllBytes(imageArchive.toPath());
		}
		return null;
	}
}
