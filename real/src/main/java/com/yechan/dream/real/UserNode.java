package com.yechan.dream.real;

public class UserNode {

	private String name;
	private String phoneNumber;
	private PlanType planType;
	private int numberOfLines;
	private int minutesUsed;
	private UserNode next = null;
	
	public UserNode(String name, String phoneNumber, PlanType planType, int numberOfLines, int minutesUsed){
		
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.planType = planType;
		this.numberOfLines = numberOfLines;
		this.minutesUsed = minutesUsed;
		
	}

	public String getName() {
		return name;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public PlanType getPlanType() {
		return planType;
	}

	public int getNumberOfLines() {
		return numberOfLines;
	}

	public int getMinutesUsed() {
		return minutesUsed;
	}

	public UserNode getNext() {
		return next;
	}

	public void setNext(UserNode next) {
		this.next = next;
	}
	
	
	
}
