package com.bit.javaex.oop.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionEx {
	//ArithmeticException
	public static void ArithExceptionEx() {
		//상황1. scanner로부터 정수를 입력받아서 해당 정수로 100을 나눈다
		double result = 0;
		Scanner scanner = new Scanner(System.in);
		int num = 0;	//입력값 변수
		
		try {
		//오류발생가능영역
			System.out.print("정수입력 : ");
			num = scanner.nextInt();
			result = 100/num;
		
			System.out.println("결과 : "+result);
		//오류발생가능영역
		} catch(ArithmeticException e) {
			//ArithmeticException 발생했을 경우의 처리
			System.out.println("0으로 나눌수 없어요:");
			System.out.println("ERROR메세지:"+e.getMessage());
		} catch(InputMismatchException e) {
			System.out.println("정수로 입력해주세요.");
		}catch(Exception e) {
			//항상마지막에 실행 -> Exception클래스는 모든 예외를 다 처리하기 때문
			e.printStackTrace();
		} finally {
			//예외여부에 상관없이 항상 마지막에 실행
			System.out.println("Finally 실행");
		}
		scanner.close();
	}
	
	public static void arrayExceptionEx() {
		//ArrayIndexOutOfBoundsException 테스트
		int intArray[] = {3, 6, 9};
		//intArray의 length는 3, 인덱수눈 0~2
		System.out.println("길이 : "+intArray.length);
		
		try {
			intArray[4]=12;
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Error: 인덱스 범위는 "+(intArray.length-1)+"까지 입니다.");
			System.out.println(e.getMessage());
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ArithExceptionEx();
		arrayExceptionEx();
	}

}
