package java_board;


public class Movie implements Comparable<Movie> {
    private String title;
    private String Category;
    private String grade;
     
	public Movie(String title, String category, String grade) {
		this.title = title;
		Category = category;
		this.grade = grade;
	}
	public String getTitle() {
		return title;
	}
	public String getCategory() {
		return Category;
	}
	public String getGrade() {
		return grade;
	}
	public int compareTo(Movie movie) {
		 return this.title.compareTo(movie.title);
	}
    
    
}
