package com.mayura.HH.domain;

public class Student {

	String firstName;
	String lastName;
	String email;
	
	public Student(){
		this.firstName = "Mayura";
		this.lastName = "Selvarajah";
		this.email = "codemanjaa@sun.com";
		
	}
	
	
	public Student(String firstName, String lastName, String email) {
		//super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
	}


	public String getFirstName() {
		return firstName+ " "+ lastName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}
	
	public String toString(){
		
		return this.firstName;
	}
	
	
	
}
