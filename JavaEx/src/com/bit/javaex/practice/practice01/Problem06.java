package com.bit.javaex.practice.practice01;

import java.util.Scanner;

public class Problem06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("숫자를 입력하세요.");
		Scanner scanner = new Scanner(System.in);
		int val = scanner.nextInt();
		int total=0;
		
		if(val%2==1) {
			for(int i=1; i<=val; i++) {
				if(i%2==0) continue;
				else total += i; 
			}
		}
		else {
			for(int i=0; i<=val; i++) {
				if(i%2==1) continue;
				else total += i;
			}
		}
		System.out.println("결과값 : "+total);
		scanner.close();
	}

}
