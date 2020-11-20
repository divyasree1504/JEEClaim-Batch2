package com.insurance.claim.dto;

public class UserRole {
	private String username;
	private String password;
	private String rolecode;
	
	public UserRole() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public UserRole(String username, String password, String rolecode) {
		super();
		this.username = username;
		this.password = password;
		this.rolecode = rolecode;
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
	public void setPassward(String password) {
		this.password = password;
	}
	public String getRolecode() {
		return rolecode;
	}
	public void setRolecode(String rolecode) {
		this.rolecode = rolecode;
	}
}
