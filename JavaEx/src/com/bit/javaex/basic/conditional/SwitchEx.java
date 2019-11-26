package com.bit.javaex.basic.conditional;

import java.util.Scanner;

public class SwitchEx {

	public static void main(String[] args) {
		//switchEx1();
		//switchEx2();
		switchEx3();
	}
	
	public static void switchEx1() {
		//일반적인 switch-case문의 사용법
		//과목을 입력받아서 과목별 강의실을 출력
		Scanner scanner = new Scanner(System.in);
		System.out.print("1.C  2.C++  3.JAVA \n과목명 : ");
		int subject = scanner.nextInt();
		String message;
		
		switch(subject) {
		case 1 :
			message = "R101호 입니다.";
			break;
		case 2 :
			message = "R102호 입니다.";
			break;
		case 3 :
			message = "R103호 입니다.";
			break;
		default :
			message = "상담원에게 문의하세요.";
			break;
		}
		System.out.println(message);
		scanner.close();
	}

	public static void switchEx2() {
		//정수, 문자, 문자열로도 switch-case문 사용 가능
		char grade = 'A';
		String message;
		
		switch(grade) {
			case 'A' :
				message = "Excellent!";
				break;
			case 'B' :
				message = "Good!";
				break;
			case 'C' :
				message = "Soso";
				break;
			case 'D' :
				message = "Fail";
				break;
			default :
				message = "What?";
				break;
		}
		System.out.println("성적은 "+grade+"입니다.\n"+message);
	}
	
	public static void switchEx3() {
		//요일에 따른 행동 설정, SUN->휴식 MON,TUE,WED,THU->열공, FRI->불금, SAT->방전
		//코드값등을 만들고자 할 때는 문자열로 설정하는 것은 바람직하지 않음
		//상수 혹은 ENUM타입을 활용해서 데이터의 범위를 강제로 축소
		Scanner scanner = new Scanner(System.in);
		System.out.print("요일을 입력하시오. : ");
		String dow = scanner.next();
		String message;
		
		switch (dow) {
		case "MON" :
		case "TUE" :
		case "WED" :
		case "THU" :
			message = "열공";
			break;
		case "FRI" :
			message = "불금";
			break;
		case "SAT" :
			message = "방전";
			break;
		case "SUN" :
			message = "휴식";
			break;
		default : 
			message = "재입력";
			break;
		}
		System.out.println("오늘은"+dow+"입니다.\n"+message);
		scanner.close();
	}
}
