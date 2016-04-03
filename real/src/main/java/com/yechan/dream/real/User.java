package com.yechan.dream.real;

import java.util.Scanner;
public class User {

	private Scanner input = new Scanner(System.in);
	
	private String name;
	private String phoneNumber;
	
	
	public User(){}
	public User(Company company){
		
		//두가지 버전을 준비했으나 pdf파일의 조건대로만 출력되게끔 하였습니다.
		
		/*int select = 2;
		System.out.print("[1: 고지서 출력, 2: 예상 요금 조회] (1 or 2 입력) : ");
		select = input.nextInt();
		
		*/
		/*if(select == 2){
			
			expectRate(company);
		}*/
		/*else if(select == 1){
			this.name = inputName();
			this.phoneNumber = inputPhoneNumber();
			
			requestBill(company);
		}*/
		/*else{
			
			System.out.println("입력이 잘못된 경우는 귀찮아서 일단 종료시킴");
			System.exit(0);
		}*/
			
		
	}
	/*
	public User(String name, String phoneNumber){
		
		this.name = name;
		this.phoneNumber = phoneNumber;
	}*/
	
	private String inputName(){
		
		System.out.println("이름과 전화번호를 입력하세요");
		System.out.print("이름:");
		name = input.next();
		return name;
	}
	
	private String inputPhoneNumber(){
		
		System.out.print("전화번호:");
		phoneNumber = input.next();
		return phoneNumber;
	}
	/*
	private void printPersonalInformation(){
		
		System.out.println(this.name +" "+ this.phoneNumber);
	}
	*//*
	private void requestBill(Company company){
		
		company.checkBill(this.name, this.phoneNumber);
	}*/
	
	public void expectRate(Company company){
		
		String planType;
		int minutesUsed;
		int numberOfLines;
		
		System.out.print("사용요금제: ");
		planType = input.next();
		
		System.out.print("사용시간(분): ");
		minutesUsed = input.nextInt();
		
		System.out.print("사용 회선 수: ");
		numberOfLines = input.nextInt();
		
		company.expectRate(planType, minutesUsed, numberOfLines);
	}
	

}

