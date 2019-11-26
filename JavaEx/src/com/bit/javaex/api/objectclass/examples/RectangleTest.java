package com.bit.javaex.api.objectclass.examples;

public class RectangleTest {

	public static void main(String[] args) {
		Rectangle a = new Rectangle(6, 4); //면적24
		Rectangle b = new Rectangle(12, 2); //면적24
		Rectangle c = new Rectangle(3, 3); //면적9
		
		//a와 b의 면적비교
		System.out.println("a와 b의 면적이 같은가?"+a.equals(b));
		//b와 c의 면적비교
		System.out.println("b와 c의 면적이 같은가?"+b.equals(c));
	}

}
