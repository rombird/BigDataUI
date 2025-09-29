package Ch03;

public class C03ArrayMain {

	public static void main(String[] args) {
		int arr[][] = {
				{10, 20, 30},
				{40, 50, 60, 65, 67},
				{70,80,90,96,11,56},
				{100,110,120,15,22,33,44},
		};
		System.out.println("전체 행의 길이 : "  + arr.length);
		System.out.println("0번째 행의 길이 : "  + arr[0].length);
		System.out.println("1번째 행의 길이 : "  + arr[1].length);
		System.out.println("2번째 행의 길이 : "  + arr[2].length);
		System.out.println("3번째 행의 길이 : "  + arr[3].length);
		
		// 1차원 배열의 배열 요소는 해당 배열을 이루는 자료형 단위
		// int arr[] = new int [3];
		
		// 2차원 배열의 배열 요소는 1차원 배열
		// int arr[][] = new int[2][3] - 2행 3열
		
		// 3차원 배열의 배열 요소는 2차원 배열
		
	}

}
