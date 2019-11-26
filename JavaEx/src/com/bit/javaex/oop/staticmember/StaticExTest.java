package com.bit.javaex.oop.staticmember;

public class StaticExTest {

	public static void main(String[] args) {
		StaticEx s1 = new StaticEx();  //처음 StaticEx Class를 객체화시키기 위해 불러와야하므로 static블록이 1회 호출
		                               //그 이후 staticEx의 생성자가 호출
		//static 멤버는 new를 이용해 인스턴스화 하지않아도 접근 가능
		System.out.println("참조 갯수 : "+StaticEx.refCount);
		
		StaticEx s2 = new StaticEx(); //2회부터는 static블록은 호출되지 않음
		StaticEx s3 = new StaticEx();
		
		s2 = null;  //사용해제(참조하는값이 없으면 자바에서 static블록은 없어짐 -> 언제없어질지는모르기때문에 당장확인불가능)
		System.out.println("s2를 해제");
		
		System.gc();  //가비지 컬렉터 호출 (강제사용해제)
		try{
			Thread.sleep(3000); //3초대기
			System.out.println("참조 갯수 : "+StaticEx.refCount);
		} catch(Exception e) {
			
		}
	}

}
