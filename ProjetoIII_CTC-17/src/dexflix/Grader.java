package dexflix;

import java.util.ArrayList;

public class Grader {
	
	public Grader () {
		//Método Construtor
	}
	
	public int priori (ArrayList<Rating> ratings, int movieId) {
		int i, n;
		float rating;
		
		n = 0;
		rating = 0;
		for (i = 0; i < ratings.size(); i++) {
			if(ratings.get(i).getMovieId() == movieId) {
				rating = rating + ratings.get(i).getRating();
				n++;
			}
		}
		
		rating = rating/n;
		
		return Math.round(rating);
	}
	
}
