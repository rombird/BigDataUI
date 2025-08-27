package Ch06;

import java.io.FileOutputStream;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;

public class C06FileOutStreamMain {

	public static void main(String[] args) throws Exception {
		
		OutputStream fout = new FileOutputStream("c:\\IOTEST\\test6.txt");
		fout.write("가나다".getBytes(StandardCharsets.UTF_8)); 
		// unicode문자셋을 잘 변환해줘야 한글 잘 들어간 걸 확인, 그렇지 않으면 바이트단위로 나눠버리기때문에 알 수 없는 문자기 입력됨
		fout.write('a');
		fout.write('b');
		fout.write('c');
		fout.flush();
		fout.close();

	}

}
