package br.com.projects.netflix.model;

import java.math.BigDecimal;
import java.time.Duration;

public class Movie extends Title
{
	// Attributes
	private String saga;
	private Duration duration;
	private BigDecimal grossSaleValue;

	// Getters and Setters
	public String getSaga()
	{
		return saga;
	}
	public void setSaga(String saga)
	{
		this.saga = saga;
	}
	public Duration getDuration()
	{
		return duration;
	}
	public void setDuration(Duration duration)
	{
		this.duration = duration;
	}
	public BigDecimal getGrossSaleValue()
	{
		return grossSaleValue;
	}
	public void setGrossSaleValue(BigDecimal grossSaleValue)
	{
		this.grossSaleValue = grossSaleValue;
	}

	@Override
	public String toString()
	{
		return this.getName() + " " + this.getYearRelease() + " " + this.getId();
	}
}