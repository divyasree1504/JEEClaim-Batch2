package com.insurance.claim.dto;

public class Policy {
	private Long policyNumber;
	private Double policyPremium;
	private Long accountNumber;
	
	public Policy() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Policy(Long policyNumber, Double policyPremium, Long accountNumber) {
		super();
		this.policyNumber = policyNumber;
		this.policyPremium = policyPremium;
		this.accountNumber = accountNumber;
	}

	public Long getPolicyNumber() {
		return policyNumber;
	}
	public void setPolicyNumber(Long policyNumber) {
		this.policyNumber = policyNumber;
	}
	public Double getPolicyPremium() {
		return policyPremium;
	}
	public void setPolicyPremium(Double policyPremium) {
		this.policyPremium = policyPremium;
	}
	public Long getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(Long accountNumber) {
		this.accountNumber = accountNumber;
	}
	
	
}
