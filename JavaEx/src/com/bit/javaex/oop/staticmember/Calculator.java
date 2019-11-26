package com.bit.javaex.oop.staticmember;

//Static의 활용
public class Calculator {
	
	//Static상수와 Static메서드는 인스턴스화 하지 않아도 접근가능, 기능과 상수의 묶음으로 활용가능
	public static final double PI = 3.14159;
	public static double getSum(double...arg) {
		double total = 0;
		
		for(double num: arg) {
			total += num;
		}
		return total;
	}
}
