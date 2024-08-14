package io.watchparty.movies_info_service.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.watchparty.movies_info_service.DTO.Movie;

@RestController
@RequestMapping("/movies")
public class MovieController {
	
	@RequestMapping("/{movieId}")
	public Movie getMovieInfo(@PathVariable("movieId") String movieId) {
		return new Movie(movieId, "Test Movie Name");
		
	}

}
