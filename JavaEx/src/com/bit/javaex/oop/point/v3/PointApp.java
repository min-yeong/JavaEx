package com.bit.javaex.oop.point.v3;

public class PointApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point p1 = new Point(10, 10);
		p1.draw();
		p1.draw(true);
		
		Point p2 = new Point(20, 20);
		p2.draw();
		p1.draw(false);
		
		Point p3 = new ColorPoint(30, 30, "RED");
		p3.draw();
		p3.draw(false);
		}

}
