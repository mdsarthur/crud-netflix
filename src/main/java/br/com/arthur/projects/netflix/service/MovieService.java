package br.com.arthur.projects.netflix.service;

import java.util.List;

import br.com.arthur.projects.netflix.model.Movie;
import br.com.arthur.projects.netflix.service.impl.MovieServiceImpl;

/**
 * This interface determinates all the necessary methods that every {@link MovieServiceImpl} must define to work properly.
 * @author Arthur Souza
 * @since 1.0
 * @see br.com.arthur.projects.netflix.service.impl.MovieServiceImpl
 */
public interface MovieService
{
	public boolean saveMovie(Movie movie);
	public Movie findMovieById(Long id);
	public List<Movie> findAllMovies();
	public boolean updateMovie(Movie substituteMovie);
	public boolean deleteMovie(Long id);
}