package com.bit.javaex.oop.staticmember;

public class SingletonTest {
	public static void main(String[] args) {
		//Singleton s1 = new Singleton();--->error	//생성자가 private하기때문
		Singleton s1 = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();
		
		System.out.println(s1);
		System.out.println(s2);
		
		System.out.println(s1==s2);  //s1과 s2가 같은 주소값을 참조하고 있는가?
	}
}
