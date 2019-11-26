package com.bit.javaex.basic.var;

public class CharEx {

	public static void main(String[] args) {
		//char(2바이트 유니코드)
		//선언시에는 작은따옴표, 내부적으로는 아스키코드값이 입력됌
		char ch1 = 'A';
		char ch2 = 'a';
		char ch3 = '한';
		char ch4 = 66;
		int i = (int)ch1 + 4;
		char ch5 = (char)i;
		
		System.out.println(ch1);
		System.out.println(ch2);
		System.out.println(ch3);
		System.out.println(ch4);
		System.out.println(ch5);
		
		System.out.println(ch1 + ch2); //연산시에는 아스키값으로 계산 
		System.out.println(ch1 + ch3);
		
		//문자열 String을 사용(참조자료형)
		//선언시 쌍따옴표 
		String str = "Hello JAVA";
		System.out.println(str);
	}

}
