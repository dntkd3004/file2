package java_board;

public class Like {
	private int id;
	private int parentId;
	private int Likeflags;
	private int checkMemberID;
	private String regDate;
	
	public Like() {
		
	}
		
	public Like(int parentId, int likeflags, int checkMemberID, String regDate) {
		this.parentId = parentId;
		Likeflags = likeflags;
		this.checkMemberID = checkMemberID;
		this.regDate = regDate;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getParentId() {
		return parentId;
	}
	public void setParentId(int parentId) {
		this.parentId = parentId;
	}
	public int getLikeflags() {
		return Likeflags;
	}
	public void setLikeflags(int likeflags) {
		Likeflags = likeflags;
	}
	public int getCheckMemberID() {
		return checkMemberID;
	}
	public void setCheckMemberID(int checkMemberID) {
		this.checkMemberID = checkMemberID;
	}
	public String getRegDate() {
		return regDate;
	}

	public void setRegDate(String regDate) {
		this.regDate = regDate;
	}
}
