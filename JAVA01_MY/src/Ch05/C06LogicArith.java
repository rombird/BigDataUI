package Ch05;

public class C06LogicArith {

	public static void main(String[] args) {
		int a=0,b=0;
		boolean c;
		a = 1; 
		b = 1;
		c =(++a>0)||(++b>0) ; //   c= true
		System.out.printf("a = %d , b = %d c = %s\n", a, b, c); // 2 1 true

		a = 1;
		b = 1;
		c = (++a>0)||(--b>0) ; 
		System.out.printf("a = %d , b = %d c = %s\n", a, b, c); // 2 1 true

		a = 1;
		b = 1;
		c = (--a>0)||(++b>0) ; // a=0 -> false || b=2 
		System.out.printf("a = %d , b = %d c = %s\n", a, b, c); // 0 2 true

		a = 1;
		b = 1;
		c = (--a>0)||(b-->0) ; // false || b=1 -> c= true -> b=0 까지 마무리 해줘야함 
		System.out.printf("a = %d , b = %d c = %s\n", a, b, c); // 0 0 true

	}

}
