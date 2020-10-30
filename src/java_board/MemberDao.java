package java_board;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class MemberDao {
	private ArrayList<Member> members;
	private int no = 1;

	public MemberDao() {
		members = new ArrayList<>();
	}

	public void insertMember(Member m) {
		m.setId(no);
		no++;
		m.setRegDate(getCurrentDate());

		members.add(m);
	}

	private static String getCurrentDate() {
		SimpleDateFormat format1 = new SimpleDateFormat("yyyy.MM.dd");
		Date time = new Date();
		String time1 = format1.format(time);

		return time1;
	}
	public Member getMemberBylogin(String targetid, String targetpw) {
		for (int i = 0; i < members.size(); i++) {
			String id = members.get(i).getLoginId();
			for(int j = 0; j < members.size(); j++) {
				String pw = members.get(j).getLoginPw();
				if (id.contains(targetid)) {
					if(pw.contains(targetpw)) {
						return members.get(i);
					}	
				}
			}
		}
		return null;
	}
	
	public ArrayList<Member> getMembers() {
		return members;
	}
}
