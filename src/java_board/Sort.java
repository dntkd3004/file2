package java_board;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Sort {
	public static void main(String[] args){
		ArrayList<Movie> movieList = new ArrayList();

		movieList.add(new Movie("어벤져스", "액션", "12세 관람가"));
		movieList.add(new Movie("범죄도시", "액션", "19세 관람가"));
		movieList.add(new Movie("미션임파서블", "액션", "15세 관람가"));

		System.out.print("Title 정렬 전 :");

		for(Movie movie : movieList){
			System.out.print("[" + movie.getTitle() + "]");
		}

		System.out.println();

		Collections.sort(movieList);

		System.out.print("Title 오름차순 정렬 : ");

		for(Movie movie : movieList){
			System.out.print("[" + movie.getTitle() + "]");
		}

	}
}
