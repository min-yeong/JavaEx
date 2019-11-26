package com.bit.javaex.io.charstream;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.StringTokenizer;

public class StringTokenizerEx {
	static String dirName = "D:\\javastudy\\files";
	static String filename = dirName+"\\thieves.txt";
	
	public static void main(String[] args) {
		//FileReader + BufferedReader + StringTokenizer 를 조합하여 thieves.txt르부터 데이터를 읽어오기
		try {
			//메인스트림열기
			Reader fr = new FileReader(filename);
			//보조스트림열기
			BufferedReader br = new BufferedReader(fr);
			
			String thief = "";
			while ((thief = br.readLine()) != null) {
				//System.out.println(thief);
				StringTokenizer st = new StringTokenizer(thief, " ");
				//StringTokenizer를 이용한 문자열 분리
				while(st.hasMoreElements()) {
					String token = st.nextToken();
					System.out.print(token+",");
				}
				System.out.println();
			}
			br.close();
		}catch(IOException e) {
			e.printStackTrace();
		}
		
	}

}
