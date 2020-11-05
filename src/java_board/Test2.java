package java_board;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Test2 {

	public static void main(String[] args) {	
		//게시물 제목
//		String str = "사과(apple) 가격은 개당 1,000원 입니다.";
//		System.out.println(str.contains("aaa")); 
//		// contains 사용
//		if (str.contains("aaa")) {// 검색키워드와 비교
//			System.out.println("contain - 포함");
//		} else {
//			System.out.println("contain - 미포함");
//		}
//		System.out.println(str.contains("APPLE")); // false
//		System.out.println(str.contains("apple")); // true
		//문자열된 숫자를 숫자로 변환
//		Scanner scan = new Scanner(System.in);
//		
//		String cmd1 = scan.nextLine();
//		System.out.println(cmd1);
//		
//		int a = Integer.parseInt("123");//문자열된 숫자를 숫자로 변환
//		scan.nextLine(); //클리어 작업
//		
//		String cmd2 = scan.nextLine();
//		System.out.println(cmd2);
		
		ArrayList<Integer> list = new ArrayList<>();
		ArrayList<Num> nlist = new ArrayList<Num>();

		list.add(4);
		list.add(1);
		list.add(2);
		list.add(5);
		list.add(3);
		
		printList(list);
		Collections.sort(list);	//오름차순
		printList(list);
		Collections.sort(list, Collections.reverseOrder());	//내림차순
		printList(list);
		
		nlist.add(new Num(4, 5));
		nlist.add(new Num(1, 1));
		nlist.add(new Num(2, 4));
		nlist.add(new Num(5, 3));
		nlist.add(new Num(3, 2));
		
		//개체 타입 정렬 - 정렬 기준 정해주는 것
		MyCompartor comp = new MyCompartor();
		Collections.sort(nlist, comp);

		for (int i = 0; i < nlist.size(); i++) {
			System.out.println(nlist.get(i).n2);
		}
	}

	private static void printList(ArrayList<Integer> list) {
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
	}

}

class MyCompartor implements Comparator<Num> {
	@Override
	public int compare(Num o1, Num o2) {
		if(o1.n2 > o2.n2) {// 왼쪽 값이 더 크면 자리를 바꿔라 -> 오름차순 <-> 오른쪽 값이 더 클때 바꾸지 마라 -> 내림차순
			return 1;	//0,1 바꿔라
		}
		return -1; // -1 바꾸지 마라
	}
}

class Num {

	int n1;
	int n2;

	Num(int a, int b) {
		n1 = a;
		n2 = b;
	}

}
