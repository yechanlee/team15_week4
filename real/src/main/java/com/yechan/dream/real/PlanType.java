package com.yechan.dream.real;

public class PlanType {

	private String typeName;
	private double basicMonthlyRate;
	private double ratePerAdditionalLine;
	private int includeMinutes;
	private double ratePerExcessMinutes;
	
	public PlanType(String typeName, double basicMonthlyRate, double ratePerAdditionalLine, int includeMinutes, double ratePerExcessMinutes){
		
		this.typeName = typeName;
		this.basicMonthlyRate = basicMonthlyRate;
		this.ratePerAdditionalLine = ratePerAdditionalLine;
		this.includeMinutes = includeMinutes;
		this.ratePerExcessMinutes = ratePerExcessMinutes;
	}
	
	

	public String getTypeName() {
		return typeName;
	}

	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}



	public double getBasicMonthlyRate() {
		return basicMonthlyRate;
	}

	public void setBasicMonthlyRate(double basicMonthlyRate) {
		this.basicMonthlyRate = basicMonthlyRate;
	}

	public double getRatePerAdditionalLine() {
		return ratePerAdditionalLine;
	}

	public void setRatePerAdditionalLine(double ratePerAdditionalLine) {
		this.ratePerAdditionalLine = ratePerAdditionalLine;
	}

	public int getIncludeMinutes() {
		return includeMinutes;
	}

	public void setIncludeMinutes(int includeMinutes) {
		this.includeMinutes = includeMinutes;
	}

	public double getRatePerExcessMinutes() {
		return ratePerExcessMinutes;
	}

	public void setRatePerExcessMinutes(double ratePerExcessMinutes) {
		this.ratePerExcessMinutes = ratePerExcessMinutes;
	}
	/*
	public void printPlanTypeName(){
		
		System.out.println(this.typeName);
	}*/
	
}
