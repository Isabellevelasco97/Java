package assignment3;

public class Movie {
	
	private String title;
	private String studio;
	private String rating;

	// Write a constructor for the class Movie, which takes a String representing
	// the title of themovie, a String representing the studio, and a String
	// representing the rating as itsarguments, and sets the respective class
	// variables to these values.
	public Movie(String title, String studio, String rating) {
		this.title = title;
		this.studio = studio;
		this.rating = rating;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getStudio() {
		return studio;
	}

	public void setStudio(String studio) {
		this.studio = studio;
	}

	public String getRating() {
		return rating;
	}

	public void setRating(String rating) {
		this.rating = rating;
	}
	// Write a second constructor for the class Movie, which takes a String
	// representing the titleof the movie and a String representing the studio as
	// its arguments, and sets the respectiveclass variables to these values, while
	// the class variable rating is set to "PG".	
	public Movie(String title, String studio) {
		this.title = title;
		this.studio = studio;
		this.rating = "PG";
	}
	
	// Write a method getPG, which takes an array of base type Movie as its
	// argument, and returns a new array of only those movies in the input array with
	// a rating of "PG". You may assume the input array is full of Movie instances.
	// The returned array need not be full.	
	public Movie[] getPg (Movie[] movies) {
		int counter = 0;
		for (int i = 0; i < movies.length; i++) {
			Movie currentMovie = movies[i];
			if(currentMovie.getRating().equals("PG")) {
				counter += 1;
			}
		}
		
		Movie[] pgMovies = new Movie[counter];
		
		counter = 0;
		for (int i = 0; i < movies.length; i++) {
			Movie currentMovie = movies[i];
			if(currentMovie.getRating().equals("PG")) {
				pgMovies[counter] = currentMovie;
				counter++;
			}
		}
		
		return pgMovies;
	}
		
}
