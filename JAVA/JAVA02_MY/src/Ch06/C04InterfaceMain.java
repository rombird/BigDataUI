package Ch06;

interface Tire{
	void run();
}

class 한국타이어 implements Tire{

	@Override
	public void run() {
		System.out.println("한국타이어가 굴러갑니다");
	}
}

class 금호타이어 implements Tire{

	@Override
	public void run() {
		System.out.println("금호타이어가 굴러갑니다");
	}
}

class Car{
	Tire FL;
	Tire FR;
	Tire BL;
	Tire BR;
	
	// 자동차 기본 옵션 한국타이어
	Car(){
		FL = new 한국타이어();
		FR = new 한국타이어();
		BL = new 한국타이어();
		BR = new 한국타이어();
	}
	
	void start() {
		FL.run();
		FR.run();
		BL.run();
		BR.run();
	}
}

public class C04InterfaceMain {

	public static void main(String[] args) {
		Car car = new Car();
		car.start(); // 한국타이어가 끼워져있는 상태 
		car.FL = new 금호타이어(); // 다른타이어 선택
		car.BR = new 금호타이어(); // 다른타이어 선택
		car.start(); // FL, BR이 금호타이어로 바뀌어진 상태 확인
		
	}

}
