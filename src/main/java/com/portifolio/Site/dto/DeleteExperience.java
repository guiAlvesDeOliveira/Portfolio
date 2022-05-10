package com.portifolio.Site.dto;

import javax.validation.constraints.NotBlank;

import com.portifolio.Site.model.Experience;

public class DeleteExperience {

	@NotBlank
	private String company;

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}
	
	public Experience delete() {
		Experience experience = new Experience();
		experience.setCompany(company);
		
		return experience;
	}
}
