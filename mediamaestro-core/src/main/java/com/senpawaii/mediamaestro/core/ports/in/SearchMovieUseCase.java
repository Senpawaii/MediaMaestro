package com.senpawaii.mediamaestro.core.ports.in;

import com.senpawaii.mediamaestro.core.domain.Movie;

import java.util.List;

public interface SearchMovieUseCase extends SearchMediaUseCase {
    List<Movie> fetchAllMovies();
    List<Movie> fetchMoviesByDirector(String director);
}
