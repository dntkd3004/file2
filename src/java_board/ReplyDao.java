package java_board;

import java.util.ArrayList;

public class ReplyDao {

	private ArrayList<Reply> replies;
	private int no = 1;

	public ReplyDao() {
		replies = new ArrayList<>(); 
	}

	public void insertReply(Reply a) {
		a.setId(no);
		no++;
		a.setRegDate(Util.getCurrentDate());

		replies.add(a);
	}
	public ArrayList<Reply> getReplies() {
		return replies;
	}

	public ArrayList<Reply> getRepliesByParentId(int parentId) {
		ArrayList<Reply> searchedReplies = new ArrayList<>();
		for (int i = 0; i < replies.size(); i++) {
			Reply reply = replies.get(i);
			if (reply.getParentId() == parentId) {
				searchedReplies.add(reply);
			}
		}
		return searchedReplies;
	} 
}
