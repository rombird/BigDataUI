package Ch05;

class Point2D{
	int x;
	int y;
	
	Point2D(){
		System.out.println("Point2D 디폴트생성자 호출!");
	}
	
}
// extends 예약어 사용 : extends 상위클래스
class Point3D extends Point2D{
	int z;
	
	Point3D(){
		super(); // 상위클래스 Point2D() 생성자 호출 : 상위클래스의 생성자를 먼저 호출하겠다는 코드가 기본적으로 생성됨
		System.out.println("Point3D 디폴트생성자 호출!");
	}
	
	// toString 재정의
	@Override
	public String toString() {
		return "Point3D [z=" + z + ", x=" + x + ", y=" + y + "]";
	}
	
}

public class C01InheritanceMain {

	public static void main(String[] args) {
		Point3D ob = new Point3D();
		ob.x=10;
		ob.y=20;
		ob.z=30;
		System.out.println(ob); 
		// Ch05.Point3D@1f32e575 - toString을 재정의하기 전이라 위치정보 나옴
		// Point3D [z=30, x=10, y=20]  - toString 재정의 후

	}

}
