package Ch06;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Writer;

public class C07FileCopyMain {

	private static final String PATH = "c:\\IOTEST\\"; // 기본경로

	public static void main(String[] args) throws Exception {
		// args[0] : 원본 파일 경로(원본 파일명)
		// args[1] : 복사 대상 경로(복사 파일명)

		InputStream fin = new FileInputStream(PATH + args[0]); 
		OutputStream fout = new FileOutputStream(PATH + args[1]);
		
		long startTime = System.currentTimeMillis();
		byte [] buff = new byte[4096];
		
		while (true) {
			int data = fin.read(buff); // buff사이즈로 받아내겠다고 하는 순간 얼마만큼의 바이트수를 읽었는지 
			if (data == -1)
				break; 
			fout.write(buff, 0, data); // point!! 
			fout.flush(); 
		}
		fout.close();
		fin.close();
		
		long endTime = System.currentTimeMillis();
		System.out.println("소요시간 : " + (endTime-startTime)+ "ms");

	}

}
