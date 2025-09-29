package Ch18;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Person{
	// 상속관계에 있는 하위 클래스에서 접근 가능하도록 private -> protected로 변경
	protected String name;
	protected Integer age;
	// 디폴트 생성자
	public Person(){}
	
	// 모든인자 생성자
	public Person(String name, Integer age) {
		super();
		this.name = name;
		this.age = age;
	}

	// getter and setter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	// toString
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	
}

class Employee extends Person{
	private String department;
	private String role;
	// 디폴트 생성자
	public Employee() {}
	// person을 받도록 하는 작업 추가
	public Employee(Person person) {
		this.name = person.getName();
		this.age = person.getAge();
		// super(이름, 나이)로 해도 상관 X
	}
	// 모든인자 생성자
	public Employee(String department, String role) {
		super();
		this.department = department;
		this.role = role;
	}
	
	// getter and setter
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	@Override
	public String toString() {
		return "Employee [department=" + department + ", role=" + role + ", name=" + name + ", age=" + age + "]";
	}
	
	// toString
	
	
}

public class C01StreamMain {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,2,3,4,5); // aslist : 바로 배열을 만드는 작업
		System.out.println(list); // [1, 2, 3, 4, 5]
		// filter
		List<Integer> list2 = list.stream()
								.filter((n)->{return n%2==0;}) // 짝수만, filter -> 반환형이 stream
								.collect(Collectors.toList()); // 반환형 지정하고 싶을 때 collect사용
		System.out.println(list2); // [2, 4]
		
		// map
		List<Integer> list3 = list.stream()
								.filter((n)->{return n%2==1;})
								.map((n)->{return n*n;}) // 반환자료형 stream, 홀수만 받아온 n을 곱해서 받아오기
								.collect(Collectors.toList());
		System.out.println(list3); // [1, 9, 25]
		
		// sort
		List<Person> list4 = Arrays.asList(
					new Person("홍길", 45),
					new Person("김범수수수수", 35),
					new Person("유재석", 52),
					new Person("서장훈니니니", 56),
					new Person("남이", 27)					
				); // 정렬이 안 된 상태
		// System.out.println(list4); 
		// [Person [name=홍길동, age=45], Person [name=김범수, age=35], Person [name=유재석, age=52], Person [name=서장훈, age=56], Person [name=남길동, age=27]]
		// 나이순으로 내림차순 정렬 -> .sorted((a,b)->{return b-a;}) // 내림차순
		List<Person> list5 = list4.stream()
								.sorted((a,b)->{return b.getAge()-a.getAge();})
								.collect(Collectors.toList());
		list5.forEach(System.out::println); // 메소드 참조 연산자(::)
		
		
		// 나이만 재구성
		List<Integer> list6 = 
		list4.stream()
//			.map((el)->{return el.getAge();})
//			.map(el->el.getAge()) // 전달받은 요소가 하나고 본문에 요소가 하나라면 축약가능
			.map(Person::getAge) // Person 클래스의 age를 쓰겠다
			.collect(Collectors.toList());
		System.out.println(list6); // [45, 35, 52, 56, 27]
		
		// 
		List<Integer> list7 = 
		list4.stream()
//			.map((el)->{return el.getName();}) // 메서드 참조(::)이용 - Person
//			.map((el)->{return el.length();})	// 메서드 참조(::)이용 - String
			.map(Person::getName)
			.map(String::length)
			.collect(Collectors.toList());
		System.out.println(list7); // [2, 6, 3, 6, 2]
		
		// Person을 상속받는 Employee 클래스 추가 후 작업
		List<Employee> list8 = 
		list4.stream()
//			.map((el)->{return new Employee(el);})
			.map(Employee::new)
			.collect(Collectors.toList());
		list8.forEach(System.out::println); // department, role과 함께 Person의 name, age 함께 출력
	}

}
