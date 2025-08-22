package Ch02;

class Animal{}

class Dog extends Animal{}

class Cat extends Animal{}

public class C04ClassCastExceptionMain {

	public static void main(String[] args) {
		
		Animal poppi = new Dog(); 		// 업캐스팅
		Animal tori = new Cat();		// 업캐스팅
		
		// Dog로 다운캐스팅
//		Dog down1 = (Dog)poppi;		// o
//		Dog down2 = (Dog)tori; 		// x - ClassCastException (다운캐스팅 잘못 사용)

		try {
			Dog down1 = (Dog)poppi;		
			Dog down2 = (Dog)tori;
		}catch(ClassCastException e){
			e.printStackTrace();
		}

	}

}
