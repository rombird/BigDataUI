package Ch02;

//캡슐화란
//특정 목적을 가지는 기능을 구현하는데 필요한 세부 기능들을 묶어서 처리하는 방법
//특정 목적을 가지는 기능 구현에 있어서 각 과정의 일부나 전부가 외부로 노출되는 문제 막기 위해
//정보은닉을 수반한다(필수는 아님)
//캡슐화 작업은 각 공정과정에 대한 정확한 이해가 수반되어야 한다


class Engine{
	// 이 기능은 이 클래스내에서만 동작 가능하게
	private void 흡입() {System.out.println("외부로부터 공기를 빨아들인다");}
	private void 압축() {System.out.println("가둔 공기를 압축시킨다");}
	private void 폭발() {System.out.println("일정 수준압축되면 폭발!");}
	private void 배기() {System.out.println("가스를 외부로 보낸다");}
	// 캡슐화(절차 정확하게 반영)
	// 특정한 순서를 가지게끔 프로세스 만듦
	public void EngineStart() {
		흡입();
		압축();
		폭발();
		배기();
	}
}
class Car{
	private Engine engine; // 엔진 속성(필드) 추가
	Car(){
		engine = new Engine(); // 자동차가 생성되면 내부에서 엔진이 같이 생성될수있도록
	}
	void run() { // 자동차의 기능 -> run을 누르면 엔진기능도 실행
		//
		//
		//
		engine.EngineStart(); 
	}	
}

public class C02캡슐화 {

	public static void main(String[] args) {
		Car car = new Car();
		car.run(); // -> run을 누르면 엔진기능도 실행

	}

}
