package com.bit.javaex.practice.practice02;

public class Problem05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0, count=0; 
		float ave =0;
		int scoreboard[][] = {
				{80, 75, 90, 95, 78},
				{92, 88, 89, 92, 70},
				{78, 80, 85, 86, 63},
				{83, 84, 89, 87, 75},
				{89, 83, 93, 94, 78}};
		
		for(int i=0; i<scoreboard.length; i++) {
			for(int j=0; j<scoreboard[i].length; j++) {
				if(scoreboard[i][j]>=85) {
					count++;
					sum += scoreboard[i][j];
					ave = sum/count;
				}
			}
		}
		System.out.printf("85점 이상인 점수의 합은 %d이고 평균값은 %f이다.", sum, ave);
	}

}
