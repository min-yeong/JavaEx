package com.bit.javaex.collection;

import java.util.HashSet;

public class HashSetEx {
	//HashSet : 집합, 무순서성, 내부의 데이터는 중복삽입 불가능 
	public static void basicHashSet() {
		//Java의 기본 객체들을 테스트
		//HastSet 생성
		HashSet<String> hs = new HashSet<>();
		
		//객체추가
		hs.add("Java");
		hs.add("Python");
		hs.add("C");
		hs.add("C++");
		hs.add("Java");  //중복삽입을 허용하지 않기 때문에 삽입되지 않음
		System.out.println(hs);  //무순서성확인가능
		System.out.println("SIZE : "+hs.size());
		
	
		//포함 여부 확인 : contains
		System.out.println("있는 데이터 확인 : "+hs.contains("C++"));
		System.out.println("없는 데이터 확인 : "+hs.contains("LINUX"));
		
		//객체 삭제
		hs.remove("C++");
		System.out.println("SET : "+hs);
		
		//셋 비우기
		hs.clear();
		System.out.println("SET : "+hs);
	}
	
	public static void customClassHashSet() {
		//사용자 정의 클래스를 HashSet에서 사용할 수 있도록 한다
		HashSet<Student> hs = new HashSet<>();
		
		Student s1 = new Student("홍길동", 10);
		Student s2 = new Student("장길산", 20);
		Student s3 = new Student("홍길동", 10);
		
		//HashSet에 담기
		hs.add(s1);
		hs.add(s2);
		hs.add(s3);
		System.out.println("HashSet : "+hs);
		
		//s1, s2의 hashCode 확인
		System.out.println("hashcode of s1 : "+s1.hashCode());
		System.out.println("hashcode of s2 : "+s2.hashCode());  
		//hashCode는 빠른검색을 위해 객체를 식별하기 위한 하나의 정수값
		//java의 object클래스는 hashCode을 메모리 주소값으로 사용한다. 
		
		//Student객체가 이름과 id가 같다면 -> 동등객체로 판단, 같은값을 가진 객체의 중복삽입을 막는다
		//1.객체내부에서 hashCode 오버라이드, 2.equals() 메소드오버라이드 -> 모두 통과하면 동등객체
		
	}
	
	public static void main(String[] args) {
		//basicHashSet();
		customClassHashSet();
	}

}
