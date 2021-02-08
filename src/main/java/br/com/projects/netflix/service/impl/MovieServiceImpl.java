package br.com.projects.netflix.service.impl;

import java.util.List;

import br.com.projects.netflix.model.Movie;
import br.com.projects.netflix.repository.Repository;
import br.com.projects.netflix.service.MovieService;

public class MovieServiceImpl implements MovieService
{	
	private Repository<Movie> repo;
	
	public MovieServiceImpl(Repository<Movie> repo)
	{
		this.repo = repo;
	}
	
	@Override
	public boolean saveMovie(Movie movie)
	{
		return this.repo.saveItem(movie);
	}

	@Override
	public Movie findMovieById(Long id)
	{
		return this.repo.findItemById(id);
	}

	@Override
	public List<Movie> findAllMovies()
	{
		return this.repo.findAllItems();
	}

	@Override
	public boolean updateMovie(Movie substituteMovie)
	{
		return this.repo.updateItem(substituteMovie);
	}

	@Override
	public boolean deleteMovie(Long id)
	{
		return this.repo.deleteItem(id);
	}	
}
