package Ch06;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

public class C03FileCopyMain {
	
	private static final String PATH="c:\\IOTEST\\"; // 기본경로

	public static void main(String[] args) throws Exception {
		// args[0] : 원본 파일 경로(원본 파일명)
		// args[1] : 복사 대상 경로(복사 파일명)
		
		// IOTEST에 있는 파일 복사
		Reader fin = new FileReader(PATH + args[0]); // origin으로 데이터를 받아서 받은 데이터를 fout방향으로 저장
		Writer fout = new FileWriter(PATH + args[1]);
		
		while(true) {
			int data = fin.read(); // 한 문자씩 읽어서
			if(data==-1)
				break; // 더이상 읽을 문자가 없으면 나가고
			fout.write((char)data); // 그게 아니면 out방향으로 저장
			fout.flush(); // 한 번 write하고 반드시 비워주는 작업
		}
		fout.close();
		fin.close();
		
		
	}

}
