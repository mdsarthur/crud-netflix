package br.com.projects.netflix.service;

import java.util.List;

import br.com.projects.netflix.model.TvShow;

public interface TvShowService
{
	public boolean saveTvShow(TvShow tvShow);
	public TvShow findItemById(Long id);
	public List<TvShow> findAllTvShows();
	public boolean updateTvShow(TvShow substituteTvShow);
	public boolean deleteTvShow(Long id);
}