package com.bit.javaex.basic.reftype;

public class argsTest {

	public static void main(String[] args) {
		// main이 실행될 대 인자(arguments)를 부여 할 수 있고 인수는 args라는 String배열로 넘어온다. 
		for (String arg:args) {
			System.out.println("ARG : "+arg);
		}
	}

}
