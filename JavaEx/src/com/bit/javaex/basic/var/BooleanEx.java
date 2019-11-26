package com.bit.javaex.basic.var;

public class BooleanEx {

	public static void main(String[] args) {
		// 논리형 참:true(1), 거짓:false(0)->디폴트값
		boolean b1 = true;
		boolean b2 = false;
		//조건 분기, 반복 등에서 흐름제어를 위해 논리값을 사용
		
		System.out.println(b1);
		System.out.println(b2);
		
		//두개의 정수 값이 있을 떄 대소비교를 하여 논리값을 출력
		boolean result;
		int i1=3, i2=5;
		
		result = i1 < i2 ? b1 : b2;
		System.out.println(i1+" < "+i2+" ? : "+result);
	}

}
