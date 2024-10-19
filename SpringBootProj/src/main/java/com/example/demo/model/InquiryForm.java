package com.example.demo.model;

public class InquiryForm {
	private String name;
	private String mail;
	private String age;
	private String gender;
	
	public void setName(String name) {
		this.name = name;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getName() {
		return this.name;
	}
	public String  getMail() {
		return this.mail;
	}
	public String getAge() {
		return this.age;
	}
	public  String getGender() {
		return this.gender;
	}
}
