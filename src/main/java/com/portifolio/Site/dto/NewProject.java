package com.portifolio.Site.dto;

import java.io.IOException;

import javax.validation.constraints.NotBlank;

import com.portifolio.Site.model.Projects;

public class NewProject {

	
	@NotBlank
	private String name;
	
	@NotBlank
	private String resume;
	
	@NotBlank
	private String technologies;
	
	@NotBlank
	private String image;
	
	@NotBlank
	private String url;



	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getResume() {
		return resume;
	}


	public void setResume(String resume) {
		this.resume = resume;
	}


	public String getTechnologies() {
		return technologies;
	}


	public void setTechnologies(String technologies) {
		this.technologies = technologies;
	}


	public String getImage() {
		return image;
	}


	public void setImage(String image) {
		this.image = image;
	}


	public String getUrl() {
		return url;
	}


	public void setUrl(String url) {
		this.url = url;
	}


	public Projects toProject() throws IOException {
		Projects project = new Projects();
		project.setName(name);
		project.setResume(resume);
		project.setTechnologies(technologies);
		project.setUrl(url);
		project.setImageUrl(image);
		return project;
	}

}
