package com.invivoo.satisfaction.model.impl;

import com.invivoo.satisfaction.model.Consultant;

public class ConsultantImpl implements Consultant {
	private String email;
	private String firstName;
	private String lastName;
	
	public ConsultantImpl(){
		
	}

	public ConsultantImpl(String email, String firstName, String lastName) {
		this.email = email;
		this.firstName = firstName;
		this.lastName = lastName;
	}

	@Override
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	@Override
	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
}
