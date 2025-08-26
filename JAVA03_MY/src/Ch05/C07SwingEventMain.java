package Ch05;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.text.BadLocationException;


// KeyListener, MouseListener 추가
class GUI extends JFrame implements ActionListener, KeyListener, MouseListener{
	JButton btn1;
	JButton btn2;
	JButton btn3;
	JButton btn4;
	JTextArea area;
	JTextField txt1;
	
	public GUI(String title){
		//frame
		super(title);
		setBounds(100,100,410,400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//Panel
		JPanel panel = new JPanel();
		panel.setLayout(null);
		
		
		//Component 참조변수명
		area = new JTextArea(); //textarea = area1
		// area.setBounds(10,10,260,280);
		//textarea's scroll = scroll1
		JScrollPane scroll1 = new JScrollPane(area);
		scroll1.setBounds(10,10,250,280);
		
		btn1 = new JButton("파일로저장");//파일로저장 : btn1
		btn1.setBounds(270,10,110,30);
		
		btn2 = new JButton("1:1요청");//1:1요청 : btn2
		btn2.setBounds(270,50,110,30);
		
		btn3 = new JButton("대화기록보기");//대화기록보기 : btn3
		btn3.setBounds(270,90,110,30);
		
		btn4 = new JButton("입력"); //입력 : input
		btn4.setBounds(270,300,110,30);
		
		
		txt1 = new JTextField(); //textfield : txt1
		txt1.setBounds(10,300,250,30);
		
		// Event 처리
		btn1.addActionListener(this);
		btn2.addActionListener(this);
		btn3.addActionListener(this);
		btn4.addActionListener(this);
		txt1.addKeyListener(this); 
		area.addMouseListener(this);
		
		// Panel(component)
//		panel.add(area1);
		panel.add(scroll1);
		panel.add(btn1);
		panel.add(btn2);
		panel.add(btn3);
		panel.add(btn4);
		panel.add(txt1);
		
		//frame(panel)
		add(panel);

		//frame
		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {

//		System.out.println("클릭!");
		if(e.getSource()==btn1) {
			System.out.println("파일로 저장 버튼 클릭");
		}else if(e.getSource()==btn2) {
			System.out.println("1 : 1 요청 클릭 버튼 클릭");
		}else if(e.getSource()==btn3) {
			System.out.println("대화기록보기 버튼 클릭");
		}else if(e.getSource()==btn4) {
			System.out.println("입력 버튼 클릭");
		}
	}
	
	// keyListener : GUI -> 마우스 갖다대면 -> Add 
	@Override
	public void keyTyped(KeyEvent e) {
		// 눌렀다가 떼는 순간
//		System.out.println("keyTyped..." + e.getKeyChar());
//		System.out.println("keyTyped..." + e.getKeyCode()); // keyCode 0으로 알수없음
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// 사용자가 키를 누르는 순간
//		System.out.println("keyPressed..." + e.getKeyChar());
//		System.out.println("keyPressed..." + e.getKeyCode()); 
		if(e.getKeyCode()==10) { // e.getKeyCode==10 : enter값
			String message = txt1.getText();
			System.out.println("message : " + message); // textfield에 입력하고 enter -> message
			area.append(message+"\n"); // message가 area에 추가(데이터 계속 저장)
			txt1.setText(""); 
		}
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// 사용자가 키를 떼는 순간
//		System.out.println("keyReleased..." + e.getKeyChar());
//		System.out.println("keyReleased..." + e.getKeyCode()); 
//		
	}

	// 마우스 리스너
	@Override
	public void mouseClicked(MouseEvent e) {
		try {
			System.out.println("클릭됨!");
			 // 커서가 있는 위치가 숫자형태로 나타남 첫부분 0
			int offset = area.viewToModel(e.getPoint());
			System.out.println("offset : " + offset); 
			
			// 행 위치 0번째 부터 시작
			int row = area.getLineOfOffset(offset); 
			System.out.println("row : " + row);
			
			// 해당 행의 내용 전부 불러올 수 있도록
			int startOffset = area.getLineStartOffset(row);
			int endOffset = area.getLineEndOffset(row);
			System.out.printf("start : %d - end : %d\n", startOffset, endOffset);
			String str =area.getText(startOffset, endOffset-startOffset);
			System.out.println("str : " + str);
		} catch (Exception e2) {
			e2.printStackTrace();
		}
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	
}

public class C07SwingEventMain {

	public static void main(String[] args) {
		new GUI("Chatting");

	}

}
