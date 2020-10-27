package java_board;

public class Reply {
	private int id;
	private int parentId;
	private String replyBody;
	private String replyNick;
	private String regDate;
	
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
	public String getReplyBody() {
		return replyBody;
	}
	public void setReplyBody(String replyBody) {
		this.replyBody = replyBody;
	}
	public String getReplyNick() {
		return replyNick;
	}
	public void setReplyNick(String replyNick) {
		this.replyNick = replyNick;
	}
	public String getRegDate() {
		return regDate;
	}
	public void setRegDate(String regDate) {
		this.regDate = regDate;
	}
	
}
