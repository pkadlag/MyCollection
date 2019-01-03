package com.collections.advancedCollection.movieTest;

/**
 * 2)	Create class Movie_Details with field’s mov_Name, lead_actor, lead_actress, and genre  add setter and getter method in that class. 
 a.	After creating this class create class Movie_DetailsList class who will maintain all the objects.
 b.	Movie_DetailsList class should have method add_movie(), remove_movie(), remove_AllMovies(), find_movie_By_mov_Name(), find_movie_By_Genre()
 c.	Movie_DetailsList should have method which will take an argument that will be use to determine on which to sort
 */

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import com.collections.advancedCollection.movie.MovieDetails;
import com.collections.advancedCollection.movie.MovieDetailsList;

public class MovieDetailsTest {

	private MovieDetails movie1;
	private MovieDetails movie2;
	private MovieDetails movie3;
	private MovieDetails movie4;

	private MovieDetailsList movieDetailsList;

	@Before
	public void setUp() {
		movie1 = new MovieDetails("Ajab Prem Ki ghazab kahani",
				"Ranbir Kapoor", "Katrina Kaif", "Romantic");
		movie2 = new MovieDetails("Taare Zameen par", "Amir Khan",
				"Girija Oak", "Inspiration");
		movie3 = new MovieDetails("Golmal", "Ajay devgan", "Karina Kapoor",
				"Comedy");
		movie4 = new MovieDetails("Bahubali", "prabhas", "Tamannah", "Action");

		movieDetailsList = new MovieDetailsList();

	}

	@Before
	public void addMovie() {
		movieDetailsList.addMovie(movie1);
		movieDetailsList.addMovie(movie2);
		movieDetailsList.addMovie(movie3);
		movieDetailsList.addMovie(movie4);

	}

	@Test
	public void testToCheckAddListOfMovies() {
		String actual = movieDetailsList.toString();
		String expected = "MovieDetailsList [arrayList=[MovieDetails [movieName=Ajab Prem Ki ghazab kahani, leadActor=Ranbir Kapoor, leadActress=Katrina Kaif, genre=Romantic], MovieDetails [movieName=Taare Zameen par, leadActor=Amir Khan, leadActress=Girija Oak, genre=Inspiration], MovieDetails [movieName=Golmal, leadActor=Ajay devgan, leadActress=Karina Kapoor, genre=Comedy], MovieDetails [movieName=Bahubali, leadActor=prabhas, leadActress=Tamannah, genre=Action]]]";
		assertEquals(expected, actual);

	}

	@Test
	public void testForRemoveSpecifiedMovie() {

		boolean actual = movieDetailsList.removeMovie(movie1);
		boolean expected = true;
		assertEquals(expected, actual);

	}

	@Test
	public void testForRemoveAllMovies() {
		boolean actual = movieDetailsList.removeAllMovies();
		boolean expected = true;
		assertEquals(expected, actual);

	}

	@Test
	public void testForSearchMovieByName() {

		MovieDetails movie = movieDetailsList.getMovieByMovieName("Golmal");
		String actual = movie.toString();
		String expected = "MovieDetails [movieName=Golmal, leadActor=Ajay devgan, leadActress=Karina Kapoor, genre=Comedy]";
		assertEquals(expected, actual);

	}

	@Test
	public void testForSearchMovieByActorName() {

		MovieDetails movie = movieDetailsList.getMovieByGenre("Action");
		String actual = movie.toString();
		String expected = "MovieDetails [movieName=Bahubali, leadActor=prabhas, leadActress=Tamannah, genre=Action]";
		assertEquals(expected, actual);

	}

	@Test
	public void testForSortingMoviesByMovieName() {

		String actual = movieDetailsList.sort(1).toString();
		String expected = "[MovieDetails [movieName=Ajab Prem Ki ghazab kahani, leadActor=Ranbir Kapoor, leadActress=Katrina Kaif, genre=Romantic], MovieDetails [movieName=Bahubali, leadActor=prabhas, leadActress=Tamannah, genre=Action], MovieDetails [movieName=Golmal, leadActor=Ajay devgan, leadActress=Karina Kapoor, genre=Comedy], MovieDetails [movieName=Taare Zameen par, leadActor=Amir Khan, leadActress=Girija Oak, genre=Inspiration]]";
		assertEquals(expected, actual);

	}

	@Test
	public void testForSortingMoviesByMovieActorName() {

		String actual = movieDetailsList.sort(2).toString();
		String expected = "[MovieDetails [movieName=Golmal, leadActor=Ajay devgan, leadActress=Karina Kapoor, genre=Comedy], MovieDetails [movieName=Taare Zameen par, leadActor=Amir Khan, leadActress=Girija Oak, genre=Inspiration], MovieDetails [movieName=Ajab Prem Ki ghazab kahani, leadActor=Ranbir Kapoor, leadActress=Katrina Kaif, genre=Romantic], MovieDetails [movieName=Bahubali, leadActor=prabhas, leadActress=Tamannah, genre=Action]]";
		assertEquals(expected, actual);

	}

	@Test
	public void testForSortingMoviesByMovieActressName() {

		String actual = movieDetailsList.sort(3).toString();
		String expected = "[MovieDetails [movieName=Taare Zameen par, leadActor=Amir Khan, leadActress=Girija Oak, genre=Inspiration], MovieDetails [movieName=Golmal, leadActor=Ajay devgan, leadActress=Karina Kapoor, genre=Comedy], MovieDetails [movieName=Ajab Prem Ki ghazab kahani, leadActor=Ranbir Kapoor, leadActress=Katrina Kaif, genre=Romantic], MovieDetails [movieName=Bahubali, leadActor=prabhas, leadActress=Tamannah, genre=Action]]";
		assertEquals(expected, actual);

	}

	@Test
	public void testForSortingMoviesByMovieGenre() {

		String actual = movieDetailsList.sort(4).toString();
		String expected = "[MovieDetails [movieName=Bahubali, leadActor=prabhas, leadActress=Tamannah, genre=Action], MovieDetails [movieName=Golmal, leadActor=Ajay devgan, leadActress=Karina Kapoor, genre=Comedy], MovieDetails [movieName=Taare Zameen par, leadActor=Amir Khan, leadActress=Girija Oak, genre=Inspiration], MovieDetails [movieName=Ajab Prem Ki ghazab kahani, leadActor=Ranbir Kapoor, leadActress=Katrina Kaif, genre=Romantic]]";
		assertEquals(expected, actual);

	}
}
