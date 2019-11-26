package com.bit.javaex.api.objectclass.ex02;

public class ObjectTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point p = new Point(10, 10);
		
		//자바의 최상위 클래스 object -> 기본적으로 모든 클래스는 object가 가진 모든 메서드를 사용할 수 있다.
		System.out.println(p.getClass().getName());
		System.out.println("Hashcode : "+p.hashCode());
		System.out.println("toString : "+p.toString());
		System.out.println("Point : "+p); //toString() 생략
		
		// ==은 주소값(객체의 동일성)을 비교, .equals()은 객체의 값을 비교
		Point p2 = new Point(10, 10);
		System.out.println("p과 p2는 같은 객체인가?"+(p==p2)); //값은 같으나 다른메모리에 저장되어있기 때문에 주소값이 다름
		System.out.println("p와 p2는 같은 값을 가지고 있는가?"+p.equals(p2));  //다른메모리에 저장되어있기때문에 다른 값으로 출력, equals 메서드를 override해줘야함
	}

}
