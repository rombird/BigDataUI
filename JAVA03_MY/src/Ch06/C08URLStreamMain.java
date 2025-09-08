package Ch06;

import java.io.BufferedInputStream;
import java.io.FileWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.Writer;
import java.net.URI;
import java.net.URL;

public class C08URLStreamMain {

	public static void main(String[] args) throws Exception {
		
		// 보안상 이슈때문에 URI를 괄호로 묶어서 URL로 변환시키는 작업
		URL url = (new URI("https://m.entertain.naver.com/home/article/117/0003985719")).toURL();
		// URL : http://localhost:8090/JSP/Ch03/... -> 전체경로
		// URI : /JSP/Ch03... 부터 경로만
		InputStream in = url.openStream();
		
		// byte -> char
		// char -> byte 
		// 보조스트림을 덧씌우면 바이트에 있는 걸 캐릭터로 변환해서 가져올 수도있다
		// buffer 받아오는 속도를 향상 시킬 수 있음
		// 보조스트림
		BufferedInputStream buffIn = new BufferedInputStream(in); 	// 보조스트림(버퍼공간)추가 -> 속도를 향샹시키는 작업
		Reader rin = new InputStreamReader(buffIn);	// byte단위를 -> char단위로 변환할 준비
		// 1byte 단위로 읽어들이는 InputStream -> 2byte단위(문자단위로)
		
		Writer fout = new FileWriter("c:\\IOTEST\\index.html"); // new 기사를 index.html로 파일생성
		
		// 문자단위로 하나씩 받아서 console 출력 
		while(true) {
			int data = rin.read(); // char단위로 한글자씩 받아서
			if(data==-1)
				break;
//			System.out.print((char)data);
			fout.write((char)data);
			fout.flush(); // write쓰고 flush
		}
		fout.close();
		rin.close();
		buffIn.close();
		in.close();
		
		
		
	}

}
