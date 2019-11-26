package com.bit.javaex.practice.practice01;

public class Problem04 {
	
	public static void main(String[] args) {
		int[] arr = new int[10];
		
		for (int i=0; i<arr.length; i++) {
			arr[i] = i+1;
		}
		
		for(int j=0; j<arr.length; j++) {
			for (int i=0; i<arr.length; i++) {
				System.out.println(arr[i]);
				arr[i] += 1;
			}
		}
	}	
}
