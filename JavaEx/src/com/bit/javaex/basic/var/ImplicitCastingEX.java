package com.bit.javaex.basic.var;

public class ImplicitCastingEX {

	public static void main(String[] args) {
		//암묵적 캐스팅(promotion) : 표현 범위가 좁은 데이터를 넓은 데이터로 변경할 때, java가 자동으로 캐스팅을 해줌
		byte b = 25; //1byte 정수형
		System.out.println("BYTE : "+b);
		
		short s = b; //2byte 정수형, short > byte 이기때문에 암묵적으로 형변환
		System.out.println("SHORT : "+s);
		
		int i = s;
		System.out.println("INTEGER : "+s);
		
		long l = i;
		System.out.println("LONG : "+l);
		
		float f = l; //4byte 실수형, 바이트수는 long보다 작지만 범위가 넓으므로 암묵적 형변환 가능
		System.out.println("FLOAT : "+f);
		
		char c = 'A'; 
		//short s2 = c; //char는 unsigned이기 때문에 short에 할당이 되지 않음 
		int i2 = c;
		System.out.println(i2);
	}

}
