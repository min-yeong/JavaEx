package com.bit.javaex.practice.practice01;

import java.util.Scanner;

public class Problem07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("========================");
		System.out.println("      [숫자맞추기게임]      ");
		System.out.println("========================");
		Scanner scanner = new Scanner(System.in);
		String val2 = "n";	
		
		while(true){
			int num = (int)(Math.random()*100)+1;
			if(val2.equals("y")) break;
			else if(val2.equals("n")) {
				while(true) {
					System.out.printf(">>");
					int val = scanner.nextInt();
					if(num>val) System.out.println("더 높게");  
					else if(num<val) System.out.println("더 낮게");  
					else {
						System.out.println("맞았습니다."); 
						break; }
				}
			System.out.printf("게임을 종료하시겠습니까?(y/n)  >>");
			val2 = scanner.next();
			}
			scanner.close();
		}	
		System.out.println("========================");
		System.out.println("    [숫자맞추기게임종료]     ");
		System.out.println("========================");
	}
}
		
	