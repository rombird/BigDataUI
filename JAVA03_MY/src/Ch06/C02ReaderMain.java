package Ch06;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class C02ReaderMain {
	
	// main을 실행하는 위치는 운영체제 -> 운영체제에 예외처리를 던져버리는 거라 예외처리를 하지 않는 것과 마찬가지
	public static void main(String[] args) throws IOException {
		// 만들어져있는 파일을 자바로 가져오기 
		Reader fin = new FileReader("c:\\IOTEST\\test1.txt");
		
		// 1. 
//		while(true) {
//			int data = fin.read(); // data는 유니코드로 받기 때문에 int, read에 마우스 가져다대면 -> 정상적인 코드면 0~65535 반환, 잘못된 문자면(더 이상 읽을 문자가 없으면) -1 반환
//			if(data==-1)
//				break;
//			System.out.print((char)data); // 캐릭터로 형변환을 해야 원래의 문자대로 보임	
//		}
		
		// 2. 1번을 보다 쉽게 표현
		int data;
		while((data = fin.read()) != -1) {
			System.out.print((char)data); 
		}
		
		// 끝나면 종료작업
		fin.close();
		
		
	}

}
