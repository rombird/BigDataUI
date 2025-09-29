package Ch11;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerMain {

	public static void main(String[] args) throws Exception {

		// 서버 소켓 생성
		ServerSocket server = new ServerSocket(7000);
		System.out.println("[INFO] SERVER SOCKET LISTENING..");
		// 클리이언트로부터 1회 요청을 받아서
		Socket client = server.accept();
		System.out.println("[INFO] SERVER ACCEPT.. CLIENT IP : " + client.getInetAddress());
		
		// 송수신시 -> 분리
		InputStream in = client.getInputStream();
		OutputStream out = client.getOutputStream();
		// 문자열을 받기위한 보조스트림
		DataInputStream din = new DataInputStream(in);
		DataOutputStream dout = new DataOutputStream(out);
		
		// Worker 생성 - 스레드 작업을 할 워크를 만들고 객체 생성부터 작업하기
		ServerRecvThread recv = new ServerRecvThread(din); // 들어오는 데이터 수신용에 input 추가
		ServerSendThread send = new ServerSendThread(dout); // 나가는 데이터 송신용에 output 추가
		
		Thread th1 = new Thread(recv);
		Thread th2 = new Thread(send);
		
		th1.start();
		th2.start();
		
		// main과 worker 스레드 함께 종료시키는 작업
		th1.join();
		th2.join();
		// thread가 끝나는 시점에 자원종료
		dout.close();
		din.close();
		out.close();
		in.close();
		client.close();
		server.close();
		System.out.println("[SERVER] 연결 종료합니다");
		
		
		
		
		
	}

}
