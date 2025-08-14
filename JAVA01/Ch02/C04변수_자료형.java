package Ch02;

import java.nio.charset.StandardCharsets;

public class C04변수_자료형 {

	public static void main(String[] args) {
		
		// 정수 int - 4byte 정수 부호 o
		// --------------------------
//		int n1 = 0b10101101;  // 2진수값
//		int n2 = 173; 	// 10진정수값
//		int n3 = 0255;	// 8진수
//		int n4 = 0Xad; 	// 16진수
//		System.out.printf("%d %d %d %d\n", n1,n2,n3,n4); 
		// 동일한 값이라 따로 상수 Pool에 만드는 게 아니라 한 값을 계속 사용
		
		// 정수 byte - 1byte 정수 부호 o
		// ---------------------------
//		byte n5 = (byte)-129; 	// byte n5 = -129; -> 자료형 일치하지 않음 억지로 자료형 같도록 일치시켜줌
//		byte n6 = -30;			// 자동으로 형변환됨
//		byte n7 = 30;
//		byte n8 = 127;
//		byte n9 = (byte)129;		
		// 자동으로 형변환 X -> 왜? 컴파일 에러가? byte가 가지고 있는 size 한계 때문에
//		byte -128 ~ 127까지 저장되므로 이 범위 안에 없는 값은 에러를 띄움
//		System.out.println("n5 : " + n5); 
//		System.out.println("n9 : " + n9);
//		System.out.println(0b10101101); // 128+32+8+4+1 저장 -> int로
//		System.out.println(Integer.toBinaryString(-129)); // int형으로 저장 4byte 공간에 이런식으로 저장됨

		// n5
//		// int 부호 지원 (양수, 음수)
//		// 00000000	00000000	00000000	00000000
//		// 00000000	00000000	00000000	10000001 (129)
//		// 11111111	11111111	11111111	01111110 (-130)
//		// 11111111	11111111	11111111	01111111 (-129)
//		// byte 부호 지원(양수, 음수)
//		// 01111111 (byte로 저장하면 1byte만 남게되므로 나머지는 저장 안됨)
		
//		// 정수 short-2byte정수 부호 O) | char-2byte정수 부호 X(양수만)
//		// 2byte 2^16 (-32768 ~ 32767 |  0 ~ 65535(2^16-1)
//		// ---------------------------------------------------
//		char n1 = 65535;
//		short n2 = 32767;
//		
//		char n3 = 60000;
//		short n4 = (short) n3;
//		System.out.printf("%d\n", n4);
		
		// 정수 long-8byte 정수 부호 O
		// L, l(리터럴 접미사) : long 자료형 사용하여 값 저장
		// -----------------------------------------------------
//		long n1 = 10000000000L; // 2^31까지는 범위 안에 속함 so, 10000000000은 범위 밖이라 에러 -> 접미사 붙여줘야 큰 값 사용 가능
//		long n2 = 20; 
//		
//		long n3 = 10000000000L;
//		long n4 = 10000000000l;
	
		
		// 실수
		// -------------------------
		// 유리수와 무리수의 통칭
		// 소수점이하값을 가지는 수 123.456
		// float : 4byte 실수(소수점 아래 6-9자리 - 소수점 아래 6자리까지만 유효하다고 생각)
		// double : 8byte 실수(소수점 아래 15-18자리), 기본자료형
		
//		// 정밀도 확인
//		float n1 = 0.123456789123456789F; // f, F : float형 접미사
//		double n2 = 0.123456789123456789;
//		
//		System.out.println(n1);
//		System.out.println(n2);
//		
//		// 오차 확인
//		float num = 0.1F;
//		for(int i=0;i<=1E5;i++) {
//			num=num+0.1F;
//			System.out.println(i);
//		}
//		System.out.println("num : " + num); // 초기값 0.1이 100000번 반복했을 때 누적 -> 10000이 나와야하는데 9998.756 근사값으로 출력됨
		
		// 단일문자 char 2byte 정수
		// 아스키코드로 숫자형으로 전환도 가능 -> 연산 가능
		// -------------------------
//		char ch1 = 'a';
//		System.out.println(ch1);							// a
//		System.out.println((int)ch1);						// 97
//		System.out.println(Integer.toBinaryString(ch1));	// 1100001
//		
//		System.out.println("----------------");
//		char ch2 = 98;
//		System.out.println(ch2);							// b
//		System.out.println((int)ch2);						// 98
//		System.out.println(Integer.toBinaryString(ch2)); 	// 1100010
//		
//		System.out.println("----------------");
//		char ch3 = 'b' + 1; 
//		System.out.println(ch3);							// c
//		System.out.println((int)ch3);						// 99
//		System.out.println(Integer.toBinaryString(ch3)); 	// 1100011
//		
//		System.out.println("----------------");
//		// UTF-8(8bit) 한글코드표 참고 
//		char ch4 = 0xac02;
//		System.out.println(ch4);							// 갂
//		System.out.println((int)ch4);						// 44034
//		System.out.println(Integer.toBinaryString(ch4)); 	// 1010110000000010 (2byte)
//		
//		System.out.println("----------------");
//		// \\u : 유니코드 이스케이프 문자
//		System.out.printf("%c\n", 0xac03); 					// 갃
//		System.out.printf("%c\n", '\uac03'); // 단일문자도 숫자 취급 가능 -> 연산 가능 
		
		// boolean : 논리형(true/false 저장)
		// ------------------------------
//		boolean flag = (10>11); 	// 참(긍정)
//		if(flag)
//		{
//			System.out.println("참인 경우 실행");
//		}
//		{
//			System.out.println("거짓인 경우 실행");
//		}
		
		// 문자열 : string(클래스 자료형)
		// ---------------------------
		// 기본 자료형(원시타입)
//		byte n1;
//		short n2;
//		double n3;
//		long n4;
		
		// 클래스 자료형
		// 클래스 자료형으로 만든 변수는 '참조변수'라고 하고 
		// 참조변수는 데이터가 저장된 위치정보(메모리주소값)이 저장된다.
		int n1 = 10;
		byte n2 = 20;
		char n3 = 40;
		
		String name ="홍길동"; // 리터럴 -> 상수 Pool에 저장, 홍길동의 저장위치(홍길동자체가 저장된게 아니라)
		String job = "프로게이머"; 
		System.out.println(name);
		System.out.println(job);
		
		// ""(문자열에 갇혀있는 문자의) 한글자당 3byte 홍길동 -> 9byte
		System.out.println("UTF-8 기준 지정 크기: " + name.getBytes(StandardCharsets.UTF_8).length);
		System.out.println("UTF-8 기준 지정 크기: " + job.getBytes(StandardCharsets.UTF_8).length);
		
		// 사이즈 확인
		char ch ='홍'; 	// 16bit == 2byte 사용
		String str="홍"; // 24bit == 3byte 사용
		System.out.println("ch 실제 크기(bit):" + Integer.toBinaryString(ch).length());
		System.out.println("str 실제 크기(bit):" + str.getBytes(StandardCharsets.UTF_8).length);
		
	}

}
