package com.portifolio.Site.dto;

import javax.validation.constraints.NotBlank;

import com.portifolio.Site.model.Experience;

public class NewExperience {

	@NotBlank
	private String company;
	@NotBlank
	private String office;
	@NotBlank
	private String resume;
	@NotBlank
	private boolean workThere;
	@NotBlank
	private String workFrom;

	private String workedUntil;

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getOffice() {
		return office;
	}

	public void setOffice(String office) {
		this.office = office;
	}

	public String getResume() {
		return resume;
	}

	public void setResume(String resume) {
		this.resume = resume;
	}

	public boolean isWorkThere() {
		return workThere;
	}

	public void setWorkThere(boolean workThere) {
		this.workThere = workThere;
	}

	public String getWorkFrom() {
		return workFrom;
	}

	public void setWorkFrom(String workFrom) {
		this.workFrom = workFrom;
	}

	public String getWorkedUntil() {
		return workedUntil;
	}

	public void setWorkedUntil(String workedUntil) {
		this.workedUntil = workedUntil;
	}

	public Experience toExperience() {
		Experience experience = new Experience();
		
		experience.setCompany(company);
		experience.setOffice(office);
		experience.setResume(resume);
		experience.setWorkFrom(workFrom);
		experience.setWorkedUntil(workFrom);
		experience.setWorkThere(workThere);
		
		return experience;
	}

}
