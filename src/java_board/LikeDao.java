package java_board;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class LikeDao {

	private ArrayList<Like> likes;
	private int no = 1;

	public LikeDao() {
		likes = new ArrayList<>(); 
	}

	public void insertLike(Like l) {
		l.setId(no);
		no++;
		l.setRegDate(getCurrentDate());

		likes.add(l);
	}
	private static String getCurrentDate() {
		SimpleDateFormat format1 = new SimpleDateFormat("yyyy.MM.dd");
		Date time = new Date();
		String time1 = format1.format(time);

		return time1;
	}
	public ArrayList<Like> getLikeByArticleIdAndMemberId(int parentId, int memberId) {
		ArrayList<Like> searchedLikes = new ArrayList<>();
		for (int i = 0; i < likes.size(); i++) {
			Like like = likes.get(i);
			if (like.getParentId() == parentId && like.CheckMemberId() == memeberId) {
				searchedLikes.add(like);
			}
		}
		return searchedLikes;
	}
}
