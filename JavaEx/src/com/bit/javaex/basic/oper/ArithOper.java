package com.bit.javaex.basic.oper;

public class ArithOper {

	public static void main(String[] args) {
		//산술연산자 : 연산의 우선순위가 가장 높은 것
		int a = 7;
		int b = 3;
		
		//부호 연산자 : +, - (일항 연산자)
		System.out.println(-a); //부호를 반전
		System.out.println(-1*a);
		
		//사칙연산 : +, -, *, /, %
		System.out.println("정수의 나눗셈 : "+(a/b)); //정수와 정수의 나눗셈은 정수
		System.out.println("나머지 : "+(a%b));
		//나눗셈의 해
		System.out.println("나눗셈의 해 : "+((float)a/b)); //((flaot)a/(float)b)에서 b는 암묵적 형변환이 이뤄지기 때문에 생략 가능
		
		//증감연산자 : ++, -- (연산순서에 유의)
		System.out.println("a :"+a);
		System.out.println("++a :"+(++a));  
		System.out.println("a :"+a);
		
		System.out.println("b :"+b);
		System.out.println("b++ :"+(b++));  
		System.out.println("b :"+b);
		
		//나눗셈 보충
//		System.out.println(4/0); //0으로 정수를 나눌 때는 산술연산오류발생(ctrl+/ -> 해당 행 주석처리)
		System.out.println(4.0/0); //0으로 실수를 나눌 때는 무한대 발생 
		
		//피연산자의 값이 무한대인지 체크 해야하는 경우
		System.out.println(Double.isInfinite(4.0/0)); //무한대인지 체크
		System.out.println(Double.isNaN(4.0/0)); //isNaN -> Not A Number, 수칫값인지 확인
		//무한대는 수칫값에 포함된다. 
	}

}
