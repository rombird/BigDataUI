package Ch05;

import javax.swing.JFrame;

public class C01SwingMain {

	public static void main(String[] args) {
		
		// 참고
		JFrame frame = new JFrame("첫번째 프레임입니다.");
		frame.setBounds(100,100,500,500); // 위치-(x축, y축, width, height)
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // x버튼 눌러도 시스템 종료될 수 있도록 (이 코드 없으면 계속 실행중 상태)
		frame.setVisible(true);
		
	}

}
