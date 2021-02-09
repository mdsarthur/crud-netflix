package br.com.projects.netflix.model;

import java.math.BigDecimal;

/**
 * This class extends {@link Person} class, specifying an Actor.
 * @author Arthur Souza
 * @since 1.0
 */
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