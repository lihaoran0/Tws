package com.it6.tws.entity;



/**
 * User entity. @author MyEclipse Persistence Tools
 */

public class User implements java.io.Serializable {


	private String uid;
	private String username;
	private String password;
	
	public String getUid() {
		return uid;
	}
	public void setUid(String uid) {
		this.uid = uid;
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
	
	
	
}