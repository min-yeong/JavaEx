package com.bit.javaex.api.arrays;

//사용자 정의 클래스를 정렬하기 위해서는 Comparable 인터페이스를 구현
public class Member implements Comparable {
	//필드
	String name;
	
	//생성자
	public Member(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Member [name=" + name + "]";
	}

	@Override
	public int compareTo(Object o) {
		//두개의 객체를 비교하기 위해서 compareTo 메서드에 비교 방법을 기술해 줘야 한다.
		//name 필드를 대상으로 대소비교
		if(o instanceof Member) {
			//다운캐스팅가능
			Member other = (Member)o;
			return name.compareTo(other.name);
			//compareTo : -1(비교대상이 작을경우), 0(비교대상이 동일한 경우), 1(비교대상이 클 경우)
		}
		return 0;
	}
	
}

