package java_board;

import java.text.SimpleDateFormat;
import java.util.Date;

public class time {

	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		SimpleDateFormat format1 = new SimpleDateFormat ( "yyyy.MM.dd");
		Date time = new Date();
		String time1 = format1.format(time);
		System.out.println(time1);
		//게시물 제목
		String str = "사과(apple) 가격은 개당 1,000원 입니다.";


		System.out.println(str.contains("aaa")); 
		// contains 사용
		if (str.contains("aaa")) {// 검색키워드와 비교
			System.out.println("contain - 포함");
		} else {
			System.out.println("contain - 미포함");
		}

		System.out.println(str.contains("APPLE")); // false
		System.out.println(str.contains("apple")); // true
			
	}
}

