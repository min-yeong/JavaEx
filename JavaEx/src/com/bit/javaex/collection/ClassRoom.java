package com.bit.javaex.collection;

public class ClassRoom {
	//필드
	private String subject;
	private String roomName;
	
	//과목명만 받는 생성자 추가
	public ClassRoom(String subject) {
		this.subject = subject;
	}
	
	//생성자
	public ClassRoom(String subject, String roomName) {
		this.subject = subject;
		this.roomName = roomName;
	}

	@Override
	public String toString() {
		return "ClassRoom [subject=" + subject + ", roomName=" + roomName + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof ClassRoom) {
			ClassRoom other = (ClassRoom)obj;
			return other.hashCode() == hashCode();
		}
		return super.equals(obj);
	}

	@Override
	public int hashCode() {
	
		return subject.hashCode();
	}
	
}
