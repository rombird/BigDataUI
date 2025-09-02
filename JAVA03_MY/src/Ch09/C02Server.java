package Ch09;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class C02Server {

	public static void main(String[] args) throws IOException {
		
		// 서버 소켓 생성
		ServerSocket server = new ServerSocket(7000);
		System.out.println("[INFO] SERVER SOCKET LISTENING..");
		// 클리이언트 소켓 생성
		Socket client = server.accept();
		System.out.println("[INFO] SERVER ACCEPT.. CLIENT IP : " + client.getInetAddress());
		// 서로 내용을 교환하기 위해 inoutstream을 꺼내올 작업
		InputStream in = client.getInputStream();
		OutputStream out = client.getOutputStream();
		// in, outstream을 그냥 쓰면 바이트형태기 때문에 문자(데이터)가 깨지는 경우가 생김 -> 보조 스트림사용
		DataInputStream din = new DataInputStream(in);
		DataOutputStream dout = new DataOutputStream(out);
		// 내용을 주고 받기위해 무한루프 생성
		// 키보드로부터 내용을 받아서 client로 던지는 순서
		Scanner sc = new Scanner(System.in);
		String recv = null; // 수신용
		String send = null; // 송신용
		while(true) {
			
			// Server가 키보드로 부터 입력을 하고 dout.wirte로 전달 
			// -> Client가 din.read(내용을 읽고), dout.write(쓰기) 
			// -> Server din.read() 작업
			
			System.out.println("[SERVER (q:종료)] : ");
			send = sc.nextLine(); // 공백을 포함한 문자를 받음
			// Server -> Client(송신)
			dout.writeUTF(send); // send에서 입력한 내용 전달
			dout.flush(); // 버퍼공간 제외
			if(send.equals("q")) // q를 보내고 나서 flush를 하고 나가는 순서
				break; // 내가 q를 입력했거나 상대방이 q를 입력했을 때 나왔다는 얘기
			
			// Client -> Server(수신)
			recv = din.readUTF();
			if(recv.equals("q"))
				break;
			System.out.println("[CLIENT] : " + recv);
		}
		
		sc.close();
		dout.close();
		din.close();
		out.close();
		in.close();
		client.close();
		server.close();
		System.out.println("[SERVER] 연결 종료합니다");
		
	}

}
