package com.bit.javaex.basic.console;

import java.util.Scanner;

public class ConsoleInputEx {

	public static void main(String[] args) {
		//Console Input : Scanner 
		Scanner scanner = new Scanner(System.in); //표준입력(System.in)으로부터 입력받을 스캐너 생성
		
		//스캐너로부터 이름 입력받기	
		System.out.print("이름 : ");
		String name = scanner.next();
		System.out.println("Hello"+name);
		
		//스캐너로부터 정수 입력받기
		System.out.print("나이 : ");
		int num = scanner.nextInt();
		System.out.println(num);
		
		//시스템자원을 사용하고 나면 꼭 해제 할 것
		scanner.close();
	}

}
