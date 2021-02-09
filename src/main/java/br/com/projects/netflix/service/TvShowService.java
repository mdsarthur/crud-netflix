package br.com.projects.netflix.service;

import java.util.List;

import br.com.projects.netflix.model.TvShow;
import br.com.projects.netflix.service.impl.TvShowServiceImpl;

/**
 * This interface determinates all the necessary methods that every {@link TvShowServiceImpl} must define to work properly.
 * @author Arthur Souza
 * @since 1.0
 * @see br.com.projects.netflix.service.impl.TvShowServiceImpl
 */
public interface TvShowService
{
	public boolean saveTvShow(TvShow tvShow);
	public TvShow findItemById(Long id);
	public List<TvShow> findAllTvShows();
	public boolean updateTvShow(TvShow substituteTvShow);
	public boolean deleteTvShow(Long id);
}