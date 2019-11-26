package com.bit.javaex.basic.oper;

public class ConditionalOperEx {

	public static void main(String[] args) {
		//3항 연산자 : 조건식 ? 참일경우 : 거짓일경우
		
		int a = 10;
		String result = a%2==0 ? "짝수" : "홀수";
		System.out.println(a+"는 "+result);
		
		//score가 있는데 만약 80점 이상이면 Good 출력, 50점 이상히면 Pass, 그렇지 않으면 Fail
		int score = 3;
		String message;
		
		message = score > 80 ? "Good" : score>=50 ? "Pass" : "Fail";
		System.out.println("Score : "+score+ ", Result : "+message);
	}

}
