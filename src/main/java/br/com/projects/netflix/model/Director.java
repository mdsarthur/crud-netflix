package br.com.projects.netflix.model;

import java.math.BigDecimal;

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