package Ch03;


class 카라멜{
	@Override
	public String toString() {
		return "카라멜맛";
	}
}
class 버터옥수수{
	@Override
	public String toString() {
		return "버터옥수수맛";
	}
}

class PopCorn <T>{
	private T 재료;
	
	public PopCorn(T 재료) {
		this.재료 = 재료;
	}

	@Override
	public String toString() {
		return "PopCorn [재료=" + 재료 + "]";
	}
	
	
}

public class C02Ex {

	public static void main(String[] args) {
		PopCorn<카라멜> ob1 = new PopCorn<카라멜>(new 카라멜());
		System.out.println(ob1);
		
		PopCorn<버터옥수수> ob2 = new PopCorn<버터옥수수>(new 버터옥수수());
		System.out.println(ob2);

	}

}
