package com.bit.javaex.api.objectclass.examples;

public class Rectangle {
	//필드 width, height
	//만약 두 사각형이 면적이 같으면 equals로 판정
	private int width;
	private int height;
	
	//생성자
	public Rectangle(int width, int height) {
		this.width = width;
		this.height = height;
	}
	
	//메서드 
	public int getArea() {
		return width*height;
	}

	@Override
	public boolean equals(Object obj) {
		//외부로부터 넘어온 object가 비교가능한 객체인지 먼저 확인
		if(obj instanceof Rectangle) {
			//obj는 rectangle로 캐스팅 가능하다
			Rectangle other = (Rectangle)obj;
			return getArea() == other.getArea();
		}
		return super.equals(obj);
	}

	@Override
	public String toString() {
		return "Rectangle [width=" + width + ", height=" + height + "]";
	}
	
}
