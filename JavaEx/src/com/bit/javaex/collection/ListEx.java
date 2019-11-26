package com.bit.javaex.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ListEx {
	//List 인터페이스
	//List : 설계도, 실제클래스 : LinkedList, ArrayList 등으로 구현
	//LinkedList : 중간에 값이 빈번하게 삽입, 삭제되는 경우 효율적
	//ArrayList : 맨 뒤의 값으로만 추가 삽입, 삭제가 일어나는 경우 효율적
	public static void main(String[] args) {
		//List<String> list = new LinkedList<>();
		List<String> list = new ArrayList<>(); //인터페이스의 경우 LinkedList와 ArrayList 교체가능->인터페이스의 장점
		
		//객체 추가
		list.add("Java"); //맨마지막에아이템추가
		list.add("Python");
		list.add("C");
		list.add("C++");
		
		//객체 삽입
		list.add(2, "Linux");
		System.out.println("list : "+list);
		System.out.println("size of list : "+list.size());  //size는 확인가능, 용량(capacity)는확인불가능 -> 버퍼가 아니기 때문
		
		//객체 삭제
		list.remove(2);  //인덱스로삭제
		list.remove("Python");  //객체로삭제
		list.remove("C#");  //없는객체삭제->Error가 없음
		System.out.println(list);
		
		/*
		//루프
		for(String item: list) {
			System.out.println("Element : "+item);
		} */
		//Iterator(List일때)를 이용한 반복문 출력
		Iterator<String> it = list.iterator();
		while(it.hasNext()) {  //뒤에 데이터가 더 있는지 확인, 없을 떄까지 출력
			String item = it.next();
			System.out.println("Element(it) : "+item);
		}
		
		//비우기
		list.clear();
		System.out.println(list); 
	}
}
