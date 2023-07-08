package com.example.webdev.restobackend.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class chefM {
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	@Column(name="Chef_ID")
	private int Id;
	private String name;
	private String email;
	private String tel;
	public chefM() {
		
	}
	public chefM(String name, String email, String tel) {
		
		this.name = name;
		this.email = email;
		this.tel = tel;
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	@Override
	public String toString() {
		return "chefM [name=" + name + ", email=" + email + ", tel=" + tel + "]";
	}
	
}
