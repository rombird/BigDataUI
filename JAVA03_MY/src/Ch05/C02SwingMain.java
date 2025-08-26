package Ch05;

import javax.swing.JFrame;

class C02GUI extends JFrame{
	C02GUI(String title){ // 창 제목을 외부로 부터 받겠다
		super(title); 
		// 상위클래스에서 썼던 것과 동일하게 사용 가능(상속받았기 때문)
		setBounds(100,100,500,500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true); 
	}
}

public class C02SwingMain {

	public static void main(String[] args) {
		new C02GUI("두번째 프레임창입니다.");

	}

}
