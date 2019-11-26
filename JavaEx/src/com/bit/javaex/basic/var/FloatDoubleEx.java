package com.bit.javaex.basic.var;

public class FloatDoubleEx {

	public static void main(String[] args) {
		//Float(4바이트), double(8바이트)
		float floatVal = 3.14159F; //float 뒤에 F
		double doubleVal = 3.14159;
		
		floatVal = 0.12345678901234567890F;
		doubleVal = 0.12345678901234567890;
		
		//정밀도 측정 
		System.out.println("Float : "+floatVal);
		System.out.println("double : "+doubleVal);
		//일반 컴퓨터 프로그래밍에서 실수 데이터는 정밀도는 포기하고 범위를 넓힌 것 
		
		//0.1을 3번 곱하면 
		System.out.println(0.1*3);
		
		//지수 표기법 e
		// 300000
		doubleVal = 3e5;
		System.out.println(doubleVal);
	}

}
