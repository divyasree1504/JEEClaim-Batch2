package com.insurance.claim.dto;

public class Claim {
	private Long claimNumber;
	private String claimReason;
	private String accidentLocationStreet;
	private String accidentCity;
	private String accidentState;
	private Long accidentZip;
	private String claimType;
	private Long policyNumber;
	
	public Claim() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Claim(Long claimNumber, String claimReason, String accidentLocationStreet, String accidentCity,
			String accidentState, Long accidentZip, String claimType, Long policyNumber) {
		super();
		this.claimNumber = claimNumber;
		this.claimReason = claimReason;
		this.accidentLocationStreet = accidentLocationStreet;
		this.accidentCity = accidentCity;
		this.accidentState = accidentState;
		this.accidentZip = accidentZip;
		this.claimType = claimType;
		this.policyNumber = policyNumber;
	}

	public Claim(String claimReason, String accidentLocationStreet, String accidentCity, String accidentState,
			Long accidentZip, String claimType) {
		super();
		this.claimReason = claimReason;
		this.accidentLocationStreet = accidentLocationStreet;
		this.accidentCity = accidentCity;
		this.accidentState = accidentState;
		this.accidentZip = accidentZip;
		this.claimType = claimType;
	}

	public Long getClaimNumber() {
		return claimNumber;
	}
	public void setClaimNumber(Long claimNumber) {
		this.claimNumber = claimNumber;
	}
	public String getClaimReason() {
		return claimReason;
	}
	public void setClaimReason(String claimReason) {
		this.claimReason = claimReason;
	}
	public String getAccidentLocationStreet() {
		return accidentLocationStreet;
	}
	public void setAccidentLocationStreet(String accidentLocationStreet) {
		this.accidentLocationStreet = accidentLocationStreet;
	}
	public String getAccidentCity() {
		return accidentCity;
	}
	public void setAccidentCity(String accidentCity) {
		this.accidentCity = accidentCity;
	}
	public String getAccidentState() {
		return accidentState;
	}
	public void setAccidentState(String accidentState) {
		this.accidentState = accidentState;
	}
	public Long getAccidentZip() {
		return accidentZip;
	}
	public void setAccidentZip(Long accidentZip) {
		this.accidentZip = accidentZip;
	}
	public String getClaimType() {
		return claimType;
	}
	public void setClaimType(String claimType) {
		this.claimType = claimType;
	}
	public Long getPolicyNumber() {
		return policyNumber;
	}
	public void setPolicyNumber(Long policyNumber) {
		this.policyNumber = policyNumber;
	}
	
	
}
