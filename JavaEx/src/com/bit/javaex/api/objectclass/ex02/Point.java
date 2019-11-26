package com.bit.javaex.api.objectclass.ex02;

//특정 클래스를 extends하지 않아도 java.lang.object클래스를 상속받게된다 -> 최상위 클래스 : object
public class Point {
	//필드
	private int x;
	private int y;
	
	//생성자
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	//문자열 출력을 위한 toString 메서드 오버라이드
	@Override
	public String toString() {
		return String.format("Point(%d, %d)%n", x, y);  //출력할 데이터 문자열을 리턴
	}
	
	//내부값의 비교를 위해서 equals 메서드를 override해준다
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Point) {
			//obj는 Point의 객체 -> 캐스팅가능
			Point other = (Point)obj;
			//각 x,y값을 비교할 수 있음
			return x==other.x && y==other.y;
		}
		return super.equals(obj); //Point가 아닐경우
	}
}
