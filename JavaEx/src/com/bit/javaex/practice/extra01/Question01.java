package com.bit.javaex.practice.extra01;
import java.util.Scanner;

public class Question01 {
	public static void printAnswer(int toNum) {
		for(int i=1; i<=toNum; i++) {
			if(i%2==0 || i%3==0) {
				System.out.print(" * ");
			}else System.out.print(i);	
		}
	}
	
	public static void main(String[] args) {
		System.out.print("정수 입력 : ");
		Scanner scan = new Scanner(System.in);
		printAnswer(scan.nextInt());
		
		scan.close();
	}
}
