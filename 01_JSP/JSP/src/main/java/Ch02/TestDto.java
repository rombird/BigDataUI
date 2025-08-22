package Ch02;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class TestDto {
	private String username;
	private int age;
	private LocalDateTime date;
	// 자료형 때문에 오류가 나는데 -> setAge 자료형 수정, setStringtoDate 함수 만들기
	
	// 디폴트생성자
	public TestDto() {}
	// 모든 인자 생성자
	public TestDto(String username, int age, LocalDateTime date) {
		super();
		this.username = username;
		this.age = age;
		this.date = date;
	}
	// getter and setter
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age; 
	}
	public LocalDateTime getDate() {
		return date;
	}
//	public void setDate(LocalDateTime date) {
//		this.date = date;
//	}
	
	public void setStringtoDate(String date) {
		System.out.println("setStringtoDate : " + date);
		DateTimeFormatter fmtin = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm"); // : 오류를 확인해보면 [2025-08-07T06:53]->이 포맷에 맞게 들어온다
		this.date=LocalDateTime.parse(date,fmtin);
	}
	
	// toString
	@Override
	public String toString() {
		return "TestDto [username=" + username + ", age=" + age + ", date=" + date + "]";
	}

}
