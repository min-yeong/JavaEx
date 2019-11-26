package com.bit.javaex.practice.practice01;

import java.util.Scanner;

public class Problem02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("숫자를 입력하세요.");
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		
		for (int i=1; i<=num; i++) {
			for(int j=2; j<=i; j++) {
				System.out.print(i);
			}
			System.out.println(i);
		}
		scanner.close();
	}
}
