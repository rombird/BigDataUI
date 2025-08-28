package Ch09;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class C01Client {
	
	public static void main(String[] args) throws UnknownHostException, IOException {
		
		Socket client = new Socket("192.168.5.2", 7000); // 192.168.5.3/ 5.2
		
		InputStream in = client.getInputStream(); 
		DataInputStream din = new DataInputStream(in); // 기존 스트림 연결
		String recv = din.readUTF();
		System.out.println("메시지 : " + recv);
		
		din.close();
		in.close();
		client.close();
	}
}
