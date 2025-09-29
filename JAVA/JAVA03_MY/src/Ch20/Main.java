package Ch20;

@CustomAnnotation(value="홍길동", number=10000, isOpen=true) // default로 기본값을 지정해주지 않으면 오류 발생
class Simple{
	String value;
	int number;
	boolean isOpen;
	
	Simple(){ // 이런 작업들을 대신 해주는 라이브러리 사용하기전에 어떤 식으로 만들어지는 지 확인용
		CustomAnnotation ref = this.getClass().getAnnotation(CustomAnnotation.class); // CustomAnnotation의 정보를 가져옴
		System.out.println("VALUE : " + ref.value()); // 애노테이션에서 직접 value를 지정하지 않을 시 기본값으로 출력됨 
		System.out.println("NUMBER : " + ref.number());
		System.out.println("ISOPEN : " + ref.isOpen());
		this.value=ref.value();
		this.number=ref.number();
		this.isOpen=ref.isOpen();
	}
	
}

public class Main {

	public static void main(String[] args) {
		Simple ob = new Simple();
		System.out.println(ob); // Ch20.Simple@17a7cec2

	}

}
