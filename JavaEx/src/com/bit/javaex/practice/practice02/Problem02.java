package com.bit.javaex.practice.practice02;

import java.util.Scanner;

public class Problem02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int num=0, sum=0; 
		float ave=0;

		int[] arr = new int[5];
		
		for(int i=0; i<arr.length; i++) {
			num = scanner.nextInt();
			arr[i]=num; 
		}
		
		for(int i=0; i<arr.length; i++) {
			sum += arr[i];
		}
		ave = sum/arr.length;
		System.out.println("평균은"+ave+"입니다.");
		
		scanner.close();
	} 

}
