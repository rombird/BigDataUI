package Ch02;

import java.util.Scanner;

public class exam {
	
	private static Scanner sc = new Scanner(System.in);
	private static List<String> wordList = new ArrayList<String>();
	
	public static void sort(boolean isAsend) {
		
	}
	public static void add(String word) {
		
	}
	public static void show() {
		
	}

	public static void main(String[] args) {
		int n = 0;
		while(true) {
			System.out.println("-----------M E N U------------");
			System.out.println("1 추가");
			System.out.println("2 정렬");
			System.out.println("3 확인");
			System.out.println("4 종료");
			System.out.println("-----------M E N U------------");
			System.out.print("번호 : ");
			n = sc.nextInt();
			switch(n) {
			case 1:
				System.out.print("단어 입력 : ");
				String word = sc.next();
				add(word);
				break;
			case 2:
				System.out.print("오름차순 여부(1:오름차순, 0:내림차순) : ");
				int no = sc.nextInt();
				if(no==1)sort(true); else sort(false);
				break;
			case 3:
				show();
				break;
			case 4: 
				System.out.println("종료합니다");
				System.exit(-1);
				break;
			default:
				System.out.println("다시입력하세요");
			}
		}

	}

}
