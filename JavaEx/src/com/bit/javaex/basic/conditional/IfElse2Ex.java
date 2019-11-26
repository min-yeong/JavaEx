package com.bit.javaex.basic.conditional;

import java.util.Scanner;

public class IfElse2Ex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("과목을 선택하세요.");
		System.out.println("1.C  2.C++  3.JAVA");
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("과목명 : ");
		
		int subject = scanner.nextInt();
		String message;
		
		if(subject==1) message="R101입니다."; 
		else if(subject==2) message="R102입니다.";
		else if(subject==3) message="R103입니다.";
		else message="상담원에게 문의하세요.";
		
		System.out.println(message);
		
		scanner.close();
	}

}
