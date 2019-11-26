package com.bit.javaex;

public class MethodEx {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("3+5="+getSum(3,5));
		System.out.println("더한 값:"+getSumVar(3,5,7,5));
		printTotal("결과는?", 3,4,5,1,2,3,4,5,5);
	}
	
	public static double getSum(double a, double b) {
		//a, b는 고정인자, double값 반환
		return a+b;
	}  
	
	public static double getSumVar(double...values) {
		//double...values는 가변인자를 의미하고 데이터는 배열로 전달된다.
		//정해진 인자 값이 아닌 사용자가 인자 값을 의미로 대입할 수 있다.
		double total= 0;
		for(double num: values) {
			total += num;
		}
		return total;
	}
	
	public static void printTotal(String message, double...values) {
		//반환할 값이 없어도 선언부에서는 return타입이 있어야함으로 void로 설정
		//고정인자와 가변인자를 함께 사용할 수 있음, 순서에 유의, 고정인자가 먼저
		System.out.println(message+""+getSumVar(values));
		//반환값이 void이므로 return문은 중단, 호출되기 전 재 위치로 되돌아가라는 의미와 같다. 
	}
	
}
