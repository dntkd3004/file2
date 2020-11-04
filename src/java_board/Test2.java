package java_board;

import java.util.ArrayList;
import java.util.Collections;

public class Test2 {

	public static void main(String[] args) {
		
//		ArrayList<String> strings = new ArrayList<>();
//
//		strings.add("aaa");
//		strings.add("bbb");
//		strings.add("aaa");
//		strings.add("ccc");
//		strings.add("aaa");
		
//		SimpleDateFormat format1 = new SimpleDateFormat ( "yyyy.MM.dd");
//		Date time = new Date();
//		String time1 = format1.format(time);
//		System.out.println(time1);
		
//		//게시물 제목
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
		
		int[] intArr = {3,1,4,5,2};
		ArrayList<Integer> intList = new ArrayList<>();
		intList.add(3);
		intList.add(1);
		intList.add(4);
		intList.add(5);
		intList.add(2);
		
		Collections.sort(intList);
		Collections.sort(intList, Collections.reverseOrder());
	
		for(int i = 0 ; i < intList.size(); i++) {
			System.out.println(intList.get(i));
		}
	}

}
