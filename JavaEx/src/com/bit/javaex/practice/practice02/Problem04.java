package com.bit.javaex.practice.practice02;

public class Problem04 {

	public static void main(String[] args) {
		int[] arr = new int[6];
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = (int)(Math.random()*45+1);
			for(int j=0; j<i; j++) {
				if(arr[j]==arr[i]) {
					i--;
					break;
				}
			}
		}
		for(int val:arr) {
			System.out.printf(" %d ",val);
		}
	}
}
