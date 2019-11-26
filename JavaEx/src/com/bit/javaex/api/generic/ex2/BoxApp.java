package com.bit.javaex.api.generic.ex2;

public class BoxApp {

	public static void main(String[] args) {
		// Box클래스 테스트
		Box<Integer> intBox = new Box<Integer>(); //정수만 받도록 제한하는 Box 생성
		intBox.setContent(2019);
		//intBox.setContent("Error"); ->내부데이터는 integer이기 때문에 에러
		//내용물 출력
		int retval = intBox.getContent();  //int로 형변환할 필요가 없음
		System.out.println(retval);
		
		Box<String> strBox = new Box<>();  //뒤에 <String>생략가능
		strBox.setContent("Java");
		String strval = strBox.getContent();
		System.out.println(strval);
		
		// 만약 캐스팅을 잘못했다면?
		//strval = intBox.getContent();->Error 
		 //Generic으로 만든 클래스는 내부 데이터 타입을 강제했기 때문에 컴파일 타임에서 캐스팅 오류를 잡아낼 수 있다.
	}

}
