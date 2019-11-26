package com.bit.javaex.basic.var;

public class ConstantEx {

	//상수 static final, final:한번 할당되면 재할당 불가 
	static final double PI = 3.14159; //상수 이름은 모두 대문자, 단어의 구분은 언더바
	static final int SPEED_LIMIT = 100;
	
	public static void main(String[] args) {
		System.out.println(PI);
		System.out.println(SPEED_LIMIT);
		// 1.가독성, 2.동일값을 일괄 관리 가능, 3.값 유지 가능 
		
		System.out.println("현재 제한 속도는 "+ SPEED_LIMIT + "입니다.");
		
		//SPEED_LIMIT = 120; //final은 변경 할 수 없는 값
		System.out.println(SPEED_LIMIT+"이하로 주행해 주십시오.");
		
		//java에서의 상수 활용
		System.out.println(Math.PI); //내장 Math 객체의 상수
	}

}
