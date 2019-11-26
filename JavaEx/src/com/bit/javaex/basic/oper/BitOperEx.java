package com.bit.javaex.basic.oper;

public class BitOperEx {

	public static void main(String[] args) {
		
		//비트 연산 (하드웨어제어, 이미지 프로세싱) : 미세한 단위 데이터를 제어할 때 사용
		byte b1 = 0b1101;
		byte b2 = 0b0111;
		
		int result = b1 & b2; //0b0101
		System.out.println("b1 AND b2 : "+Integer.toBinaryString(result));
				
		result = b1 | b2;  //0b1111
		System.out.println("b1 OR b2 : "+Integer.toBinaryString(result));
		
		result = ~b1;
		System.out.println("NOT b1 : "+Integer.toBinaryString(result));
		
		//비트 시프드
		int val = 1;
		System.out.println(val);
		//val1를 왼쪽으로 1비트 이동
		System.out.println(Integer.toBinaryString(val<<1));
		//val1를 왼쪽으로 4비트 이동
		System.out.println(Integer.toBinaryString(val<<4));
		
		int val2 = 8;
		System.out.println(Integer.toBinaryString(val2));
		//val2를 오른쪽으로 1비트 이동
		System.out.println(Integer.toBinaryString(val2>>1));
	}

}
