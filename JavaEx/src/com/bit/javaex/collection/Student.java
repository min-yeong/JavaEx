package com.bit.javaex.collection;

public class Student {
	//필드
	private String name; //이름
	private int id; //학번
	
	//생성자
	public Student(String name, int id) {
		this.name =name;
		this.id = id;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", id=" + id + "]";
	}

	@Override
	public boolean equals(Object obj) {
		//hashCode가 일치할 경우 -> 내부 값을 추가로 비교한다
		if(obj instanceof Student) {  //obj가 Student의 객체인지 확인
			Student other = (Student)obj;
			return name.equals(other.name) && id==other.id;
		}
		return super.equals(obj);
	}

	@Override
	public int hashCode() {
		// 객체를 식별하는 정수  숫자, 객체를 빠르게 검색하기 위한 코드값
		//만약 두 객체의 hashCode가 다르다 -> 다른객체
		return id;
	}
	
	
}
