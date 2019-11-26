package com.bit.javaex.practice.practice02;

public class Problem03 {
	public static void main(String[] arg) {
		char c[] = {'T','h','i','s',' ','i','s',' ','a',' ','p','e','n','c','i','l'};
		char a =',';
		
		for (char vowel: c) {
			System.out.print(vowel + " "); 
			} 
		
		System.out.println(); 
		
		for(int i=0; i<c.length; i++) {
			if(c[i]==' ') c[i]=a;
		}
		
		for (char vowel: c) {
			System.out.print(vowel + " "); 
			} 
		
	}
}
