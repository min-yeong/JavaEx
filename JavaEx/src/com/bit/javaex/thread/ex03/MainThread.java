package com.bit.javaex.thread.ex03;

public class MainThread {

	public static void main(String[] args) {
		// 메인 스레드와 별개의 작업 흐름 작성
		Thread dt = new DigitThread();
		dt.setPriority(Thread.MAX_PRIORITY); //우선순위 조정 가능 : 1~10, 기본값은 5
		dt.start(); //스레드 실행
		//Thread의 start 메서드 내부에서 rum메서드를 대신 호출
		/*
		// 메인 스레드 로직 : A ~ Z 까지 순차적으로 출력
		//->별도의 Thread : AlphabetThread로 분리
		for (char ch = 'A'; ch <= 'Z'; ch++) {
			System.out.println("MainThread : "+ch);
			
			//출력 속도 제한 : thread.sleep()
			try {
				Thread.sleep(300); //300 -> 0.3초
			} catch (InterruptedException e) {
				e.printStackTrace();
			} 
		}*/
		
		//Runnable 인터페이스로 만든 쓰레드는 Thread 클래스에 생성자로 넘겨주고 Thread를 실행시켜야 한다.
		Thread at = new Thread(new AlphabetThread());
		at.setPriority(Thread.MIN_PRIORITY);
		at.start();
		
		//메인스레드의 흐름에 다른 스레드의 흐름을 합류(join)시켜주어야 메인스레드가 다른스레드듣ㄹ이 모두 종료될때까지 각 스레드의 제어권을 유지
		try {
			dt.join();  //DigitThread를 MainThread의 흐름에 합류
			at.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		} 
		System.out.println("메인쓰레드 종료");
	}

}
