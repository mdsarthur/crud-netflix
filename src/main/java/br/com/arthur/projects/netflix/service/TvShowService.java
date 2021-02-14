package br.com.arthur.projects.netflix.service;

import java.util.List;

import br.com.arthur.projects.netflix.model.TvShow;
import br.com.arthur.projects.netflix.service.impl.TvShowServiceImpl;

/**
 * This interface determinates all the necessary methods that every {@link TvShowServiceImpl} must define to work properly.
 * @author Arthur Souza
 * @since 1.0
 * @see br.com.arthur.projects.netflix.service.impl.TvShowServiceImpl
 */
public interface TvShowService
{
	public boolean saveTvShow(TvShow tvShow);
	public TvShow findItemById(Long id);
	public List<TvShow> findAllTvShows();
	public boolean updateTvShow(TvShow substituteTvShow);
	public boolean deleteTvShow(Long id);
}