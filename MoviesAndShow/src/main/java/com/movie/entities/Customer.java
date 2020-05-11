package com.movie.entities;



import javax.persistence.Column;
import javax.persistence.Entity;

import javax.persistence.OneToMany;

import javax.persistence.Table;

import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;
import org.springframework.beans.factory.annotation.Autowired;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

@Entity
@Table(name="customers")
@DynamicUpdate
@DynamicInsert

@JsonIdentityInfo(generator=ObjectIdGenerators.PropertyGenerator.class,property="userId")
public class Customer extends User {
	
	@Column(name="username")
	private String username;
	
	@Column(name="email",unique=true,nullable=false)
	private String email;
	
	
	@OneToMany(mappedBy="customer")
	@Autowired
//	@JsonManagedReference
	
	@Column(name="contact")
	private String contact;

	
	
	public Customer() {
		super();
	}


	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}



	

	@JsonIgnore
	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}
	
	
	
	

}
