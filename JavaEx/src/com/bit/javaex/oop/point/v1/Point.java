package com.bit.javaex.oop.point.v1;

public class Point {
	int x;
	int y;
	
	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}
	
	public void setX(int x) {
		this.x = x; //this.는 해당인스턴스를 의미함
	}
	
	public void setY(int y) {
		this.y = y;
	}

	public void draw() {
		System.out.printf("점 [%d, %d]를 그렸습니다.", x, y);
	}
}
