package br.com.projects.netflix.model;

import java.time.Duration;

public class Episode
{
	// Attributes
	private Long id;
	private int episodeNumber;
	private Duration averageEpisodeDuration;

	// Getters and Setters	
	public Long getId()
	{
		return id;
	}
	
	public void setId(Long id)
	{
		this.id = id;
	}

	public int getEpisodeNumber()
	{
		return episodeNumber;
	}

	public void setEpisodeNumber(int episodeNumber)
	{
		this.episodeNumber = episodeNumber;
	}

	public Duration getAverageEpisodeDuration()
	{
		return averageEpisodeDuration;
	}

	public void setAverageEpisodeDuration(Duration averageEpisodeDuration)
	{
		this.averageEpisodeDuration = averageEpisodeDuration;
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
		Episode other = (Episode) obj;
		if (id == null)
		{
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}	
}