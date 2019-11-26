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
import java.net.InetSocketAddress;
import java.net.Socket;

public class ServerThread extends Thread {
	//필드
	private Socket socket;
	
	//생성자
	public ServerThread(Socket socket) {
		this.socket = socket;
	}

	@Override
	public void run() {
		try {
			InetSocketAddress client = (InetSocketAddress)socket.getRemoteSocketAddress();
			System.out.println("[클라이언트가 연결되었습니다.]");
			System.out.printf("%s : %d%n", client.getAddress(), client.getPort());
			
			// 메세지읽기
			InputStream is = socket.getInputStream();
			Reader isr = new InputStreamReader(is, "UTF-8");
			BufferedReader br = new BufferedReader(isr);
			
			//Echo Back을 위한 OutputStream
			OutputStream os = socket.getOutputStream();
			Writer osw = new OutputStreamWriter(os, "UTF-8");
			BufferedWriter bw = new BufferedWriter(osw);
			
			String msg;
			while(true) {
				msg = br.readLine();
				if(msg==null) {
					System.out.println("[접속이 종료되었습니다.]");
					break;
				}
				System.out.println("Message : "+ msg);
				
				//Echo Back -> 응답 돌려주기
				System.out.println("Echo Back : "+ msg);
				bw.write("[Echo] : "+ msg);
				bw.newLine();
				bw.flush();
			}
			
			// 5.후처리
			System.out.println("<Thread 종료>");
			bw.close();
			br.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
