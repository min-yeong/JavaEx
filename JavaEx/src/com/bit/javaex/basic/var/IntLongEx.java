package com.bit.javaex.basic.var;

public class IntLongEx {

	public static void main(String[] args) {
		//int 변수의 선언
		int intVal1;
		int intVal2;
		
		intVal1 = 2019; //할당 혹은 치환
		//intVal2 = 1234567890123; //out of range
		
		System.out.println(intVal1);
		
		//long(8바이트정수형)
		long longVal1 = 2019, longVal2 = 12345657890123L; //맨뒤에 L 표시를 붙여줘야한다.
		System.out.println(longVal1);
		System.out.println(longVal2);
		
		//2진, 8진, 16진 데이터의 입력
		int bin, oct, hex;
		bin = 0b1100;  //2진수는0b
		oct = 072;   //8진수
		hex = 0xff;   //16진수 0x
		//0~9, A, B, C, D, E, F
		
		System.out.println(bin);
		System.out.println(oct);
		System.out.println(hex);
	}

}
