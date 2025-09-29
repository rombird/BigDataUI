package Ch06;

// tv, radio에 접근 가능한 remocon(on, off함수 존재) 인터페이스 구축

interface Remocon{
	// 기준값 - 바꿀 수 X 
	int MAX_VOL = 100; // public static final
	int MIN_VOL = 10; // public static final 
	// 추상메서드
	void powerOn();
	void powerOff(); 
	//
	void setVolumn(int vol); // 외부로부터 볼륨크기 전달받겠다
}

interface Browser{
	void searchURL(String url); // 추상메서드
}

// class Tv implements Remocon{} 만하면 -> 'Tv' -> 'Add unimplemented methods'
class Tv implements Remocon{
	private int nowVol;
	
	@Override
	public void powerOn() {
		System.out.println("TV를 켭니다.");
	}

	@Override
	public void powerOff() {
		System.out.println("TV를 끕니다.");
	}

	@Override
	public void setVolumn(int vol) {
		if(vol>=MAX_VOL)
			this.nowVol=MAX_VOL;
		else if(vol<=MIN_VOL)
			this.nowVol=MIN_VOL;
		else
			this.nowVol = vol; // 전달받은 nowVol에 vol을 전달받겠다.
		System.out.println("TV 현재 볼륨 : " + nowVol);
	}}

class SmartTv extends Tv implements Browser{
	// 인터페이스에서 만든 searchURL
	@Override
	public void searchURL(String url) { 
		System.out.println(url + "로 이동합니다-!");
	}}

class Radio implements Remocon{
	private int nowVol;
	
	@Override
	public void powerOn() {
		System.out.println("Radio를 켭니다.");
	}

	@Override
	public void powerOff() {
		System.out.println("Radio를 끕니다.");
	}

	@Override
	public void setVolumn(int vol) {
		if(vol>=MAX_VOL)
			this.nowVol=MAX_VOL;
		else if(vol<=MIN_VOL)
			this.nowVol=MIN_VOL;
		else
			this.nowVol = vol; // 전달받은 nowVol에 vol을 전달받겠다.
		System.out.println("Radio 현재 볼륨 : " + nowVol);
	}}


public class C03InterfaceMain {
	public static void TurnOn(Remocon controller) { // Main에서는 Remocon과 연결된 Tv/Radio 접근가능하도록 객체 연결될 예정
		// Remocon controller = new Tv(); - 업캐스팅된 상태와 동일하게 봄?
		controller.powerOn(); 
	}
	
	public static void TurnOff(Remocon controller) {
		controller.powerOff();
	}
	
	public static void ChangeVolumn(Remocon controller, int vol) {
		controller.setVolumn(vol);
	}
	
	public static void Internet(Browser browser, String url) {
		browser.searchURL(url);
	}
	
	public static void main(String[] args) {
		Tv tv = new Tv();
		Radio radio = new Radio();
		SmartTv smartTv = new SmartTv();
		
		// tv, radio
		// tv.powerOn(); // 결합도가 높은 상태
//		TurnOn(tv); // 직접적으로 처리하는게 아니라 작업공정 추가 // 재정의한 tv의 poweron에 접근 가능
//		TurnOn(radio); 
//		
//		ChangeVolumn(tv, 50);
//		ChangeVolumn(tv, 120);
//		ChangeVolumn(radio, -10);
//		ChangeVolumn(radio, 70);
//		
//		TurnOff(tv);
//		TurnOff(radio);
		
		// smartTv
		TurnOn(smartTv);
		ChangeVolumn(smartTv, 90);
		Internet(smartTv, "www.naver.com");
		TurnOff(smartTv);
	}

}
