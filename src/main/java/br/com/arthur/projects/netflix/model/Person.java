package br.com.arthur.projects.netflix.model;

import java.time.LocalDate;

import br.com.arthur.projects.netflix.entity.Entity;
import br.com.arthur.projects.netflix.model.enums.Sex;

/**
 * This abstract class defines all the basic attributes needed by {@link Actor}, {@link Director} or {@link Producer}.
 * 
 * @author Arthur Souza
 * @since 1.0
 */
public abstract class Person implements Entity
{
	// Attributes
	private Long id;
	private String name;
	private LocalDate birthDate;
	private String biography;
	private boolean currentlyActive;
	private Sex sex;

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

	public void setName(String name)
	{
		this.name = name;
	}

	public LocalDate getBirthDate()
	{
		return birthDate;
	}

	public void setBirthDate(LocalDate birthDate)
	{
		this.birthDate = birthDate;
	}

	public String getBiography()
	{
		return biography;
	}

	public void setBiography(String biography)
	{
		this.biography = biography;
	}

	public boolean isCurrentlyActive()
	{
		return currentlyActive;
	}

	public void setCurrentlyActive(boolean currentlyActive)
	{
		this.currentlyActive = currentlyActive;
	}

	public Sex getSex()
	{
		return sex;
	}

	public void setSex(Sex sex)
	{
		this.sex = sex;
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
		Person other = (Person) obj;
		if (id == null)
		{
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}	
}