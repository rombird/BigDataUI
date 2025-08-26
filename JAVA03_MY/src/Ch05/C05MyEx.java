package Ch05;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

class C05GUI extends JFrame{
	
	C05GUI(String title) {
		super(title);
		
		// Frame Setting
		setBounds(100,100,500,600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// Panel Setting
		JPanel panel = new JPanel();
		panel.setLayout(null);
		
		// Component
		JTextArea area = new JTextArea();
		JScrollPane scroll = new JScrollPane(area);
		scroll.setBounds(10, 10, 300, 300);
		
		JButton btn1 = new JButton("파일로 저장");
		btn1.setBounds(330, 10, 110, 50);
		JButton btn2 = new JButton("1 : 1 요청");
		btn2.setBounds(330, 70, 110, 50);
		JButton btn3 = new JButton("대화기록보기");
		btn3.setBounds(330, 130, 110, 50);
		JButton btn4 = new JButton("입력");
		btn4.setBounds(330, 350, 110, 50);
		
		JTextField txf = new JTextField();
		txf.setBounds(10, 350, 300, 50);
		
		// panel 추가
		panel.add(scroll);
		panel.add(btn1);
		panel.add(btn2);
		panel.add(btn3);
		panel.add(btn4);
		panel.add(txf);
		
		add(panel);
		
		// frame 표시 여부
		setVisible(true);
	}
}

public class C05MyEx {

	public static void main(String[] args) {
		new C05GUI("Chatting Server"); 

	}

}
