package com.insurance.claim.dto;

public class Account {
	private Long accountNumber;
	private String insuredName;
	private String userName;
	
	public Account() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Account(Long accountNumber, String insuredName, String userName) {
		super();
		this.accountNumber = accountNumber;
		this.insuredName = insuredName;
		this.userName = userName;
	}

	public Long getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(Long accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getInsuredName() {
		return insuredName;
	}
	public void setInsuredName(String insuredName) {
		this.insuredName = insuredName;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	
}
