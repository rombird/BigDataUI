package Ch05;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

class C04GUI extends JFrame{
	C04GUI(String title){ 
		
		// Frame Setting
		super(title); 
		setBounds(100,100,500,500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// Panel Setting
		JPanel panel = new JPanel();
//		Color col = new Color(255,255,0);
//		panel.setBackground(col);
		panel.setLayout(null); // 이 코드가 있어야 지정한 버튼 위치가 바뀜(없으면 버튼 상단 중간에 위치되어짐)
		
		// Component Setting
		JButton btn1 = new JButton("BTN01"); // btn1 추가
		btn1.setBounds(10, 10, 100, 30); // 버튼 위치
		JButton btn2 = new JButton("BTN02"); // btn2 추가
		btn2.setBounds(120, 10, 100, 30);
		JTextField txt1 = new JTextField(); // textfield 추가
		txt1.setBounds(10, 50, 210, 30);
		JTextArea area1 = new JTextArea(); // textarea 추가
//		area1.setBounds(10, 90, 210, 300);
		JScrollPane scroll1 = new JScrollPane(area1);
		scroll1.setBounds(10, 90, 210, 300); // area를 포함하고 있기 때문에 area의 setbound X
		
		// Panel에 Component 추가
		panel.add(btn1);
		panel.add(btn2);
		panel.add(txt1);
//		panel.add(area1);
		panel.add(scroll1); 
		
		// Frame에 Panel 추가
		add(panel); 
		
		// Frame 표시 여부
		setVisible(true); // 마지막에 해야 Frame 잘 보여짐
	}
}

public class C04SwingMain {

	public static void main(String[] args) {
		new C04GUI("네번째 프레임창입니다.");

	}

}
