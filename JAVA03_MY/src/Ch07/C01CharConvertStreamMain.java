package Ch07;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;

public class C01CharConvertStreamMain {

	public static void main(String[] args) throws Exception {
		String str = "문자 변환 스트림 사용!!";

//		OutputStream out = new FileOutputStream("c:\\IOTEST\\test.txt"); // 실행하면 해당 위치에 파일 생성
//		OutputStreamWriter wout = new OutputStreamWriter(out); // output stream(byte)을 캐릭터형으로 변환해서 넣어주는 박업
//		BufferedWriter bout = new BufferedWriter(wout);
//
//		bout.write(str);
//		bout.flush();
//		bout.close();

		InputStream in = new FileInputStream("c:\\IOTEST\\test.txt"); // 폴더에 있는 파일 가져옴
		BufferedInputStream bin =  new BufferedInputStream(in);		// 
		InputStreamReader rin = new InputStreamReader(bin);			// 캐릭터형으로 가져오도록 변환
		while(true) {
			int data = rin.read();
			if(data==-1)
				break;
			System.out.print((char)data);
		}

	}
}
