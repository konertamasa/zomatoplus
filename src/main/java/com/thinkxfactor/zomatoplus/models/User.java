package com.thinkxfactor.zomatoplus.models;


//import java.io.Serializable;

//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;

public class User //implements Serializable
{
	private String username;
	private String password;
	private String email;
	private String phone;
	public User()
	{
	}
	public User(String unm,String pwd,String email,String phn)
	{
		super();
		this.username=unm;
		this.password=pwd;
		this.email=email;
		this.phone=phn;
	}
	
	public User(String email,String phn)
	{
		this.email=email;
		this.phone=phn;
	}
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	
	
}
	