package com.bit.javaex.collection;

import java.util.LinkedList;
import java.util.Queue;

public class QueueEx {
	//Queue : 입력방향과 출력방향이 반대, 중간값은 삽입, 삭제 불가
	public static void main(String[] args) {
		//Queue는 인터페이스이므로 실체클래스는 LinkedList의 저장기능을 이용해야한다.
		Queue<Integer> queue = 	new LinkedList<>();
		
		//초기화
		for(int i=1; i<=10; i++) {
			queue.offer(i);
		}
		System.out.println("QUEUE : "+queue);
		
		//가장 처음 입력된 값을 확인 -> PEEK
		int out = queue.peek();
		System.out.println("PEEK : "+out);
		System.out.println("QUEUE : "+queue);
		
		//데이터 추출 -> POLL (데이터를 추출하고 삭제)
		out = queue.poll();
		System.out.println("POLL : "+out);
		System.out.println("QUEUE : "+queue);
		
		//전체 데이터 추출
		while(!queue.isEmpty()) {
			System.out.println("POLL : "+queue.poll());
			System.out.println("QUEUE : "+queue);
		}
	}

}
