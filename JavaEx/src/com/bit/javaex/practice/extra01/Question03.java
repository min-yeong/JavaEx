package com.bit.javaex.practice.extra01;

import java.util.Scanner;

public class Question03 {

	public static void printAnswer(int num) {
		if(num%2==0 || num%3==0) {
			System.out.println(num+"은 소수가 아닙니다.");
		}else System.out.println(num+"은 소수입니다.");
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("정수를 입력하세요:");
		printAnswer(scan.nextInt());
		scan.close();
	}

}
