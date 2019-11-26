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
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

	public static void main(String[] args) {
		
		// 1.서버 소켓 생성 
		ServerSocket serverSocket = null; //연결용
		
		try {
			serverSocket = new ServerSocket();
		
			// 2.바인드 작업:IP포트를 서버소켓에 연결 
			InetSocketAddress local = new InetSocketAddress("127.0.0.1", 10000);
			serverSocket.bind(local);
			
			System.out.println("<서버시작>");
			System.out.println("[연결 대기 중입니다.]");
			
			// 3.연결대기
			while(true) {
				Socket socket = serverSocket.accept(); //Socket은 통신용
				Thread thread = new ServerThread(socket);
				thread.start();
			}
			// 4.클라이언트가 접속시 처리, 접속한 클라이언트의 IP와 Port정보 출력
			/*InetSocketAddress client = (InetSocketAddress)socket.getRemoteSocketAddress();
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
			System.out.println("<서버종료>");
			bw.close();
			br.close(); */
		} catch(IOException e) {
			e.printStackTrace();
		} finally {	
			try {
				//서버소켓닫기
				serverSocket.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
