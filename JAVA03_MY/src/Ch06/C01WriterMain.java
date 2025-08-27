package Ch06;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class C01WriterMain {

	public static void main(String[] args) throws IOException{
		// 문자형태의 스트림 FileWriter
		// 구분자 기호 - '\\'
		// Writer fout = new FileWriter("c:\\IOTEST\\test1.txt", false); // 기존 내용 덮어쓰기
		Writer fout = new FileWriter("c:\\IOTEST\\test1.txt", true); // 실행할수록 처음 생성된 내용에 추가하기 
		// 전달할 내용
		fout.write("TEST1\n");
		fout.write("TEST2\n");
		fout.write("TEST3\n");
		
		// 중요 - flush() <- out 할 때 버퍼공간을 초기화시키는 작업
		fout.flush();
		fout.close();
	}

}
