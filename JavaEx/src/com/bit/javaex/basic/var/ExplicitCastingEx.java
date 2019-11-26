package com.bit.javaex.basic.var;

public class ExplicitCastingEx {

	public static void main(String[] args) {
		//명시적 캐스팅 : 표현 범위가 넓은 자료형을 좁은 자료형으로 변환하고자 할 때 -> 자료의 유실이 발생할 가능성이 크기 때문에 자동변환 불가능 
		byte b;
		int i = 2019;
		float f = 123.456f;
		
		System.out.println("INT : "+i);
		
		b = (byte)i;  //integer가 byte보다 표현범위가 넓기 때문에 강제 변환
		System.out.println("BYTE : "+b); //입력하고자 하는 값이 byte에 들어가지 못하기 때문에 오류 발생(2019를 2진수로 표현햇을 때 8비트를 빼고 모두 유실) 
		
		i = (int)f;
		System.out.println("INT : "+i); //입력하고자 하는 값이 int로 표현되기 위해 소수값은 모두 유실
	}

}
