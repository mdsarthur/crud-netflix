package br.com.projects.netflix.service.impl;

import java.util.List;

import br.com.projects.netflix.model.TvShow;
import br.com.projects.netflix.repository.Repository;
import br.com.projects.netflix.service.TvShowService;

public class TvShowServiceImpl implements TvShowService
{
	private Repository<TvShow> repo;
	
	public TvShowServiceImpl(Repository<TvShow> repo)
	{
		this.repo = repo;
	}	
	
	@Override
	public boolean saveTvShow(TvShow tvShow)
	{
		return this.repo.saveItem(tvShow);
	}

	@Override
	public TvShow findItemById(Long id)
	{
		return this.repo.findItemById(id);
	}

	@Override
	public List<TvShow> findAllTvShows()
	{
		return this.repo.findAllItems();
	}

	@Override
	public boolean updateTvShow(TvShow substituteTvShow)
	{
		return this.repo.updateItem(substituteTvShow);
	}

	@Override
	public boolean deleteTvShow(Long id)
	{
		return this.repo.deleteItem(id);
	}
}
