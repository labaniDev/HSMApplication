package com.example.demo.dto;

import com.example.demo.entity.Status;
import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
public class DoctorDTO {
	
	private Long id;
	private String email;
	private String name;
	private String specialization;
	private String gender;
	private String password;
	private String about;
	private String experience;
	private Boolean isaspecialist;
	private Double fee;
	private String dob;
	private Status status;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSpecialization() {
		return specialization;
	}
	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getAbout() {
		return about;
	}
	public void setAbout(String about) {
		this.about = about;
	}
	public String getExperience() {
		return experience;
	}
	public void setExperience(String experience) {
		this.experience = experience;
	}
	public Boolean getIsaspecialist() {
		return isaspecialist;
	}
	public void setIsaspecialist(Boolean isaspecialist) {
		this.isaspecialist = isaspecialist;
	}
	public Double getFee() {
		return fee;
	}
	public void setFee(Double fee) {
		this.fee = fee;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}

}
