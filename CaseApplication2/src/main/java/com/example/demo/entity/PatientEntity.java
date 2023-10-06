package com.example.demo.entity;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.Data;

@Table(name = "PatientEntity")
@Entity
public class PatientEntity {
	
	@Id
	@Column(name = "PATIENTID")
	@SequenceGenerator(name = "patient_seq_gen", sequenceName = "patient_seq", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long patientId;

	@Column(name = "TCID")
	private Long tcId;
	
	@Column(name="NAME")
	private String name;
	
	@Column(name="MIDDLENAME")
	private String middleName;
	
	@Column(name="SURNAME")
	private String surname;
	
	@Column(name="BIRTHDATE")
	private Date birthDate;
	
	@Column(name="SEX")
	private String sex;
	
	@Column(name="AGE")
	private Integer age;
	
	public Long getTcId() {
		return tcId;
	}

	public void setTcId(Long tcId) {
		this.tcId = tcId;
	}

	public Long getPatientId() {
		return patientId;
	}

	public void setPatientId(Long patientId) {
		this.patientId = patientId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}
}
