package Ch11;

import java.io.DataInputStream;

public class ServerRecvThread implements Runnable{

	// 수신용 stream
	DataInputStream din;
	public ServerRecvThread(DataInputStream din) {
		this.din = din; // din에 외부로부터 받은 din을 연결
	}

	@Override
	public void run() {
		String recv = null;
		while (true) {
			try {
				// Client -> Server(수신)
				recv = din.readUTF();
				if(recv.equals("q"))
					break;
				System.out.println("[CLIENT] : " + recv); // 받은 내용을 콘솔창에 출력
			}catch(Exception e) {
				System.out.println("[EXCEPTION] 예외발생 RECV THREAD 종료");
				break;
			}
		}
		// try{din.close();}catch(Exception e2) {} -> 자원제거는 ServerMain에서 시행했으므로
		
	}

}
