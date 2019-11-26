package com.bit.javaex.practice.practice01;

import java.util.Scanner;

public class Problem05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("숫자를 입력하세요.");
		Scanner scanner = new Scanner(System.in);
		int[] arr = new int[5];
		int num = 0;
		
		for(int i=0; i<arr.length; i++) {
			System.out.print("숫자 : ");
			num = scanner.nextInt();
			arr[i]=num; 
		}
			
		int a = arr[0];
		for (int i=0; i<arr.length-1; i++) {
				if(a>arr[i+1]) a=arr[i];
				else a=arr[i+1];
		}
		System.out.println("최댓값은 "+a+"입니다.");
		scanner.close();
	}
}
