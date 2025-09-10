package Ch20;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

// Annotataion 만드는 작업 

@Retention(RetentionPolicy.RUNTIME) // @Retention : Annotation 유지기간(프로그램 동작중인 상태에서만 실행)
@Target({ElementType.TYPE, ElementType.METHOD}) // @Target: 현재 만들고 있는 Annotation이 어디에 적용시킬 것인지 적용 대상을 제한
// ElementType.TYPE : 클래스, 인터페이스, enum 적용
// ElementType.FIELD : 멤버변수에 적용
// ElementType.METHOD : 메서드에 적용

public @interface CustomAnnotation {
	// 담겨질 데이터 단위 지정
	String value() default "HELLO WORLD"; // 기본값이 지정되어있는 annotation을 만들고 싶다면 defalut 사용
	int number() default 1;
	boolean isOpen() default false;
	
	
}

// @CutomAnnotation(value="", number=1, ipOpen=) // 애노테이션 사용시