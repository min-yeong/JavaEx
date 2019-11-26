package com.bit.javaex.collection;

import java.util.Enumeration;
import java.util.Vector;

public class VectorEx {
	
	//vector는 버퍼형 순서가 ㅇ있는 객체들의 집합\
	public static void main(String[] args) {
		Vector v = new Vector<>();  //generic으로 타입을 지정해제앦암 -->object
		System.out.println("Size : "+v.size()+", Capacity"+v.capacity());
		
		Vector<Integer> v2 = new Vector<>(8);  //Integer을담을수있는공간을 가진 벡터
		System.out.printf("Size : %d, Capacity : %d%n", v2.size(), v2.capacity());
		
		//1부터 10까지 값을 담는다
		for(int i=1; i<=10; i++) {
			v2.addElement(Integer.valueOf(i));
			//Wrapper class는 자동으로 Wrapping 되므로 -> v2.addElement(i); 가능
		}
		System.out.printf("Size : %d, Capacity : %d%n", v2.size(), v2.capacity());
		//용량을 초과하면 자동으로 증가(Capacity만큼)
		
		System.out.println("v2안에 7이 있는가? "+v2.contains(7));
		System.out.println("v2에 7은 몇번 인덱스인가? "+v2.indexOf(7)); 
		v2.insertElementAt(11, 5);  //5번인덱스에 11 넣기
		System.out.println(v2);
		
		//객체조회
		System.out.println("5번 인덱스에 있는 객체 : "+v2.elementAt(5));
		//없는 객체 조회
		System.out.println("5번 인덱스에 없는 객체 : "+v2.indexOf(0));
		//객체 삭제
		v2.remove(10);
		System.out.println(v2);
		
		/*
		//내부 데이터를 순회하고자 하느 경우
		for(Integer i:v2) {
			System.out.println("Element : "+i);
		} */
		//Enumeration(Vector, HashTable에서 사용가능)을 이용한 반복문출력
		Enumeration<Integer> e = v2.elements();
		while(e.hasMoreElements()) {  //e.hasMoreElements가 false일 때까지 -> 안에 데이터가 없을 때까지
			Integer item = e.nextElement();
			System.out.println("Element(enum) : "+item);
		} //for문보다 데이터효율이 더좋음
		
		//버퍼비우기
		v2.clear();
		System.out.println(v2);
		System.out.printf("Size:%d, Capacity:%d", v2.size(), v2.capacity());
		
		//Number를 확장한 모든 클래스를 담을 수 있는 벡터 -> Generic 활용
		Vector<? super Number> numVector = new Vector<>();
		numVector.addElement(Integer.valueOf(2019));
		numVector.addElement(Float.valueOf(3.14159F));
		//numVector.addElement("Java");  //String은 Number를 상속받지 않았으므로 추가 불가
	
	}

}
