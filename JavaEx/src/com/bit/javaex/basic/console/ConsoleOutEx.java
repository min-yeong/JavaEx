package com.bit.javaex.basic.console;

public class ConsoleOutEx {

	public static void main(String[] args) {
		//콘솔출력 
		
		System.out.print("Hello"); //출력 후 개행 없음
		System.out.println("Java"); //출력 후 개행 -> 표준출력 
		//System.err.println(); //출력 후 개행 -> 표준에러
		//System.out.printf(); //형식 지정 문자열 출력
		
		//이스케이프 문자 : \n(개행), \t(탭), \"(쌍따옴표), \\(\)
		System.out.println("Hello\nJava");
		System.out.println("Hello\tJava");
		System.out.println("Hello\"Java\"");
		
		//String str = "Hello"Java"" -> error
		String str = "Hello\"Java\"";
		System.out.println(str);
		String dir = "D:\\javastudy";
		System.out.println(dir);
	}

}
