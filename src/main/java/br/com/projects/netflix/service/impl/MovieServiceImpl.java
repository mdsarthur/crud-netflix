package br.com.projects.netflix.service.impl;

import java.util.List;

import br.com.projects.netflix.model.Movie;
import br.com.projects.netflix.service.MovieService;
import br.com.projects.netflix.repository.Repository;
import br.com.projects.netflix.repository.impl.RepositoryImpl;

/**
 * This class is the implementation/definition of {@link MovieService} interface. It contains all the methods needed to
 * save, retrieve and modify objects from a {@link Repository} of the same type.
 * 
 * @author Arthur Souza
 * @since 1.0
 * @see br.com.projects.netflix.repository.Repository
 * @see br.com.projects.netflix.service.MovieService
 */
public class MovieServiceImpl implements MovieService
{	
	private Repository<Movie> repo;
	
    /**
     * Constructs a new {@link MovieServiceImpl}.
     *
     * @param repo {@link Repository} reference which is gonna be used to save, retrieve and modify {@link Movie} objects
     */
	public MovieServiceImpl(Repository<Movie> repo)
	{
		this.repo = repo;
	}
	
	/**
	 * Saves a movie in its repository.
	 * 
	 * @param  movie movie to be saved in its repository
	 * @return See   {@link RepositoryImpl#saveItem(E) saveItem}
	 */
	@Override
	public boolean saveMovie(Movie movie)
	{
		return this.repo.saveItem(movie);
	}

	/**
	 * Searches for a movie in its repository.
	 * 
	 * @param  id  ID from the movie meant to be found in its repository
	 * @return See {@link RepositoryImpl#findItemById(Long) findItemById}
	 */
	@Override
	public Movie findMovieById(Long id)
	{
		return this.repo.findItemById(id);
	}

	/**
	 * Retrieves an unmodifiable list containing all the existing movies in its repository.
	 * 
	 * @return See {@link RepositoryImpl#findAllItems() findAllItems}
	 */
	@Override
	public List<Movie> findAllMovies()
	{
		return this.repo.findAllItems();
	}

	/**
	 * Updates an existing movie from its repository.
	 * 
	 * @param  substituteMovie movie to replace an another movie in the repository based on its containing ID
	 * @return See             {@link RepositoryImpl#updateItem(E) updateItem}
	 */
	@Override
	public boolean updateMovie(Movie substituteMovie)
	{
		return this.repo.updateItem(substituteMovie);
	}

	/**
	 * Deletes a movie from the repository based on its ID.
	 * 
	 * @param  id  ID from the movie meant to be deleted from repository
	 * @return See {@link RepositoryImpl#deleteItem(Long) deleteItem}
	 */
	@Override
	public boolean deleteMovie(Long id)
	{
		return this.repo.deleteItem(id);
	}	
}
