package com.bit.javaex.quiz02;

public class Quiz02_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int balls = 136;
		int cap = 10;
		
		int box = balls%cap==0 ? balls/cap : balls/cap+1 ;
		System.out.println("balls를 상자에 나눠 담기위해 필요한 최소의 상자 갯수는? "+box);
	}

}
