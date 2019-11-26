package com.bit.javaex.io.bytestream;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class DataStreamEx {
	static String dirName = "D:\\javastudy\\files";
	static String filename = dirName+"\\primitives.txt";

	//DataInputStream과 DataOutputStream
	//기본 데이터 타입을 byte stream으로 다루기 위한 보조 스트림 클래스(변환 작업 대신 수행)
	public static void main(String[] args) {
		try {
			//메인스트림열기
			OutputStream fos = new FileOutputStream(filename);
			//보조스트림열기
			DataOutputStream dos = new DataOutputStream(fos);
			
			//기본데이터 출력, String->Boolean->Int->Float
			dos.writeUTF("홍길동");
			dos.writeBoolean(true);
			dos.writeInt(25);
			dos.writeFloat(80.9f);
			
			dos.writeUTF("장길산");
			dos.writeBoolean(false);
			dos.writeInt(30);
			dos.writeFloat(99.9f);
			
			dos.close();
			
			//InputStream설정
			InputStream fis = new FileInputStream(filename);
			//기본타입으로 변환을 위한 보조 스트림연결
			DataInputStream dis = new DataInputStream(fis);
			
			//루프 돌려서 내용 읽어오기
			for(int i=0; i<2; i++) {
				//읽어올 때 출력한 순서에 맞게 읽어와야함 
				String s = dis.readUTF();
				boolean b = dis.readBoolean();
				int val = dis.readInt();
				float f = dis.readFloat();
				
				System.out.printf("%s : %b : %d : %f%n", s, b, val, f);
			}
			
			dis.close();
		} catch(IOException e) {
			e.printStackTrace();
		}

	}

}
