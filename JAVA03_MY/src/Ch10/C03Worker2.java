package Ch10;

public class C03Worker2 implements Runnable {

	C03GUI gui2; // 매개변수

	public C03Worker2(C03GUI c03gui) {
		this.gui2 = c03gui;
	}

	@Override
	public void run() {
		while (true) {
			try {
				gui2.area2.append("TASK02...\n");
				Thread.sleep(600);
			} catch (InterruptedException e) {
				e.printStackTrace();
				break;
			}

		}
		System.out.println("WORKER2 THREAD INTERRUPTED");

	}

}
