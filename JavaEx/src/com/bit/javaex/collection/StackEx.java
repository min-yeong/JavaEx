package com.bit.javaex.collection;

import java.util.Stack;

public class StackEx {
	//stack : Last in First output
	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<>();
		//stack은 vector을 상속해서 만듦 -> 버퍼가 있는 자료형 
		//루프를 돌면서 stack에 값을 넣어보자
		for (int i=1; i<=10; i++) {
			stack.push(i);
		}
		System.out.println("STACK : "+stack);
		
		//마지막에 입력한 값 확인 : peek()
		int out = stack.peek();
		System.out.println("가장 마지막 입력값 : "+out);
		System.out.println("STACK : "+stack);  //peek는 값을 추출하지않고 확인만 가능하다.
		
		//마지막에 입력한 값 추출 : pop()
		out = stack.pop();
		System.out.println("가장 마지막 입력값 추출 : "+out);
		System.out.println("STACK : "+stack);  //pop은 값을 추출함
		
		//루프를 돌면서 stack안의 데이터를 꺼낸다
		while(!stack.empty()) {  //스택이비어있지않을때까지 무한루프
			//비어있는 스택에서 데이터를 pop할 경우-> Error 
			System.out.println("POP : "+stack.pop());
			System.out.println("STACK : "+stack);  
		}
	}

}
