package Ch04;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

class Person{
	String name;
	int age;
	//생성자
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	//toString
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	
	// 재정의를 반드시 해줘야지 같은 객체임을 판단 할 수 있음 -> 이 부분을 주석처리한 후 실행한다면 false, false의 결과를 확인할 수 있음
	//equals를 재정의해서 name,age가 동일하면 true / 아니면 false 
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Person) {
			Person down = (Person)obj;	//downcasting
			return this.name.equals(down.name) && this.age == down.age;
		}
		return false;
	}
	//hashCode() 재정의 -> HashSet의 동등객체 판단처리
	@Override
	public int hashCode() {
		return Objects.hash(this.name,this.age);
	}
	
	
}
public class C05SetMain {

	public static void main(String[] args) {
		Set<Person> set = new HashSet();
			
		Person ob1 = new Person("홍길동",55);
		Person ob2 = new Person("남길동",35);
		Person ob3 = new Person("홍길동",55);
		
		System.out.println(ob1.equals(ob2)); // false 
		System.out.println(ob1.equals(ob3)); // false - hashset으로 객체 생성했기 때문에 동등하게 보지 X
		
		set.add(ob1);	
		set.add(ob2);
		set.add(ob3); 	
//
		System.out.println("SIZE : " + set.size()); // 3
	}

}
