package com.bit.javaex.quiz02;

public class Quiz02_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 3;
		int b = 6;
		char c = 'A';
	
		boolean result = a%2==0?true:false;
		System.out.println("a는 짝수입니까? "+result);
		
		result = b%3==0?true:false;
		System.out.println("b는 3의 배수입니까? "+result);
		
		boolean r1 = (a%2==0)&&(b%3==0);
		System.out.println(r1);
		
		int i = (int)c+4;
		char r2 = (char)i;
		System.out.println("c의 4글자 뒤의 문자는? "+r2);
	}

}
