package Ch07;

import java.util.Scanner;

public class C02While {

	public static void main(String[] args) {
		// 2단 - 9단출력
//		int dan = 2;
//		while(dan<10) {
////			System.out.printf("%d\n", dan);
//			int i = 1;
//			while(i<10) {
//				System.out.printf("%d X %d = %d\n", dan, i, dan*i);
//				i++;
//			}
//			System.out.println();
//			dan++;
//		}
		
		// 2단 - 9단 (2x9, 2x8, ... 9x2,9x1)
//		int dan = 2;
//		while(dan<10) {
//			int i = 9;
//			while(i>0) {
//				System.out.printf("%d x %d = %d\n", dan, i, dan*i);
//				i--;
//			}
//			System.out.println("-----------------------");
//			dan ++;
//		}
		
		// 9단 - 2단 (9x9 9x8 ... 2x2 2x1)
//		int dan=9;
//		while(dan>1) {
//			int i = 9;
//			while(i>0) {
//				System.out.printf("%d x %d = %d\n", dan, i, dan*i);
//				i--;
//			}
//			dan--;
//		}
		
		// 2단 - n단(n>2)
//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
//		
//		if(n<=2) {
//			System.out.println("n>2 입니다 -!");
//			System.exit(-1);
//		}
//		
//		int dan = 2;
//		while(dan<n+1) {
//			int i = 1;
//			while(i<10) {
//				System.out.printf("%d x %d = %d\n", dan, i, dan*i);
//				i++;
//			}
//			System.out.println("--------------------------");
//			dan++;
//		}
				
							
		// n단 - m단(n<m)
//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
//		int m = sc.nextInt();
//		
//		if(n>=m) {
//			int tmp = n;
//			n = m;
//			m = tmp;
//		}
//		
//		int dan = n;
//		while(dan<m+1) {
//			int i = 1;
//			while(i<10) {
//				System.out.printf("%d x %d = %d\n", dan, i, dan*1);
//				i++;
//			}
//			System.out.println("--------------------");
//			dan++;
//		}
		
		
		//------------------------------------
		// 별찍기(기본높이 : 4) - 반드시 반복을 사용할 것, 반복시마다 하나의 * 만 찍어낼 것
		// *****
		// *****
		// *****
		// *****
		//------------------------------------
		
//		int i = 0;
//		while(i<4) {
//			int j = 0;
//			while(j<5) {
//				System.out.print("*");
//				j++;
//			} // System.out.println()보다 위에 있어야 별을 한 줄 찍어내고 다음행으로 이동해 별을 찍어낼 수 있게 됨 순서!!!
//			System.out.println(); // 안쪽 반복문에서 별을 모두 찍어내기 때문에 바깥에서 굳이 별을 찍어낼 필요 X
//			i++;
//		}
		
		// 높이 h를 입력받아 높이만큼 별찍기
//		Scanner sc = new Scanner(System.in);
//		int h = sc.nextInt();
//		int i = 0;
//		while(i<h) {
//			int j = 0;
//			while(j<5) {
//				System.out.print("*");
//				j++;
//			}
//			System.out.println();
//			i++;
//		}
		
		//------------------------------------
		// * 		0	0-0
		// **		1	0-1
		// ***		2	0-2
		// ****		3	0-3
		// 		    i=0	j=0
		// 			i++ j++
		// 			i<4 j<=i --> 행만큼 입력(1행에서는 j=0, 2행에서는 j=0,1 3행에서는 j=0,1,2 ...)
		//------------------------------------
		
//		int i = 0;
//		while(i<4) {
//			int j = 0;
//			while(j<=i) {
//				System.out.print("*");
//				j++;
//			}
//			System.out.println();
//			i++;
//		}
		
		// 높이 h값을 받아 별 찍기
		// i=0일 때 j=0 -> *, i=1일때 j=0, 1 -> **, i=2일때 j=0, 1, 2 -> *** ...  
//		Scanner sc = new Scanner(System.in);
//		int h = sc.nextInt();
//		int i = 0;
//		while(i<h) {
//			int j = 0;
//			while(j<=i) {
//				System.out.print("*");
//				j++;
//			}
//			System.out.println();
//			i++;
//		}
		
		//------------------------------------
		// 높이 : 4
		// ****
		// ***
		// **
		// *
		// j>i에서 i를 숫자로 고정하면 X 
		//------------------------------------
		// 초기값 i = 0, j = 4으로 두었을 때
//		int i = 0;
//		while(i<4) {
//			int j = 4;
//			while(j>i) {
//				System.out.print("*");
//				j--;
//			}
//			System.out.println();
//			i++;
//		}
		// 초기값 i = 0, j = 0으로 두었을 때(*** 4-i)
//		int i = 0;
//		while(i<4) {
//			int j = 0;
//			while(j<4-i) {
//				System.out.print("*");
//				j++;
//			}
//			System.out.println();
//			i++;
//		}
		
		
		// 높이 : h
//		Scanner sc = new Scanner(System.in);
//		int h = sc.nextInt();
//		int i = 0;
//		while(i<h) {
//			int j = h;
//			while(j>i) {
//				System.out.print("*");
//				j--;
//			}
//			System.out.println();
//			i++;
//		}
		
//		Scanner sc = new Scanner(System.in);
//		int h = sc.nextInt();
//		int i = 0;
//		while(i<h) {
//			int j = 0;
//			while(j<h-i) {
//				System.out.print("*");
//				j++;
//			}
//			System.out.println();
//			i++;
//		}
		
		//------------------------------------
		// 높이 : 4
		//   *			0		0-2		0-0
		//  ***			1		0-1		0-2
		// *****		2		0-0		0-4
		//*******		3		x		0-6
		//				i=0		j=0		k=0
		//				i++		j++		k++
		//				i<4		j<3-i	k<=2*i
		//-------------------------------------
		
//		int i = 0;
//		while(i<4) {
//			// 공백
//			int j = 0;
//			while(j<3-i) {
//				System.out.print(" ");
//				j++;
//			}
//			// 별 -> k범위 잘 찾기
//			int k = 0;
//			while(k<=i*2) {
//				System.out.print("*");
//				k++;
//			}
//
//			System.out.println();
//			i++;
//		}
		
		// 높이 h
//		Scanner sc = new Scanner(System.in);
//		int h = sc.nextInt();
//		int i = 0;
//		while(i<h) {
//			int j = 0;
//			while(j<h-1-i) {
//				System.out.print(" ");
//				j++;
//			}
//			int k = 0;
//			while(k<=i*2) {
//				System.out.print("*");
//				k++;
//			}
//			System.out.println();
//			i++;
//		}
		
		//------------------------------------
		// 				행		공백			별
		//*******		0		X			0-6 
		// *****		1		0-0(1)		0-4
		//  ***			2		0-1(2)		0-2
		//   *			3		0-2(3)		0-0
		//------------------------------------
		
//		int i = 0;
//		while(i<4) {
//			// 공백
//			int j = 0;
//			while(j<i) {
//				System.out.print(" ");
//				j++;
//			}
//			// 별
//			int k = 0;
//			while(k<=(3-i)*2) {
//				System.out.print("*");
//				k++;
//			}
//			System.out.println();
//			i++;
//		}
		
		// 높이 : h
		// 행 -> 공백 -> 별
		// 0 -> X -> 0 ~ (h-1)*2-0
		// 0 -> 0-0 -> 0~(h-1)*2-2
		// ...
		// h-1 -> h-1 -> 0~0
		
//		Scanner sc = new Scanner(System.in);
//		int h = sc.nextInt();
//		int i = 0;
//		while(i<h) {
//			int j = 0;
//			while(j<i) {
//				System.out.print(" ");
//				j++;
//			}
//			int k = 0;
//			while(k<=(h-1-i)*2) {
//				System.out.print("*");
//				k++;
//			}
//			System.out.println();
//			i++;
//		}
		
		// 반전되는 곳은 분기문으로 
		//------------------행		공백		별
		//   *				0		0-2		0-0
		//  ***				1		0-1		0-2
		// *****			2		0-0		0-4
		//*******			3		x		0-6
		// *****			4		0-0		0-4
		//  ***				5		0-1		0-2
		//   *				6		0-2		0-0
		//------------------------------------
		// if(i<4) then				j=0		k=0
		//							j++		k++	
		//							j<3-i	k<=i*2
		// 							j=0		k=0
//									j++		k++
//									j<i-4	k<(6-i)*i
		// i=0
		// i++
		// i<7
		
//		int i = 0;
//		while(i<7) {
//			if(i<4) {
//				// 공백
//				int j = 0;
//				while(j<3-i) {
//					System.out.print(" ");
//					j++;
//				}
//				
//				// 별
//				int k = 0;
//				while(k<=i*2) {
//					System.out.print("*");
//					k++;
//				}
//				
//			}
//			else {
//				// 공백
//				int j = 0;
//				while(j<=i-4) {
//					System.out.print(" ");
//					j++;
//				}
//				// 별
//				int k = 0;
//				while(k<=(6-i)*2) {
//					System.out.println("*");
//					k++;
//				}
//				
//			}
//			
//			System.out.println();
//			i++;
//		}
//		
//		Scanner sc = new Scanner(System.in);
//		int h = sc.nextInt();
//		
//		while(h/2==0) {
//			System.out.print("높이값 다시 입력 : ");
//			h = sc.nextInt();
//		}
		
//		int i=0;
//		while(i<h)
//		{
//			
//			if(i<(h/2 + 1))
//			{
//				//공백
//				int j=0;
//				while(j<(h/2 - i))
//				{
//					System.out.print(" ");
//					j++;
//				}
//				//별
//				int k=0;
//				while()
//				{
//					System.out.print("*");
//					k++;
//				}
//			}
//			else
//			{
//				//공백
//				int j = 0;
//				while(j<i-(h/2 + 1))
//				{
//					System.out.print(" ");
//					j++;
//				}
//				//별
//				int k = 0;
//				while(k<=(h-1)*2 - 2*i)
//				{
//					System.out.print("*");
//					k++;
//				}
//			}
//			
//			System.out.println();
//			i++;
//		}
		
		
		
		//------------------------------------
		//*******
		// *****
		//  ***
		//   *		
		//   *
		//  ***
		// *****		
		//*******
		//------------------------------------
		
		
		
	}

}
