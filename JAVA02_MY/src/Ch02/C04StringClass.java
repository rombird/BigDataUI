package Ch02;

public class C04StringClass {

	public static void main(String[] args) {
		String str1 = "java";
		String str2 = "java";
		String str3 = new String("java");
		String str4 = new String("java");
		
		 
		// 실제 위치정보 str1, str2의 위치정보는 동일, str3, str4는 다름 
		System.out.printf("%X\n",System.identityHashCode(str1));
		System.out.printf("%X\n",System.identityHashCode(str2));
		System.out.printf("%X\n",System.identityHashCode(str3));
		System.out.printf("%X\n",System.identityHashCode(str4));
		
		
		
		System.out.println("---------------------");
		System.out.println("str1==str2 ? " + (str1==str2)); // true
		System.out.println("str3==str4 ? " + (str3==str4)); // false
		System.out.println("str1==str3 ? " + (str1==str3)); // false
		System.out.println("str2==str4 ? " + (str2==str4)); // false
		System.out.println("---------------------");
		
		// equals ->  문자열의 일치여부확인
		System.out.println("str1==str2 ? " + (str1.equals(str2))); // true 
		System.out.println("str3==str4 ? " + (str3.equals(str4))); // true
		System.out.println("str1==str3 ? " + (str1.equals(str3))); // true
		System.out.println("str2==str4 ? " + (str2.equals(str4))); // true
		
	}

}
