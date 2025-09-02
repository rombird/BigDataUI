package Ch10;

public class C03Worker1 implements Runnable {

	C03GUI gui; // 멤버변수
	// C03Worker2 객체 생성시 this 추가하면 자동 생성
	// C03GUI를 받을 생성자 생성
	public C03Worker1(C03GUI c03gui) {
		this.gui = c03gui;
	}

	@Override
	public void run() {
		while(true) {
			try { // 중요 : 중지버튼 누르면 중지 신호가 전달 -> 중지객체(interrupted)만들어짐 
				gui.area1.append("TASK01...\n"); // public 변수 area1이라 접근 가능
				Thread.sleep(500); 
			}catch(InterruptedException e) {
				e.printStackTrace();
				break; // 중지신호가 전달되면 break해서 벗어남
			}
		}
		System.out.println("WORKER01 THREAD INTERRUPTED");
		
		
		
	}

}
