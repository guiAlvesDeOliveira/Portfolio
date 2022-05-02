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
	public LocalDate getWorkFrom() {
		return workFrom;
	}
	public void setWorkFrom(LocalDate workFrom) {
		this.workFrom = workFrom;
	}
	public LocalDate getWorkedUntil() {
		return workedUntil;
	}
	public void setWorkedUntil(LocalDate workedUntil) {
		this.workedUntil = workedUntil;
	}
	@NotNull
	private boolean workThere;
	private LocalDate workFrom;
	private LocalDate workedUntil;
	
}
