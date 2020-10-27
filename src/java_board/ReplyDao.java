package java_board;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class ReplyDao {

	private static ArrayList<Article> replies;
	private int no = 1;

	public ReplyDao() {
		replies = new ArrayList<>();
	}

	public void insertReply(Reply a) {
		a.setId(no);
		no++;
		a.setRegDate(getCurrentDate());

		replies.add(a);
	}

	public void removeReply(Reply a) {
		replies.remove(a);
	}

	private static String getCurrentDate() {
		SimpleDateFormat format1 = new SimpleDateFormat("yyyy.MM.dd");
		Date time = new Date();
		String time1 = format1.format(time);

		return time1;
	}

	public ArrayList<Reply> getReplies() {
		return replies;
	}
	
	public ArrayList<Relay> getRepliesByParentId(int parentId) {
		ArrayList<Reply> searchedArticles = new ArrayList<>();
		
		for(int i = 0; i < replies.size(); i++) {
			Article article = replies.get(i);
			String str = replies.getPropertiesByFlag(flag);
			if (str.contains(keyword)) {
				searchedArticles.add(article);
			}
	}
}
