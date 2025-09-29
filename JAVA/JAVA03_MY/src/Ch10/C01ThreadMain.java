package Ch10;

public class C01ThreadMain {

	public static void main(String[] args) throws Exception {
		
		// thread 작업은 main에서 시작하지만 
		// 작업을 따로 분할해서 실행흐름을 가지게 되는데 -> worker thread
		
		for(int i=0;i<5;i++) {
			System.out.println("TASK01...");
			Thread.sleep(500);
		}
		
		// TASK01 실행이 끝나야 TASK02 작업이 실행
		for(int i=0;i<5;i++) {
			System.out.println("TASK02...");
			Thread.sleep(500);
		}

	}

}
