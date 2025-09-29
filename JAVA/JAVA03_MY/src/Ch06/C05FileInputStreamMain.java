package Ch06;

import java.io.FileInputStream;
import java.io.InputStream;

public class C05FileInputStreamMain {

	public static void main(String[] args) throws Exception {
		// byte 단위 스트림 - 모든 파일 받아올 수 있음
		
		InputStream fin = new FileInputStream("c:\\IOTEST\\test.pdf");
		
		long startTime = System.currentTimeMillis();
		StringBuffer stringBuffer = new StringBuffer();
		byte[] buff = new byte[4096];
		while(true) { 
			// fin.read() -> 한글자한글자를 읽어들이는 방법
			int data = fin.read(buff); // byte로 받아서 int로 읽는다 -> buff추가시 시간 단축됨
			if(data==-1)
				break;
//			System.out.print((char)data); // binary파일을 char로 여는건 정상적인 실행 X
//			stringBuffer.append((char)data);
			stringBuffer.append(buff);
		}
		System.out.println("총길이 : " + stringBuffer.length());
		fin.close();
		
		long endTime = System.currentTimeMillis();
		System.out.println("소요시간 : " + (endTime-startTime)+ "ms");
	}

}
