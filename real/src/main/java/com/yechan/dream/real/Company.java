package com.yechan.dream.real;


public class Company {

	private PlanTypeNode planType_node;
	
	private DataBase dataBase;
	
	private Calculator calculator;
	

	public Company(){
		
		dataBase = new DataBase();
		calculator = new Calculator();
		
		buildNewPlanType(new Gold());
		buildNewPlanType(new Silver());
		

	}
	
	private void buildNewPlanType(PlanType planType){
		
		PlanType _planType = planType;
		
		for(PlanTypeNode p = planType_node; ; p = p.getNext()){
			
			if(planType_node == null){
				
				p = planType_node = new PlanTypeNode(_planType, null);
				break;
			}
			
			if(p.getNext() == null){
				
			p.setNext(new PlanTypeNode(_planType, null));
			break;
			}
		}
		
	}
	
	

	/*
	private void checkPlanType(){

		// 요금제를 노드로 연결해서 보관중. 어떤 요금제가 들어있는지 확인해보는 메소드
		
		for(PlanTypeNode p = planType_node; p != null ; p = p.getNext()){
			
				System.out.println(p.getPlanType().getTypeName());
		}
		
	}*/
	
	
	private PlanType findPlanType(String planType){
		
		String _planTypeName = " ";
		
		if(planType.equals("Gold") || planType.equals("gold") ||planType.equals("골드")){
			
			_planTypeName = "Gold";
		}
		
		if(planType.equals("Silver") || planType.equals("silver") ||planType.equals("실버")){
			
			_planTypeName = "Silver";
		}
		
		for(PlanTypeNode p = planType_node; p != null ; p = p.getNext()){
			
			if(p.getPlanType().getTypeName().equals(_planTypeName))
				return p.getPlanType();
				
		}
		
		System.out.println("해당 요금제는 없습니다.");
		
		return null; // 해당 요금제 없는 경우
	}

	/*
	private void calculateRate(UserNode userNode){
		
		calculator.calculate(userNode);
	}*/
	
	private UserNode findDataBase(String name, String phoneNumber){
		
		try {
			System.out.print("조회중");
			Thread.sleep(500);
			System.out.print(".");
			Thread.sleep(500);
			
			System.out.print(".");
			Thread.sleep(500);
			System.out.println(".");
			Thread.sleep(500);
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return dataBase.receiveUserInfo(name, phoneNumber);
	}
	/*
	public void checkBill(String name, String phoneNumber){
		
		//checkPlanType();
		UserNode userNode;
		userNode = findDataBase(name, phoneNumber);
		calculateRate(userNode);
		
		System.out.println();
	}
*/
	public void expectRate(String planType, int minutesUsed, int numberOfLines){
		
		PlanType _planType = findPlanType(planType);
		
		calculator.calculateExpect(_planType, minutesUsed, numberOfLines);
	}
	
}
