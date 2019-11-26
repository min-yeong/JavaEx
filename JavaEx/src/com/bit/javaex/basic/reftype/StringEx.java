package com.bit.javaex.basic.reftype;

public class StringEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//definrStr();
		stringFormatEx();
	}

	public static void definrStr() {
		//문자열 선언
		 String str;
		 str = "JAVA"; //코드에 직접 연겨한 값: LOteral
		 String str2 = "JAVA";
		 String str3 = new String("JAVA");
		 
		 //참조타입(객체)에서 == 는 객체의 주소비교를 나타냄 (값비교가아님)
		 System.out.println(str==str2);
		 System.out.println(str==str3);
		 
		 //값의 비교: JAVA 모든 객체는 equals 라는 값 비교 메소드가 있다
		 System.out.println(str.equals(str3));
	}
	
	public static void stringFormatEx() {
		//포멧문자 %d(십진수), %s(문자열), %f(실수형), %n(개행) -> String.formot 또는 printf에서사용
		String fruit = "사과";
		int total=10, eat=3;
		
		System.out.println(total+"개의 "+fruit+"중에서 "+eat+"개를 먹었다.");
		//가변 데이터 영역을 포맷 문자로 설정하고 고정영역을 문자열로 설정 후에 포맷 문자에 연결시킬 데이터를 지정
		System.out.printf("%d개의 %s중에서 %d개를 먹었다.%n", total, fruit, eat);
		
		float rate = 1.2345f;
		//현재 이자율은 1.23%로 표현할 것
		String fmt = "현재 이자율은 %.2f%%입니다.%n"; //.2->소수점 2자리까지 표현, %는 %%로 표현		
		System.out.printf(fmt, rate);
		
		//포맷으로 지정된 문자열 재사용
		String s = String.format(fmt, 1.5678f);
		System.out.println(s);
	}
}
