package Ch03;

import java.util.Arrays;
import java.util.Scanner;

public class C01ArrayMain {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); 
//		// 배열은 Heap에 저장 
		int [] arr1 = new int[5];
////		int arr1 [] = new int[5]; // [] 연산자 위치는 배열 앞 뒤 원하는 곳에
		System.out.println("배열길이 : " + arr1.length); // 배열의 길이 확인 가능
		System.out.println("5개의 값을 입력하세요"); 
		arr1[0] = sc.nextInt(); 
		arr1[1] = sc.nextInt(); 
		arr1[2] = sc.nextInt(); 
		arr1[3] = sc.nextInt(); 
		arr1[4] = sc.nextInt(); 
//		
		for(int i=0;i<arr1.length;i++) {
			System.out.println(i+"."+ arr1[i]); 
		}
		System.out.println("----------------");
//		
//		// 개량 for문 활용
//		for(int el : arr1) {
//			System.out.println(el);
//		}
//		System.out.println("-------------");
//		Arrays.stream(arr1).forEach((el)->{System.out.println(el);}); // 람다식
//		Arrays.stream(arr1).forEach(el -> System.out.println(el)); // 중괄호 없이 사용 가능
//		Arrays.stream(arr1).forEach(System.out::println); // <- 단일 메서드라면 사용 가능 
		
		// 배열에 입력된 정수 중에 최대값과 최소값을 출력
		int max = arr1[0];
		int min = arr1[0];
		for(int el : arr1) {
			if(max<el) // max를 처음값으로 초기화 시킨 다음 -> 처음 값과 다음값을 비교해서 다음값이크면 다음값이 max가 되고 ... -> 배열의 수 중에 제일 큰 수를 찾는 과정
				max = el; 
			if(min>el) // 배열의 수 중 제일 작은 수를 찾는 과정
				min = el; 
		}
		System.out.println("Max : " + max);
		System.out.println("Min : " + min);
		
		// 최대, 최소값을 바로 구해주는 stream 함수
		System.out.println("MAX : " + Arrays.stream(arr1).max().getAsInt());
		System.out.println("MIN : " + Arrays.stream(arr1).min().getAsInt());

	}

}
