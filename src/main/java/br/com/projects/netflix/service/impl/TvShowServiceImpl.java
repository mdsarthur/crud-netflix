package br.com.projects.netflix.service.impl;

import java.util.List;

import br.com.projects.netflix.model.TvShow;
import br.com.projects.netflix.service.TvShowService;
import br.com.projects.netflix.repository.Repository;
import br.com.projects.netflix.repository.impl.RepositoryImpl;


/**
 * This class is the implementation/definition of {@link TvShowService} interface. It contains all the methods needed to
 * save, retrieve and modify objects from a {@link Repository} of the same type.
 * 
 * @author Arthur Souza
 * @since 1.0
 * @see br.com.projects.netflix.repository.Repository
 * @see br.com.projects.netflix.service.TvShowService
 */
public class TvShowServiceImpl implements TvShowService
{
	private Repository<TvShow> repo;
	
    /**
     * Constructs a new {@link TvShowServiceImpl}.
     *
     * @param  repo Reference which is gonna be used to save, retrieve and modify {@link TvShow} objects
     */
	public TvShowServiceImpl(Repository<TvShow> repo)
	{
		this.repo = repo;
	}
	
	/**
	 * Saves a tvShow in its repository.
	 * 
	 * @param  tvShow tvShow to be saved in its repository
	 * @return See    {@link RepositoryImpl#saveItem(E) saveItem}
	 */
	@Override
	public boolean saveTvShow(TvShow tvShow)
	{
		return this.repo.saveItem(tvShow);
	}

	/**
	 * Searches for a tvShow in its repository.
	 * 
	 * @param  id  ID from the tvShow meant to be found in its repository
	 * @return See {@link RepositoryImpl#findItemById(Long) findItemById}
	 */
	@Override
	public TvShow findItemById(Long id)
	{
		return this.repo.findItemById(id);
	}

	/**
	 * Retrieves an unmodifiable list containing all the existing tvShows in its repository.
	 * 
	 * @return See {@link RepositoryImpl#findAllItems() findAllItems}
	 */
	@Override
	public List<TvShow> findAllTvShows()
	{
		return this.repo.findAllItems();
	}

	/**
	 * Updates an existing tvShow from its repository.
	 * 
	 * @param  substituteTvShow tvShow to replace an another tvShow in the repository based on its containing ID
	 * @return See              {@link RepositoryImpl#updateItem(E) updateItem}
	 */
	@Override
	public boolean updateTvShow(TvShow substituteTvShow)
	{
		return this.repo.updateItem(substituteTvShow);
	}

	/**
	 * Deletes a tvShow from the repository based on its ID.
	 * 
	 * @param  id  ID from the tvShow meant to be deleted from repository
	 * @return See {@link RepositoryImpl#deleteItem(Long) deleteItem}
	 */
	@Override
	public boolean deleteTvShow(Long id)
	{
		return this.repo.deleteItem(id);
	}
}
