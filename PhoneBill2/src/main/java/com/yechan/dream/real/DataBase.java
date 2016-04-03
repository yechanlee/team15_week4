package com.yechan.dream.real;


public class DataBase {

	private UserNode userNode;
	
	public DataBase(){ // 이용자 3명의 데이터가 있다고 가정
		
		userNode = new UserNode("김인성", "010-6359-6550", new Gold(), 4, 1123);
		userNode.setNext(new UserNode("홍길동", "010-1234-5678", new Gold(), 4, 878));
		userNode.getNext().setNext(new UserNode("임꺽정", "010-0000-0000", new Silver(), 5, 521));
		
	}
	

	
	public UserNode receiveUserInfo(String name, String phoneNumber){ // 유저의 정보가 안나올 경우에 예외처리하는거 추가
		
		UserNode _userNode = null;
		for(UserNode p = userNode ; p != null ;p = p.getNext()){
			
			if(p.getName().equals(name) && p.getPhoneNumber().equals(phoneNumber)){
				
				_userNode = p;
				break;
			}
				
		}
		if(_userNode == null){ // 예외처리 임시방편
			
			System.out.println("예외처리 임시방편입니다.");
			return userNode;
		}
		

		return _userNode;
		
	}
	
}
