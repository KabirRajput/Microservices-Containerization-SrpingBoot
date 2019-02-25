package com.fdm.MovieApp.movieinfoservice;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fdm.MovieApp.Models.Movie;

@RestController
@RequestMapping("/movie")
public class MovieResource {

	@RequestMapping("/{movieId}")
	public Movie getMovieInfo(@PathVariable("movieId") String movieId) {
		System.out.println("movieResurceID"+ movieId);
		 return new Movie(movieId, "Name for ID " + movieId);
		
	}
}
