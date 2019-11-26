package com.bit.javaex.oop.staticmember;

public class CalculatorEx {

	public static void main(String[] args) {
		//Static멤버는 new없이도 접근 가능, 특정 클래스에 상수, static메서드를 직접 이용 할 수 있다.
		double area = 10*10*Calculator.PI;
		double total = Calculator.getSum(1, 2, 3, 4, 5, 6, 7);
		
		System.out.println(area+"\n"+total);
	}

}
