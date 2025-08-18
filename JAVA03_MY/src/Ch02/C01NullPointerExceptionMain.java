package Ch02;

public class C01NullPointerExceptionMain {

	public static void main(String[] args) {
//		String str = null;
//		System.out.println(str.toString()); // 여기서 오류 발생하기 때문에 밑에 코드가 실행이 되지 X
//		System.out.println("실행되어야할 코드 1");
//		System.out.println("실행되어야할 코드 2");
//		--> 에러가 발생할만한 곳에 try 예외처리 -> 어떤 에러인지 정의 
		
		// 예외처리는 runtime error(실행오류) 중의 하나 , 프로그램 중단을 막기 위해 하는 처리
		try {
			String str = null;
			System.out.println(str.toString());
		}catch(NullPointerException e) {
//			System.out.println("예외발생 : " + e);
//			System.out.println(e.getCause()); // null
//			System.out.println(e.getStackTrace()); // [Ljava.lang.StackTraceElement;@28a418fc
			e.printStackTrace();
		}
		System.out.println("실행되어야할 코드 1");
		System.out.println("실행되어야할 코드 2");

		
		
	}

}
