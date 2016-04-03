package com.yechan.dream.real;

public class PlanTypeNode {

	private PlanType planType;
	private PlanTypeNode next;
	
	public PlanTypeNode(){}
	
	public PlanTypeNode(PlanType planType){
		
		this.planType = planType;
	}
	
	public PlanTypeNode(PlanType planType, PlanTypeNode next){
		
		this.planType = planType;
		this.next = next;
	}

	public PlanType getPlanType() {
		return planType;
	}

	public PlanTypeNode getNext() {
		return next;
	}

	public void setPlanType(PlanType planType) {
		this.planType = planType;
	}

	public void setNext(PlanTypeNode next) {
		this.next = next;
	}
	
	
	/*
	public void printPlanType(){
		
		planType.printPlanTypeName();
	}*/
}
