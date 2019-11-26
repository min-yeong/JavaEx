package com.bit.javaex.io;

import java.io.File;
import java.io.IOException;

public class FileClassEx {
	//File Class 예제 
	static String dirName = "D:\\javastudy\\files";
	
	public static void main(String[] args) {
		//File 객체 : new File 시 실제 생셩되는 것이 아니고 해당 파일 정보를 확인하는 클래스다.
		File root = new File(dirName);
		
		//파일이 실제 존재하는 지 확인
		System.out.println(dirName+" : "+root.exists());  //파일 혹은 디렉터리를 만들고자 할때, 해당 파일이 존재하는 지 먼저 확인 후 생성
		if (!root.exists()) {
			//디렉터리 만들기
			root.mkdirs(); //하위 디렉터리 일괄 생성
		}
		//디렉터리 안에 새 파일 생성
		File file = new File(dirName + "\\myfile.txt");
		if(!file.exists()) {
			try {
				file.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		//지정된 디렉터리 내부의 정보를 출력하는 메서드
		printInfo(root);
		
		//존재하는 파일 지우기
		if(file.exists()) {
			file.delete();
		}
		printInfo(root);
	}
	
	static void printInfo(File f) {
		//파일 정보를 넘겨받아 만약 디렉터리면 내부의 파일 목록을 출력, 아니라면 파일의 속성들을 출력
		System.out.println("File List");  //넘겨받은 파일이 디렉터리인지 확인
		if(f.isDirectory()) {
			File[] files = f.listFiles();  //파일의 목록
			System.out.println("Directory : "+f.getName());
			for(File file:files) {
				System.out.printf(file.isDirectory() ? "d " : "f ");
				System.out.println(file.getName()+" "+file.length());
			}
		}else {
			//디렉터리가 아닌경우
			System.out.println("File : "+f.getName());
		}
	}
}
