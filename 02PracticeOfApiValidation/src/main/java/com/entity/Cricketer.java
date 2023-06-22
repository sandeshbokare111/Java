  package com.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
//import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
//import jakarta.validation.constraints.Size;

@Entity
@Table
public class Cricketer {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int id; 
	@NotBlank(message="name should not be blank")
	String name;
	@NotNull(message="jersyNo should not be null")
	int jersyNo;
	@Min(value = 1000, message="Domestic Runs should be greater than 5000")
	int domesticRuns;
	@Min(value = 5000, message="international Runs should be greater than 5000")
	int internationalRuns;
	public Cricketer() {
		super();
	}
	public Cricketer(int id, String name, int jersyNo, int domesticRuns, int internationalRuns) {
		super();
		this.id = id;
		this.name = name;
		this.jersyNo = jersyNo;
		this.domesticRuns = domesticRuns;
		this.internationalRuns = internationalRuns;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getJersyNo() {
		return jersyNo;
	}
	public void setJersyNo(int jersyNo) {
		this.jersyNo = jersyNo;
	}
	public int getDomesticRuns() {
		return domesticRuns;
	}
	public void setDomesticRuns(int domesticRuns) {
		this.domesticRuns = domesticRuns;
	}
	public int getInternationalRuns() {
		return internationalRuns;
	}
	public void setInternationalRuns(int internationalRuns) {
		this.internationalRuns = internationalRuns;
	}

}