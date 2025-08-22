package Ch01;

import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Date;

public class C05DateCalendarMain {

	public static void main(String[] args) {
		// Date
//		Date d1 = new Date(); // new -> 데이터 사용
//		System.out.println(d1); // Fri Aug 22 10:36:15 GMT+09:00 2025
//		System.out.println(d1.getYear()+1900);  
//		System.out.println(d1.getMonth()+1);	// 0부터 시작해서 1을 꼭 더해주기
//		System.out.println(d1.getDay());		// 0-6(일-토)
//		System.out.println(d1.getHours());		
//		System.out.println(d1.getMinutes());	
//		System.out.println(d1.getSeconds());	
//		System.out.println(d1.getTime());		// 1755826575603 // 타임스탬프(HH:mm:ss -> 초단위로 묶어서 표시)
		
		// Calendar
		Calendar cal = Calendar.getInstance(); // 싱글턴패턴 - 계속해서 시간을 확인해야하는 경우(실시간)에는 Date는 비효율적
		System.out.println(cal);
		System.out.println(cal.get(Calendar.YEAR));			
		System.out.println(cal.get(Calendar.MONTH)+1);		
		System.out.println(cal.get(Calendar.DAY_OF_MONTH)); 
		System.out.println(cal.get(Calendar.DAY_OF_WEEK)); 	// 요일 - 1 ~ 7(일 ~ 토)
		System.out.println(cal.get(Calendar.HOUR_OF_DAY));	
		System.out.println(cal.get(Calendar.MINUTE));		
		System.out.println(cal.get(Calendar.SECOND));		
		
		// LocalDateTime (중요)**
		LocalDateTime now = LocalDateTime.now(); // 객체 생성 X
		// 연, 월, 일, 시, 분, 초 가져오기
		int year = now.getYear();
		int month = now.getMonthValue();
		int day = now.getDayOfMonth();
		int hour = now.getHour();
		int minute = now.getMinute();
		int second = now.getSecond();
		DayOfWeek dayOfWeek = now.getDayOfWeek();
		// 결과 출력
		System.out.println("연 : " + year);
		System.out.println("월 : " + month);
		System.out.println("일 : " + day);
		System.out.println("시 : " + hour);
		System.out.println("분 : " + minute);
		System.out.println("초 : " + second);
		System.out.println("요일 : " + dayOfWeek);
		
	}

}
