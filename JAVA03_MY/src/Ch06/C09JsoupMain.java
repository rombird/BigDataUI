package Ch06;

import java.io.BufferedInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.UUID;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class C09JsoupMain {

	public static void main(String[] args) throws IOException, URISyntaxException {
		
		// URL 연결 - 기본 옵션
		// 브라우저 정보 set
		Connection conn = 
		Jsoup.connect("https://op.gg/lol/champions") 		// 크롤링할 URL을 지정
			 .userAgent("Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/139.0.0.0 Safari/537.36") 	// 브라우저 정보
			 .timeout(5000)		// timeout 값
			 .ignoreHttpErrors(true) 	// 예외처리없이 실행할건지
			 .followRedirects(true); 	
		
		// DOM 객체 받기
		Document document = conn.get(); // 문서요청
//		System.out.println(document);
		Elements elements = document.getElementsByTag("img"); // <img>태그만 
		System.out.println("총 img size : " + elements.size()); 
		// elements는 컬렉션
		for(Element el : elements) {
//			System.out.println(el); // img 태그 전체 출력 -> src 경로 잘 가져오면 이미지 파일로 만들 수 있음
			String img_url = el.getElementsByAttribute("src").attr("src"); // img 태그의 src 추출
			System.out.println(img_url); // src만 출력됨을 확인
			
			URL url = (new URI(img_url)).toURL(); // img_url 브라우저에 연결할 준비
			InputStream in = url.openStream();
			
			// 보조스트림 - 속도를 향상시키기 위한 코드 추가
			BufferedInputStream buffIn = new BufferedInputStream(in); 
			
			OutputStream out = null;
			if(img_url.contains(".png"))
				// 단일확장자명으로(png, svg 확장자가 다양하지만 일단 png로)
				out = new FileOutputStream("c:\\IOTEST\\" + UUID.randomUUID() + ".png"); // 기본으로 제공하는 랜덤값을 받아 파일명 저장
			else if(img_url.contains(".svg"))
				out = new FileOutputStream("c:\\IOTEST\\" + UUID.randomUUID() + ".svg"); // 바이너리로 바뀌는 과정에서 svg는 에러가 남 -> 문자열 그대로 받아내는 작업 필요
			else if(img_url.contains(".webp"))
				out = new FileOutputStream("c:\\IOTEST\\" + UUID.randomUUID() + ".webp");
			else if(img_url.contains(".jpg"))
				out = new FileOutputStream("c:\\IOTEST\\" + UUID.randomUUID() + ".jpg");
			
			while(true) {
				int data = buffIn.read();
				if(data==-1)
					break;
				out.write((byte)data); // data !== -1이 아니라면 
				out.flush();
				
			}
			out.close();
			buffIn.close();
			in.close();
			
		}
		
		
	}

}
