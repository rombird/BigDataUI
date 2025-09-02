//package Ch10;
//
//class IncrementThread implements Runnable {
//	private static int counter = 0; // 공유하는 메모리공간
//
//	public int getCounter() { // private하기 때문에 꺼내는 작업
//		return counter;
//	}
//
//	@Override
//	public void run() {
//		for (int i = 0; i < 100000; i++) { // thread가 4개 니까 400000 나와야함(But, 동시에 접근하는 하는 과정도 있기 때문에 실행할때 마다 값이 조금씩 달라짐 400000보다 약간 적은 수 출력됨)
//			counter++; // 공유변수값증가 
//			System.out.println(Thread.currentThread().getName() + "s counter : " + counter);
//		}
//	}
//
//}
//
//public class C04ThreadMain_Ex_문제코드 {
//
//	public static void main(String[] args) throws InterruptedException {
//
//		// main에서 increment thread 생성
//		IncrementThread incrementThread1 = new IncrementThread();
//		IncrementThread incrementThread2 = new IncrementThread();
//		IncrementThread incrementThread3 = new IncrementThread();
//		IncrementThread incrementThread4 = new IncrementThread();
//
//		Thread thread1 = new Thread(incrementThread1);
//		Thread thread2 = new Thread(incrementThread2);
//		Thread thread3 = new Thread(incrementThread3);
//		Thread thread4 = new Thread(incrementThread3);
//
//		thread1.setName("TH1");
//		thread2.setName("TH2");
//		thread3.setName("TH3");
//		thread4.setName("TH4");
//		
//		// 실행
//		thread1.start();
//		thread2.start();
//		thread3.start();
//		thread4.start();
//		
//		//메인 스레드가 thread1,thread2의 작업이 모두 완료될 때까지 대기하도록 설정
//		thread1.join();
//		thread2.join();
//		thread3.join();
//		thread4.join();
//		// 마지막 값 확인
//		System.out.println("Final value: " + incrementThread1.getCounter());
//
//	}
//}
