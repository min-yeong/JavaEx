package com.bit.javaex.thread.ex02;

public class DigitThread extends Thread {

	@Override
	public void run() {
		//스레드의 실행 로직 위치, 1~30까지 정수를 순차적으로 출력
		for (int i=0;i<=30;i++) {
			System.out.println("DigitThread : "+i);
			//스레드 지연
			try {
				Thread.sleep(300);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
}
