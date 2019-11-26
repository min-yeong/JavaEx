package com.bit.javaex.oop.shape.v2;

public class Rectangle extends Shape implements Drawable {	//추상메서드를 구현하지 않으면 Error
	//implements 키워드를 이용하여 인터페이스구현, 인터페이스는 여러개를 중복구현 가능
	//추가 필드 선언
	protected int width;
	protected int height;
	
	//생성자
	public Rectangle(int x, int y, int width, int height) {
		super(x, y);
		this.width = width;
		this.height = height;
	}
	
	@Override 
	public void draw() {
		System.out.printf("사각형 [x=%d, y=%d, w=%d, h=%d, area=%f]을 그렸습니다.%n", x, y, width, height, area());
	}
	
	@Override 
	public double area() {
		return width*height;
	}
}
