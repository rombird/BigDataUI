package Ch14;

import java.lang.reflect.Method;


public class C01BASIC {

	public static void main(String[] args) throws Exception {
		
		// 특정 클래스 확인하기 위해 : Class.forName("") 
		// <?> : generic (반환형태)
		Class<?> clazz =  Class.forName("java.lang.String");
		
		//모든 Field 확인 - String 클래스의 어떤 속성이 있는지 확인
		// import java.lang.reflect.Field;
//		Field[] fields = clazz.getDeclaredFields(); // clazz의 선언된 필드를 확인하겠다
//		for(Field field : fields) {
//			System.out.println(field);
//		}
		
		//모든 생성자 확인 
//		Constructor[] constructors =  clazz.getDeclaredConstructors(); 
//		for(Constructor con : constructors) {
//			System.out.println(con);
//		}
//		
		//모든 메서드 확인
//		Method [] methods = clazz.getDeclaredMethods();
//		for(Method m : methods)
//			System.out.println(m);
		
	

	}

}
