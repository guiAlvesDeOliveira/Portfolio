package com.portifolio.Site.model;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity
public class Experience {

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String company;
	private String office;
	private String resume;
		@NotNull
	private boolean workThere;
	private String workFrom;
	private String workedUntil;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
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

}
