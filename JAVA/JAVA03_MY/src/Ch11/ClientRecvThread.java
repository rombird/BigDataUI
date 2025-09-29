package Ch11;

import java.io.DataInputStream;

public class ClientRecvThread implements Runnable {
	
	DataInputStream din;
	
	public ClientRecvThread(DataInputStream din) {
		this.din = din;
	}

	@Override
	public void run() {
		String recv = null;
		while (true) {
			try {
				// Server -> Client 
				recv = din.readUTF();
				if(recv.equals("q"))
					break;
				System.out.println("[SERVER] : " + recv); // 받은 내용을 콘솔창에 출력
			}catch(Exception e) {
				System.out.println("[EXCEPTION] 예외발생 RECV THREAD 종료");
				break;
			}
		}
		
	}
	

}
