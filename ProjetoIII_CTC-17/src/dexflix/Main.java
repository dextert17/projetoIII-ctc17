package dexflix;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	@SuppressWarnings("resource")
	public static void main(String[] args) throws FileNotFoundException {
		Scanner scanner = new Scanner(new FileReader("movies.dat")).useDelimiter("\\::|\\n");
		
		Movie movie;
		ArrayList<Movie> movies = new ArrayList<Movie>();
		int i;
		
		while (scanner.hasNext()) {
			int id = scanner.nextInt();
			String title = scanner.next();
			String genres = scanner.next();
			
			movie = new Movie (id, title);
			
			Scanner auxscan = new Scanner(genres).useDelimiter("\\|");
			while (auxscan.hasNext()) {
				String genre = auxscan.next();
				movie.addGenre(genre);
			}
			
			movies.add(movie);
		}
		
		for (i = 0; i < movies.size(); i++) {
			System.out.println("ID: " + movies.get(i).getId());
			System.out.println("Movie: " + movies.get(i).getTitle());
			System.out.println("Genres: " + movies.get(i).getGenres() + "\n");
		}
		
		System.exit(0);
	}
}
