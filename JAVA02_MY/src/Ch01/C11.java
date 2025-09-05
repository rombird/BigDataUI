package Ch01;

class Buyer{
	private int myMoney;
	private int appleCnt;
	// 모든인자 생성자
	public Buyer(int myMoney, int appleCnt) {
		super();
		this.myMoney = myMoney;
		this.appleCnt = appleCnt;
	}
	
	// toString
	@Override
	public String toString() {
		return "Buyer [myMoney=" + myMoney + ", appleCnt=" + appleCnt + "]";
	}
	
	// 특정 사과장수의 위치를 알아내서 돈을 주기위한 함수
	public void payment(Seller 사과장수, int money) {
		myMoney-=money; // 내가 가지고 있는 돈을 줘야하고 
		int cnt = 사과장수.receive(money); // 사과장수에게 돈을 줘야하고
		this.appleCnt+=cnt; // 돈을 준만큼 사과개수를 내 사과 창고에 저장
	}

}
class Seller{
	private int myMoney;
	private int appleCnt;
	private int price;
	
	// 모든인자 생성자
	public Seller(int myMoney, int appleCnt, int price) {
		super();
		this.myMoney = myMoney;
		this.appleCnt = appleCnt;
		this.price = price;
	}
	
	// toString
	@Override
	public String toString() {
		return "Seller [myMoney=" + myMoney + ", appleCnt=" + appleCnt + ", price=" + price + "]";
	}
	
	// 페이먼트가 먼저 동작하고 사과장수가 돈을 받을 수 있게 
	public int receive(int money) {
		this.myMoney += money;
		int cnt = money/this.price;
		appleCnt-=cnt;
		return cnt;
	}
}

public class C11 {

	public static void main(String[] args) {
		// 
		Buyer 홍길동 = new Buyer(10000, 0); // 보유금액 1만원, 사과 0개
		Buyer 티모 = new Buyer(20000, 0); 
		//
		Seller 사과장수1 = new Seller(50000, 100, 1000); // 보유금액 5만원, 사과 100개 보유, 개당 1000원
		
		// 구매작업
		홍길동.payment(사과장수1, 3000);
		티모.payment(사과장수1, 8000);
		
		System.out.println(홍길동);
		System.out.println(티모);
		System.out.println(사과장수1);
		

	}

}
