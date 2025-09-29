package Ch11;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ClientMain {

	public static void main(String[] args) throws Exception {
		
		Socket client = new Socket("192.168.5.", 700);
		System.out.println("SERVER와 연결되었습니다.");

		// 송수신시 -> 분리
		InputStream in = client.getInputStream();
		OutputStream out = client.getOutputStream();
		// 문자열을 받기위한 보조스트림
		DataInputStream din = new DataInputStream(in);
		DataOutputStream dout = new DataOutputStream(out);

		// Worker 생성 - 스레드 작업을 할 워크를 만들고 객체 생성부터 작업하기
		ClientRecvThread recv = new ClientRecvThread(din); // 
		ClientSendThread send = new ClientSendThread(dout); // 

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
		
		System.out.println("[CLIENT] 연결 종료합니다");

	}

}
