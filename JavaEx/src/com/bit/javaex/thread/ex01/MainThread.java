package com.bit.javaex.thread.ex01;

public class MainThread {

	public static void main(String[] args) {
		// 메인 스레드와 별개의 작업 흐름 작성
		Thread dt = new DigitThread();
		dt.start(); //스레드 실행
		//Thread의 start 메서드 내부에서 rum메서드를 대신 호출
		
		// 메인 스레드 로직 : A ~ Z 까지 순차적으로 출력
		for (char ch = 'A'; ch <= 'Z'; ch++) {
			System.out.println("MainThread : "+ch);
			
			//출력 속도 제한 : thread.sleep()
			try {
				Thread.sleep(300); //300 -> 0.3초
			} catch (InterruptedException e) {
				e.printStackTrace();
			} 
		}

	}

}
