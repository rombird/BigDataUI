package Ch06;

import java.util.Scanner;

public class C01IF {

	public static void main(String[] args) {
		// 단순 IF
		// -----------------
//		Scanner sc = new Scanner(System.in);
//		System.out.print("나이 : ");
//		int age = sc.nextInt();
//		if(age >= 8)
//			System.out.println("학교에 다닙니다.");
//		
//		System.out.println("첫번째 IF 코드블럭 종료..");
//		
//		if(age<8)
//			System.out.println("학교에 다니지 않습니다.");
//		
//		System.out.println("두번째 IF 코드블럭 종료...");
//		System.out.println("프로그램을 종료합니다");
//		sc.close();
		
		// IF-ELSE
		// --------------------
//		Scanner sc = new Scanner(System.in);
//		System.out.print("나이 : ");
//		int age = sc.nextInt();
//		if(age>=8)
//			System.out.println("학교에 다닙니다.");
//		else
//			System.out.println("학교에 다니지 않습니다.");
//		System.out.println("프로그램을 종료합니다.");
//		sc.close();
		
		// 1. 문제
		// --------------------------
		// 정수 한개값을 입력받아 3의 배수이면 해당 수를 출력하세요
		// 3의 배수이면서 5의 배수라면 출력 - 순서도도 그려보세요
		
//		Scanner sc = new Scanner(System.in);
//		System.out.print("정수 입력 :");
//		int num = sc.nextInt();
//		
//		if(num%3==0){
//			System.out.printf("%d은 3의 배수입니다\n", num);
//			if(num%5==0){
//				System.out.println("3의 배수이면서 5의 배수입니다.");
//			}
//		}	
//		System.out.println("프로그램 종료");
//		sc.close();
		
		
		// 2. 문제
		// 두개의 정수를 입력받아 큰 수 출력
//		Scanner sc = new Scanner(System.in);
//		System.out.print("첫번째 정수 입력 : ");
//		int num1 = sc.nextInt();
//		System.out.print("두번째 정수 입력 : ");
//		int num2 = sc.nextInt();
//		
//		if (num1>num2)
//			System.out.printf("두개의 정수 중 큰 수는 %d", num1);
//		else
//			System.out.printf("두개의 정수 중 큰수는 %d", num2);
		
		
		// 3. 문제(**)
		// 세 개의 정수를 입력받아 큰 수 출력
//		Scanner sc = new Scanner(System.in);
//		System.out.print("첫번째 정수 입력 : ");
//		int num1 = sc.nextInt();
//		System.out.print("두번째 정수 입력 : ");
//		int num2 = sc.nextInt();
//		System.out.print("세번재 정수 입력 : ");
//		int num3 = sc.nextInt();
//		// 최대값(max)이 num1이라고 가정시작
//		int max = num1;
//		if(max<num2) {
//			max=num2;
//		}
//		if(max<num3) {
//			max=num3;
//		}
//		System.out.print("큰 수 :" + max);
//		sc.close();
//		
//		
//		// num1이 제일 큰 경우(num1>num2 && num1>num3)
//		if(num1>=num2 && num1>=num3)
//			System.out.println("큰수 : "+ num1);
//		else if(num2>=num1 && num2>=num3)
//			System.out.println("큰수 : "+ num2);
		
		//-----------------------
		//4 문제
		//-----------------------
		// 세개의 정수를 입력받아 해당수의 합과 평균을 출력
		
		
		
		
		//-----------------------
		//5 문제
		//-----------------------
		// 입력한 수가 짝수이고, 3의 배수라면 출력 (n%2==0 && n%3==0)
		// 입력한 수가 홀수이고, 5의 배수라면 출력 (n%2==1 && n%5==0)
		
		
		
		// IF-ELSE IF-ELSE
		// 과목 1, 2, 3, 4 중 하나라도 40점 미만이면 불합격
		// 과목평균이 100점 만점 기준으로 60점 미만이면 불합격
		// 아니면 합격
//		Scanner sc = new Scanner(System.in);
//		int 과목1 = sc.nextInt();
//		int 과목2 = sc.nextInt();
//		int 과목3 = sc.nextInt();
//		int 과목4 = sc.nextInt();
//		double 평균 = (double)(과목1+과목2+과목3+과목4)/4;
//		
//		// 첫번째 if 조건 충족하면 밑으로 더 내려가지 X, 첫번째 만족 x -> 두번째 ...순으로 이동
//		if(과목1<40) {
//			System.out.println("불합격");
//		}
//		else if(과목2<40) { // 과목1 >= 40 && 과목2 < 40
//			System.out.println("불합격");
//		}
//		else if(과목3<40) { // 과목1>=40 && 과목2>=40 && 과목3<40
//			System.out.println("불합격");
//		}
//		else if(과목4<40) { // 과목1>=40 && 과목2>=40 && 과목3>=40 && 과목4<40 
//			System.out.println("불합격");
//		}
//		else if(평균<60) { // 과목1>=40 && 과목2>=40 && 과목3>=40 && 과목4>=40 && 평균<60
//			System.out.println("불합격");
//		}
//		else {
//			System.out.println("합격");
//		}
		
		// 문제 
		// 시험점수를 입력받아 90 ~ 100 : A, 80~89 : B,  70~79 : C, 60~69 : D, 나머지 점수 F
//		Scanner sc = new Scanner(System.in);
//		System.out.print("시험점수를 입력하시오. >> ");
//		int num = sc.nextInt();
//		if(num>=90)
//			System.out.println("A");
//		else if(num>=80)
//			System.out.println("B");
//		else if(num>=70)
//			System.out.println("C");
//		else if (num>=60)
//			System.out.println("D");
//		else
//			System.out.println("F");
//		
//		sc.close();
		

		// 문제
		// 나이별로 요금 부과 - 8세 미만 요금 1000원/14세미만 요금 2000원/20세미만 요금 2500원/20세이상 요금 3000원
		
		Scanner sc = new Scanner(System.in);
		System.out.print("나이를 입력하시오. >> ");
		int age = sc.nextInt();
		if(age<8)
			System.out.println("요금은 1000원입니다.");
		else if(age<14)
			System.out.println("요금은 2000원입니다.");
		else if(age<20)
			System.out.println("요금은 2500원입니다.");
		else
			System.out.println("요금은 3000원 입니다.");
		sc.close();
		
	}

}
