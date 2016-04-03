package com.yechan.dream.real;



public class Calculator {

	private double excessMinutesRate = 0;
	private double additionalLinesRate = 0;
	private double familyRate = 0;
	
	public double getExcessMinutesRate() {
		return excessMinutesRate;
	}

	public double getAdditionalLinesRate() {
		return additionalLinesRate;
	}

	public double getFamilyRate() {
		return familyRate;
	}
	
/*
	public void calculate(UserNode userNode){//밑에calculateExpect보고 고쳐야댐
		
		if( (userNode.getMinutesUsed() - userNode.getPlanType().getIncludeMinutes()) > 0)
			excessMinutesRate = (userNode.getMinutesUsed() - userNode.getPlanType().getIncludeMinutes())*userNode.getPlanType().getRatePerExcessMinutes();
		else
			excessMinutesRate = userNode.getPlanType().getRatePerExcessMinutes();
		
		
		if(userNode.getNumberOfLines() > 3){
			
			familyRate = (userNode.getNumberOfLines() - 3) * 5.00;
			additionalLinesRate = userNode.getPlanType().getRatePerAdditionalLine() * 2;
		}
		else
			additionalLinesRate = userNode.getPlanType().getRatePerAdditionalLine() * userNode.getNumberOfLines();
		
		System.out.println( "이번 달 사용요금은: "+ (int)(excessMinutesRate + userNode.getPlanType().getBasicMonthlyRate() + getAdditionalLinesRate() + getFamilyRate())+"$");
	}*/
	
	public void setExcessMinutesRate(double excessMinutesRate) {
		this.excessMinutesRate = excessMinutesRate;
	}

	public void setAdditionalLinesRate(double additionalLinesRate) {
		this.additionalLinesRate = additionalLinesRate;
	}

	public void setFamilyRate(double familyRate) {
		this.familyRate = familyRate;
	}

	public void calculateExpect(PlanType planType, int minutesUsed, int numberOfLines){

		
		if( (minutesUsed - planType.getIncludeMinutes()) > 0)
			setExcessMinutesRate((minutesUsed - planType.getIncludeMinutes())*planType.getRatePerExcessMinutes());
		else
			setExcessMinutesRate(0);
		
		
		if(numberOfLines > 3){
			
			setFamilyRate((numberOfLines - 3) * 5.00);
			setAdditionalLinesRate(planType.getRatePerAdditionalLine() * 2);
		}
		else
			setAdditionalLinesRate((planType.getRatePerAdditionalLine() * (numberOfLines-1)) );
		
		//System.out.println("excessMinutesRate:"+getExcessMinutesRate());
		//System.out.println("basicRate:"+planType.getBasicMonthlyRate());
		//System.out.println("additionalLines:"+getAdditionalLinesRate());
		//System.out.println("family:"+getFamilyRate());
		System.out.printf( "예상 요금은: %.2f$\n", (getExcessMinutesRate() + planType.getBasicMonthlyRate() + getAdditionalLinesRate() + getFamilyRate()));
		
	}
}
