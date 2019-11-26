package com.bit.javaex.api.objectclass.ex03;

import java.util.Arrays;

//복제가능하도록 Cloneable 인터페이스구현
public class Scoreboard implements Cloneable {
	//필드로 참조형이 있을 경우
	private int scores[];

	//생성자
	public Scoreboard(int[] scores) {
		this.scores = scores;
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		//step1.얕은 복제를 먼저 시도하고 
		//step2.내부 참조 자료형을 복제해서 다시 할당
		Scoreboard newBoard = (Scoreboard)super.clone();	//얕은복제
		newBoard.scores = Arrays.copyOf(scores, scores.length);	//깊은 복제,내부 참조 객체의 복제
		return newBoard;
	}

	//복제를 위한 getClone메서드 구현
	public Scoreboard getClone() {
		Scoreboard newBoard = null;
		try {
			newBoard = (Scoreboard)clone();
			//clone 매서드를 실행할 때 내부 참조 자료를 새로 복제해서 다시 할당 ->clone 매서드를 오버라이드 해서 새로 구현 필요 **중요**
		} catch(CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return newBoard;
	}
	public int[] getScores() {
		return scores;
	}
	public void setScores(int[] scores) {
		this.scores = scores;
	}
	
	@Override 
	public String toString() {
		String output = "Scoreboard(";
		for (int i=0; i<scores.length; i++) {
			output += scores[i];
			if(i<scores.length-1) {
				output += ",";
			}
		}
		output += ")";
		return output;
	}
}
