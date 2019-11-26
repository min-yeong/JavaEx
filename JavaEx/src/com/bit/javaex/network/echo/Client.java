package com.bit.javaex.network.echo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;
import java.net.ConnectException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.Scanner;

public class Client {

	public static void main(String[] args) {
		
		// 1.Socket 생성
		Socket socket = null;
		
		try {
			socket = new Socket();
			System.out.println("<클라이언트 시작>");
			System.out.println("[연결을 시도합니다.]");
		
			// 2.Connect 시도, 연결하고자 하는 서버의 주소 정보 필요
			InetSocketAddress remote = new InetSocketAddress("127.0.0.1", 10000);
			socket.connect(remote);
			System.out.println("[서버에 연결되었습니다.]");
			
			//서버 측으로 메세지 전송, socket에서 Stream을 얻어 내어 OutputStream을 이용
			OutputStream os = socket.getOutputStream();
			Writer osw = new OutputStreamWriter(os, "UTF-8"); 
			BufferedWriter bw = new BufferedWriter(osw);
			
			//Echo Back 메세지를 받아서 출력
			InputStream is = socket.getInputStream();
			Reader isr = new InputStreamReader(is, "UTF-8");
			BufferedReader br = new BufferedReader(isr);
			
			//메세지를 키보드에서 입력 받아보기
			Scanner scanner = new Scanner(System.in);
			while(true) {
				System.out.print("메세지 입력 : ");
				String msg = scanner.nextLine();
				
				if(msg.equals("/q")) {
					System.out.println("접속을 종료합니다.");
					break;
				}
				bw.write(msg);
				bw.newLine();
				bw.flush();
				System.out.println("[메세지를 전송했습니다.]" + msg);
			
				String rcvMsg = br.readLine();
				System.out.println("응답메세지 : "+rcvMsg);
			}
			br.close();
			System.out.println("<클라이언트 종료>");
			
		} catch(ConnectException e) {
			System.out.println("[접속이 거부되었습니다.]");
		} catch (IOException e) {
			System.out.println(e.getMessage());
		} finally {
			try {
				socket.close();
			} catch(IOException e) {
				e.printStackTrace();
			}
		}
	}
}
