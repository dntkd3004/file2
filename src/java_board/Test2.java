package java_board;

import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String cmd1 = scan.nextLine();
		System.out.println(cmd1);
		
		int a = Integer.parseInt("123");//문자열된 숫자를 숫자로 변환
		scan.nextLine(); //클리어 작업
		
		String cmd2 = scan.nextLine();
		System.out.println(cmd2);	
	}

}
