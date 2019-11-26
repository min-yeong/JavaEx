package com.bit.javaex.api.generic.ex2;

//GEneric을 이용해서 설계시에는 내부데이터타입을 지정하지 않고 설계, 실제 객체화할때 내부 데이터 타입을 사용하도록 강제
//많이 사용하는 파라미터 관례 
//T -> 외부데이터 type
//R -> return type
//K -> key
//V -> value		강제는아님
public class Box<T> {
	T content;

	public T getContent() {
		return content;
	}

	public void setContent(T content) {
		this.content = content;
	}
	
}
