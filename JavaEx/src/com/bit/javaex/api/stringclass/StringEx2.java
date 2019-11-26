package com.bit.javaex.api.stringclass;

public class StringEx2 {
	
	public static void PrintString() {
		String str = "aBcAbCabcABC";
		
		System.out.println("3번째 문자열은? "+str.charAt(2));
		System.out.println("abc가 처음 나타나는 인덱스? "+str.indexOf("abc"));
		System.out.println("문자열의 갯수? "+str.length());
		System.out.println("a를 R로 대체한 결과? "+str.replace("a", "R"));
		System.out.println("abc를 123으로 대체한 결과? "+str.replace("abc", "123"));
		System.out.println("처음 3개의 문자열 출력? "+str.substring(0, 3));
		System.out.println("모두 대문자로 바꾼 결과? "+str.toUpperCase());
	}
	public static void main(String[] args) {
		PrintString();
	}

}
