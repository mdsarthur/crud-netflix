package br.com.projects.netflix.model;

import java.util.Collections;
import java.util.List;

/**
 * This class is used by {@link TvShow} class in order to specify characteristics of a season from a tv show.
 * @author Arthur Souza
 * @since 1.0
 */
public class Season
{
	// Attributes
	private Long id;
	private int seasonNumber;
	private int numberOfEpisodes;
	private List<Episode> episodes;

	// Getters and Setters
	public Long getId()
	{
		return id;
	}
	
	public void setId(Long id)
	{
		this.id = id;
	}

	public int getSeasonNumber()
	{
		return seasonNumber;
	}

	public void setSeasonNumber(int seasonNumber)
	{
		this.seasonNumber = seasonNumber;
	}

	public int getNumberOfEpisodes()
	{
		return numberOfEpisodes;
	}

	public void setNumberOfEpisodes(int numberOfEpisodes)
	{
		this.numberOfEpisodes = numberOfEpisodes;
	}

	public List<Episode> getEpisodes()
	{
		return Collections.unmodifiableList(episodes);
	}

	public void setEpisodes(List<Episode> episodes)
	{
		this.episodes = episodes;
	}

	@Override
	public int hashCode()
	{
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj)
	{
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Season other = (Season) obj;
		if (id == null)
		{
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
}