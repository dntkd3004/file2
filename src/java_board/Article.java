package java_board;

public class Article {
		
		private int id;
		private String title;
		private String body;
		private String name;
		private String datestr;
		private int views;

		public Article() {

		}

		public Article(int id, String title, String body, String name, String datestr, int views) {
			this.id = id;
			this.title = title;
			this.body = body;
			this.name = name;
			this.datestr = datestr;
			this.views = views;
		}

		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getTitle() {
			return title;
		}
		public void setTitle(String title) {
			this.title = title;
		}
		public String getBody() {
			return body;
		}
		public void setBody(String body) {
			this.body = body;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getDatestr() {
			return datestr;
		}

		public void setDatestr(String datestr) {
			this.datestr = datestr;
		}

		public int getViews() {
			return views;
		}

		public void setViews(int views) {
			this.views = views;
		}	
	}
