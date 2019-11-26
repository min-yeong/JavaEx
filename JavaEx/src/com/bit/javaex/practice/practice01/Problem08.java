package com.bit.javaex.practice.practice01;

import java.util.Scanner;

public class Problem08 {

	public static void main(String[] args) {		
		int total = 0;
		boolean a = true;
		// TODO Auto-generated method stub
		while(a) {
			System.out.println("-----------------------");
			System.out.println("1.예금|2.출금|3.잔고|4.종료");
			System.out.println("-----------------------");
			System.out.print("선택>");
			Scanner scanner = new Scanner(System.in);
			int val = scanner.nextInt();
			
			switch (val) {
			case 1: 
				System.out.print("예금액>");
				int pay = scanner.nextInt();
				total += pay;
				break;
			case 2:
				System.out.print("출금액>");
				pay = scanner.nextInt();
				total -= pay;
				break;
			case 3:
				System.out.println("잔고액>"+total);
				break;	
			case 4:
				System.out.println("프로그램 종료");
				a = false;
				break;
			default :
				System.out.println("다시입력해주세요.");
				break;
			}scanner.close();
		}	
	}

}
