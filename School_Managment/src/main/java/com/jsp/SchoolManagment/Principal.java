package com.jsp.SchoolManagment;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Principal
{
   @Id
   private int id;
   private String name;
   private int age;
   private String mno;
   
   @Column(unique = true)
   private String email;
   private String password;
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
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public String getMno() {
	return mno;
}
public void setMno(String mno) {
	this.mno = mno;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
   
   
	 
}
