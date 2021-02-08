package br.com.projects.netflix.service;

import java.util.List;

import br.com.projects.netflix.model.Movie;

public interface MovieService
{
	public boolean saveMovie(Movie movie);
	public Movie findMovieById(Long id);
	public List<Movie> findAllMovies();
	public boolean updateMovie(Movie substituteMovie);
	public boolean deleteMovie(Long id);
}
