package br.com.projects.netflix.model;

import java.math.BigDecimal;

public class Actor extends Person
{
	// Attributes
	private BigDecimal averagePricePerHour;

	// Getters and Setters
	public BigDecimal getAveragePricePerHour()
	{		
		return averagePricePerHour;
	}

	public void setAveragePricePerHour(BigDecimal averagePricePerHour)
	{
		this.averagePricePerHour = averagePricePerHour;
	}
}