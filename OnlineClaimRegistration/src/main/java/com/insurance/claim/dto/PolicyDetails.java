package com.insurance.claim.dto;

public class PolicyDetails {
	private Long policyNumber;
	private Integer questionId;
	private String answer;
	
	public PolicyDetails() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public PolicyDetails(Long policyNumber, Integer questionId, String answer) {
		super();
		this.policyNumber = policyNumber;
		this.questionId = questionId;
		this.answer = answer;
	}

	public Long getPolicyNumber() {
		return policyNumber;
	}
	public void setPolicyNumber(Long policyNumber) {
		this.policyNumber = policyNumber;
	}
	public Integer getQuestionId() {
		return questionId;
	}
	public void setQuestionId(Integer questionId) {
		this.questionId = questionId;
	}
	public String getAnswer() {
		return answer;
	}
	public void setAnswer(String answer) {
		this.answer = answer;
	}
	
}
