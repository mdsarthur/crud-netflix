package br.com.projects.netflix.model;

import java.math.BigDecimal;

/**
 * This class extends {@link Person} class, specifying a Director.
 * @author Low
 * @since 1.0
 */
public class Director extends Person
{
	// Attributes
	private BigDecimal minimumPriceToHire;
	
	// Getters and Setters
	public BigDecimal getMinimumPriceToHire()
	{
		return minimumPriceToHire;
	}

	public void setMinimumPriceToHire(BigDecimal minimumPriceToHire)
	{
		this.minimumPriceToHire = minimumPriceToHire;
	}
}