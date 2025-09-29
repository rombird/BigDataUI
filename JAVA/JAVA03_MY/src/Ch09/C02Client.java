package Ch09;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class C02Client {

	public static void main(String[] args) throws Exception {

		Socket client = new Socket("SERVERIP", 700);
		System.out.println("SERVER와 연결되었습니다.");
		// inoutstream
		InputStream in = client.getInputStream();
		OutputStream out = client.getOutputStream();
		// 보조스트림
		DataInputStream din = new DataInputStream(in);
		DataOutputStream dout = new DataOutputStream(out);
		// client도 전달할 내용이 있으니까 스캐너
		Scanner sc = new Scanner(System.in);
		String recv = null; // 수신용
		String send = null; // 송신용
		// 무한루프생성
		// client는 먼저 내용을 받는다는 설정을 했기 때문에 순서 잘 생각해서 설정
		while (true) {

			// Server -> Client(수신)
			recv = din.readUTF();
			if (recv.equals("q"))
				break;
			System.out.println("[SERVER] : " + recv);
			// 
			System.out.println("[CLIENT (q:종료)] : ");
			send = sc.nextLine(); 
			// Client -> Server (송신)
			dout.writeUTF(send); 
			dout.flush(); 
			if (send.equals("q")) 
				break; 

		}
		sc.close();
		dout.close();
		din.close();
		out.close();
		in.close();
		client.close();
		System.out.println("[CLIENT] 연결 종료합니다");
	}

}
