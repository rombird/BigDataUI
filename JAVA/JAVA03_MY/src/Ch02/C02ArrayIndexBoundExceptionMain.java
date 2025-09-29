package Ch02;

public class C02ArrayIndexBoundExceptionMain {

	public static void main(String[] args) {
		
		try {
			int [] arr = {10, 20, 30};
			System.out.println(arr[0]);
			System.out.println(arr[1]);
			System.out.println(arr[2]);
//			System.out.println(arr[3]);
		}catch(ArrayIndexOutOfBoundsException e) {
//			System.out.println(e); //java.lang.ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 3
//			System.out.println(e.getCause()); //null 
//			System.out.println(e.getStackTrace()); // [Ljava.lang.StackTraceElement;@1f32e575
			System.out.println("예외처리!");
		}finally {
			// 예외 발생되든 안되든 무조건 발생하는 코드 -> arr[3]을 주석처리해도 출력됨
			System.out.println("예외발생과는 무관하게 무조건 실행되는 코드");
			// 자원(JDBC, SOCKET, STREAM, SCANNER...)을 제거하는데 사용
		}
		
		
		System.out.println("실행되어야할 코드1");
		System.out.println("실행되어야할 코드2");
	}

}
