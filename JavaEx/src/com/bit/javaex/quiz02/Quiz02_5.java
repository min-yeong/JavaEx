package com.bit.javaex.quiz02;

public class Quiz02_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 13579;
		int num2 = 13579;
		
		num1 = ++num1 + 1;
		num2 = num2++ + 1;
		System.out.println(num1==num2?"같음":"다름");
		System.out.println("num1의 값은? "+num1);
		System.out.println("num2의 값은? "+num2);
	}

}
