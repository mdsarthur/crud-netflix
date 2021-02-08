package br.com.projects.netflix.model;

import java.util.Collections;
import java.util.List;

import br.com.projects.netflix.entity.Entity;
import br.com.projects.netflix.model.enums.AdvisoryRating;
import br.com.projects.netflix.model.enums.Genre;

public abstract class Title implements Entity
{
	// Attributes
	private Long id;
	private String name;
	private int releaseYear;
	private String synopsis;
	private AdvisoryRating advisoryRating;
	private Genre mainGenre;
	private List<Actor> mainCast;
	private List<Producer> mainProducers;
	private List<Director> mainDirectors;

	// Getters and Setters
	@Override
	public Long getId()
	{
		return id;
	}
	
	@Override
	public void setId(Long id)
	{
		this.id = id;
	}
	
	public String getName()
	{
		return name;
	}
	
	public void setName(String nome)
	{
		this.name = nome;
	}
	
	public int getYearRelease()
	{
		return releaseYear;
	}
	
	public void setYearRelease(int releaseYear)
	{
		this.releaseYear = releaseYear;
	}
	
	public String getSynopsis()
	{
		return synopsis;
	}
	
	public void setSynopsis(String synopsis)
	{
		this.synopsis = synopsis;
	}
	
	public AdvisoryRating getAdvisoryRating()
	{
		return advisoryRating;
	}
	
	public void setAdvisoryRating(AdvisoryRating advisoryRating)
	{
		this.advisoryRating = advisoryRating;
	}
	
	public Genre getMainGenre()
	{
		return mainGenre;
	}

	public void setMainGenre(Genre mainGenre)
	{
		this.mainGenre = mainGenre;
	}

	public List<Actor> getMainCast()
	{
		return Collections.unmodifiableList(mainCast);
	}

	public void setMainCast(List<Actor> mainCast)
	{
		this.mainCast = mainCast;
	}

	public List<Producer> getMainProducers()
	{
		return Collections.unmodifiableList(mainProducers);
	}

	public void setMainProducers(List<Producer> mainProducers)
	{
		this.mainProducers = mainProducers;
	}

	public List<Director> getMainDirectors()
	{
		return Collections.unmodifiableList(mainDirectors);
	}

	public void setMainDirectors(List<Director> mainDirectors)
	{
		this.mainDirectors = mainDirectors;
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
		Title other = (Title) obj;
		if (id == null)
		{
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}	
}