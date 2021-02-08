package br.com.projects.netflix.model;

import java.util.Collections;
import java.util.List;

public class TvShow extends Title
{
	// Attributes
	private int numberOfSeasons;
	private boolean onGoing;
	private boolean spinOff;
	private List<Season> seasons;
	
	// Getters and Setters
	public int getNumberOfSeasons()
	{
		return numberOfSeasons;
	}
	
	public void setNumberOfSeasons(int numberOfSeasons)
	{
		this.numberOfSeasons = numberOfSeasons;
	}
	
	public boolean isOnGoing()
	{
		return onGoing;
	}
	
	public void setOnGoing(boolean onGoing)
	{
		this.onGoing = onGoing;
	}
	
	public boolean isSpinOff()
	{
		return spinOff;
	}
	
	public void setSpinOff(boolean spinOff)
	{
		this.spinOff = spinOff;
	}

	public List<Season> getSeasons()
	{
		return Collections.unmodifiableList(seasons);
	}

	public void setSeasons(List<Season> seasons)
	{
		this.seasons = seasons;
	}
}