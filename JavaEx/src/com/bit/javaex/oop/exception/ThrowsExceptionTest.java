package com.bit.javaex.oop.exception;

public class ThrowsExceptionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThrowsException except = new ThrowsException();
		
		//호출되는 메서드 내부에서 무리하게 예외처리를 끝내는 것보다
		//예외를 외부로 throw해서 호출하는 메서드에서 일괄 예외처리를 해주는것이 좋다.
		try {
		except.executeRuntimeException();
		} catch (RuntimeException e) {
			System.out.println("ERRPR:"+e.getMessage());
		}
		
		try { 
			double result = except.divide(10, 0);
		} catch(CustomArithException e) {
			//사용자정의 예외			
			System.err.println("ERROR"+e.getMessage());
			//예외상황에서의 데이터 확인
			System.err.println("num1:"+e.getNum1());
			System.err.println("num2:"+e.getNum2());
		} catch(Exception e) {
			System.out.println("ERROR:"+e.getMessage());
		}
	}
}
