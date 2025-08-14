package Ch03;

public class C05TypeChange {

	public static void main(String[] args) {
		int num1 = 10, num2 = 4;
		double dnum1 = (double)num1 / num2; 
		// 그냥 num1 / num2 했을 때 몫만 나옴 2.0으로
		// num1, num2 둘 중 하나에 형변환 해도 2.5로 똑같이 출력
		double dnum2 = (num1*1.0) / num2;
		double dnum3 = num1 / num2;
		System.out.println("dnum1 : " + dnum1);
		System.out.println("dnum2 : " + dnum2);
		System.out.println("dnum3 : " + dnum3);
		// 나눗셈의 결과 int 
		

	}

}
