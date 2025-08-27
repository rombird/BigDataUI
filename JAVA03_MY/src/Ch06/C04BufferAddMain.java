package Ch06;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class C04BufferAddMain {
	
	public static void main(String[] args) throws IOException {
		
		Reader fin = new FileReader("c:\\IOTEST\\origin.txt");
		
		long startTime = System.currentTimeMillis(); // 시작시간
		
		StringBuffer strBuffer = new StringBuffer(); // 문자를 덧붙일 때 사용(이렇게 하지 않으면 덧붙이는 과정에서 메모리공간 계속 생성)
		
		char [] buff = new char[4096]; // 데이터사이즈가 4096보다 커져있어야 받아낼 수 있음
		
//		int data;
//		while((data = fin.read(buff)) != -1) { // buff를 쓰면 시간이 많이 줄어듦
////			System.out.print((char)data); // 내용이 많으면 console 창에서 다 받아내지 못함
//			strBuffer.append((char)data);
//		}
		
		while(true) {
			int data = fin.read(buff); 
			if(data==-1)
				break;
			strBuffer.append((char)data);
		}
		
		System.out.println("총 길이 : " + strBuffer.length());
		
		fin.close();
		
		long endTime = System.currentTimeMillis(); // 종료시간
		System.out.println("소요시간 : " + (endTime-startTime)+ "ms");
	}

}
