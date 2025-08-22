package Ch01;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class C07LocalDateTimeFormatMain {

	public static void main(String[] args) {
		
		// 1 날짜만
//		Scanner sc = new Scanner(System.in);
//		System.out.print("YYYY/MM/DD 입력 : ");
//		String ymd = sc.next();
//		
//		// 포매터 객체 생성(입력용)
//		// DateTimeFormatter : LocalDate용 포맷
//		DateTimeFormatter fmtin = DateTimeFormatter.ofPattern("yyyy/MM/dd");
//		LocalDate date = LocalDate.parse(ymd, fmtin); 	// localdate 형태로 처리
//		System.out.println(date);
//		
//		// 포매터 객체 생성(출력용)
//		DateTimeFormatter fmtout = DateTimeFormatter.ofPattern("yyyy.MM.dd");
//		System.out.println("출력 포맷 : " + fmtout.format(date));
		
		// 2 날짜와 시간 같이 
		Scanner sc = new Scanner(System.in);
		System.out.print("YYYY/MM/DD HH:MM:SS 입력 : ");
		String ymd = sc.next();
		
		// 포매터 객체 생성(입력용)
		DateTimeFormatter fmtin = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss"); 
		LocalDateTime date = LocalDateTime.parse(ymd, fmtin); 	// 문자열이 포맷에 맞게 들어왔는지
		System.out.println(date);
		
		// 포매터 객체 생성(출력용)
		DateTimeFormatter fmtout = DateTimeFormatter.ofPattern("yyyy-MM-dd HH-mm-ss");
		System.out.println("출력 포맷 : " + fmtout.format(date));
		
	}

}
