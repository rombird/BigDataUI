package Ch01;

class TV{
	String brandName;
	int year;
	int inch;
	
	// 선생님이 작성한 것 : 자동으로 마우스 우클릭 -> source -> 자동생성
	public TV(String brandName, int year, int inch) {
		super();
		this.brandName = brandName;
		this.year = year;
		this.inch = inch;
	} 

	// void로 표시되는 이유는 myTV.show()를 받아내는 게 없기 때문 String str = myTV.show()를 하면 결과가 달라짐을 확인
	public void show() {
		System.out.printf("%s에서 만든 %d년형 %d인치 TV", this.brandName, this.year, this.inch);
		
	}
	
	// 내가 작성한 것
//	TV(String brandName, int year, int inch){
//		this.brandName = brandName;
//		this.year = year;
//		this.inch = inch;
//	}
//	public void show() {
//		System.out.println(this.brandName+ "에서 만든 " + this.year + "년형 " + this.inch + "인치 TV" );
//	}
	

}

public class C09Ex {

	public static void main(String[] args) {
		TV myTV = new TV("LG", 2017, 32); //'LG에서 만든 2017년형 32인치 TV'출력 
		myTV.show();

	}

}
