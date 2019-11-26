package com.bit.javaex.api.generic.ex1;

public class BoxApp {

	public static void main(String[] args) {
		// Box클래스 테스트
		Box intBox = new Box();
		intBox.setContent(2019);
		//내용물 출력
		int retval = (int)intBox.getContent();  //Object를 int로 형변환
		System.out.println(retval);
		
		Box strBox = new Box();
		strBox.setContent("Java");
		String strval = (String)strBox.getContent();
		System.out.println(strval);
		//object 타입을 데이터 참조하게 되면 캐스팅 문제 등 여러가지 부가적인 문제가 발생
		// 만약 캐스팅을 잘못했다면?
		//strval = (String)intBox.getContent();->Error //안전하지 않음-> generic사용
	}

}
