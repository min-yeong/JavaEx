package com.bit.javaex.network;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressEx {
	
	// 1.내 로컬 IP확인 2.도메인네임으로 서버IP 확인
	public static void printLocalIP() {
		try {
			//InetAddress 클래스 : IP확인
			InetAddress local = InetAddress.getLocalHost();
			System.out.printf("Local IP : %s%n", local.getHostAddress());
			System.out.printf("Local IP Name : %s%n", local.getHostName());
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
	}
	
	public static void printServerIp(String hostname) {
		//hostname으로 명명된 서버의 IP 확인
		try 
		{
			//hostname에 연결된 모든 InetAddress 정보 반환
			InetAddress[] addrs = InetAddress.getAllByName(hostname);
			for (InetAddress remote : addrs) {
				System.out.printf("%s IP : %s%n", remote.getHostName(), remote.getHostAddress());
			}
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		printLocalIP();
		printServerIp("www.naver.com");
		printServerIp("www.google.com");
	}

}
