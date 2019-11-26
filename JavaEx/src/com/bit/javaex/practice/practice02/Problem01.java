package com.bit.javaex.practice.practice02;

public class Problem01 {

	public static void main(String[] args) {
		int count = 0;
		int sum = 0;
		// TODO Auto-generated method stub
		int[] data = {1, 3, 5, 8, 9, 11, 15, 19, 18, 20, 30, 33, 31};
		for(int i=0; i<data.length; i++) {
			if(data[i]%3==0) {
				count++;
				sum += data[i];
			}else continue;
		}System.out.println("주어진 배열에서 3의 배수의 개수 =>"+count);
		 System.out.println("주어진 배열에서 3의 배수의 합 =>"+sum);
	}

}
