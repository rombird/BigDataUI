package Ch03;

import java.util.Arrays;

public class C02ArrayMain {

	public static void main(String[] args) {
		// 얕은복사(주소복사)
		int arr1[] = { 10, 20, 30 }; // new int [3] -> arr1[0]=10, arr1[1]=20, arr1[2]=30
		int arr2[];
		arr2 = arr1; // arr1의 주소를 복사(하나의 배열을 가르키는 두개의 참조변수)
		arr1[0] = 100; 

		Arrays.stream(arr1).forEach(System.out::println);
		System.out.println("-----------------");
		Arrays.stream(arr2).forEach(System.out::println);

		// 깊은복사(값복사)
		int arr3[] = new int[3]; // 공간 형성 -> 반복문으로 배열요소를 대입
		for (int i = 0; i < arr1.length; i++)
			arr3[i] = arr1[i];

		// Arrays API
		int arr4[] = Arrays.copyOf(arr1, arr1.length);

		System.out.println("arr1 : " + arr1);
		System.out.println("arr2 : " + arr2);
		System.out.println("arr3 : " + arr3);
		System.out.println("arr4 : " + arr4);

	}

}
