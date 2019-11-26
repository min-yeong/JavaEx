package com.bit.javaex.wrapper;

public class wapperEx {

	public static void main(String[] args) {
		//Wrapper 틀래서 (포장클래스), 자바는 기본적으로 객체를 다르지 않아경우에 따라 객체가 아니면 사용할 수 ㅇㅄ는 메서도감ㄶ다,
		//기본타입을직접사용핤수없고 포장클래서로 포장해서 넘겨줘야 한다.
		Integer i = new Integer(10);
		Character c = new Character('c');
		//new를 이용한 wrapper 틀래서의 생성은 JDK에서 deprecated되었따
		
		Float f = Float.valueOf(3.14514f);
		//Boolean Boolean.valueOf(true);
		
		//valusOf의 경우 문자열을 넣어도됌
		Integer i2 = Integer.valueOf("10");
		Double d2 = Double.valueOf("3.14159");
		//중요 : valueOf에 넘겨준 문자열이 해당 자료형의 형태여야함
		//Integer i3 = Integer.valueOf("a123"); ->Error //a123은 정수형태가 아니기 떄문
		
		//편환 관련 메서드들 : parse 계열의 메서드 -> 문자열을 해당 데이터 타입으로 변경, 혹은 다른 형태로 출력
		System.out.println(Integer.parseInt("-123"));	//문자열 -> 상수
		System.out.println(Integer.parseInt("FF", 16)); //FF 16진수를 정수로 변경
		System.out.println(Integer.toBinaryString(2019));
		System.out.println(Integer.toHexString(2019));
		
		//형 변환
		double d3 = i2.doubleValue(); //정수 i2를 double로 변환
		
		//박싱과 언박싱
		Integer i3 = 2019; //JDK5 이후에는 자동으로 박싱
		
		//언박싱
		System.out.println(i3.intValue());
	}

}
