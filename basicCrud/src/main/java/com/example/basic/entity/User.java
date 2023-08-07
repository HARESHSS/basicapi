
package com.example.basic.entity;

import jakarta.persistence.Entity;

@Entity
public class User {
	@jakarta.persistence.Id
	private int Id;
	private String name;
	private int age;
	private String dob;
	private String Degree;
	private String Father_name;
	private String Mother_name;
	private long Phone_number;
	private String Email;
	private String Password;
	
	public User() {
		}
	
	
	public User(int id, String name, int age, String dob, String degree, String father_name, String mother_name,
			long phone_number, String email, String password) {
		
		this.Id = id;
		this.name = name;
		this.age = age;
		this.dob = dob;
		this.Degree = degree;
		this.Father_name = father_name;
		this.Mother_name = mother_name;
		this.Phone_number = phone_number;
		this.Email = email;
		this.Password = password;
	}


	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getDegree() {
		return Degree;
	}
	public void setDegree(String degree) {
		Degree = degree;
	}
	public String getFather_name() {
		return Father_name;
	}
	public void setFather_name(String father_name) {
		Father_name = father_name;
	}
	public String getMother_name() {
		return Mother_name;
	}
	public void setMother_name(String mother_name) {
		Mother_name = mother_name;
	}
	public long getPhone_number() {
		return Phone_number;
	}
	public void setPhone_number(long phone_number) {
		Phone_number = phone_number;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	
}