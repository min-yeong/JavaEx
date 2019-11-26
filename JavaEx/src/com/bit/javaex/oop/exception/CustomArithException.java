package com.bit.javaex.oop.exception;

//사용자 정의 예외의 생성 -> 예외 발생시에 데이터를 담아서 catch블록에서 어떤 데이터가 오류를 발생했는지 확인한다.
public class CustomArithException extends ArithmeticException {
	
	//필드
	private int num1;
	private int num2;
		
	//생성자
	public CustomArithException(String message, int num1, int num2) {
		super(message);
		this.num1 = num1;
		this.num2 = num2;
	}
	
	public int getNum1() {
		return num1;
	}
	public int getNum2() {
		return num2;
	}
}


