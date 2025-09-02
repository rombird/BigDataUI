package Ch11;

import java.io.DataOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class ServerSendThread implements Runnable {
	// send를 하기 위한 thread 
	
	DataOutputStream dout; // 멤버변수로 지정해줘야 run에서 실행 가능
	Scanner sc = new Scanner(System.in); // 생성되자마자 스캐너 연결

	public ServerSendThread(DataOutputStream dout) {
		this.dout = dout;
	}
	
	// 송신만 담당
	// 입력이 되면 client로 던져주고 샌드로 던져내고 종료가 되면 반복문 종료
	@Override
	public void run() {
		String send = null;
		while (true) {
			try {
			System.out.println("[SERVER (q:종료)] : ");
			send = sc.nextLine(); 
			// Server -> Client(송신)
			dout.writeUTF(send); // send에서 입력한 내용 전달
			dout.flush(); // 버퍼공간 제외
			if (send.equals("q")) 
				break; 
			}catch(Exception e) {
				System.out.println("[EXCEPTION] 예외발생 SEND THREAD 종료");
				break;
			}
		}
		// try{dout.close();}catch(Exception e2) {} -> 자원제거는 ServerMain에서 시행했으므로 
		sc.close();

	}

}
