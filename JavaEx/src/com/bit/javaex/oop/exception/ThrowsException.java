package com.bit.javaex.oop.exception;

//강제 exception 발생 연습 
//메서드 내에서 예외를 처리할 수 있지만 호출하는 메서드에서 호출되는 메서드의 예외를 일괄 처리하는 것이 좋음
public class ThrowsException {
	public void executeRuntimeException() {
		//외부에서 호출되는 메서드
		//억지로 예외처리를 하지 않고 호출 한 메서드에 예외처리를 위임
		System.out.println("강제 예외 발생");
		//RuntimeException 강제발생
		throw new RuntimeException("강제 예외"); 
	}
	
	public double divide(int num1, int num2) {
		if(num2==0) {
			//호출한 메서드로 사용자 정의 Exception을 발생, 처리를 위임소
			throw new CustomArithException("사용자 정의 예외", num1, num2);
			//num1과 num2는 예외발생당시의데이터
		}
		return num1 / num2;
	}
}
