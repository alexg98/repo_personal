package com.javasampleapproach.activiti.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "person")
@Access(AccessType.FIELD)
public class Person implements Serializable{
	
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "id", nullable = false)
	@GeneratedValue(strategy = GenerationType.IDENTITY) //-- Aplica para postgres
	private Long id;
	
	@Column(name = "name", nullable = false, length = 255)
	private String name;
	
	@Column(name = "birth_date", nullable = false, length = 255)
	private Date birthDate;

	public Person() {		
	}
	
	public Person(String name, Date birthDate) {
		this.name = name;
		this.birthDate = birthDate;
	}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}	
	
	
}
