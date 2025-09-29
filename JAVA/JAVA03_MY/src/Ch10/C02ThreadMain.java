package Ch10;

public class C02ThreadMain {
	
	public static void main(String[] args) {
		
		// Runnable interface를 이용한 스레드 분할
		// Worker1, 2번 만드는 작업 -> 따로 할 클래스 생성 -> implements Runnable 추가

		// 01
		C02Worker1 w1 = new C02Worker1();
		C02Worker2 w2 = new C02Worker2();
		
		// 02
		Thread th1 = new Thread(w1);
		Thread th2 = new Thread(w2);

		// 03 - thread 분리되어 실행
		th1.start();
		th2.start();
		
		// Thread class를 바로 이용한 스레드 분할
		new Thread() {
			
			// thread에서 runnable을 구현이 된 상태 -> source -> override... -> run 체크 
			@Override
			public void run() {
				for(int i=0;i<5;i++) {
					System.out.println("TASK03...");
					
					try {
						Thread.sleep(600);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
			
		}.start();
		
		
	
	}
}
