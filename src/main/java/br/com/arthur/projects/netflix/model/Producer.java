package br.com.arthur.projects.netflix.model;

import java.math.BigDecimal;

/**
 * This class extends {@link Person} class, specifying a Producer.
 * @author Arthur Souza
 * @since 1.0
 */
public class Producer extends Person
{
	// Attributes
	private BigDecimal maxBudgetValue;

	// Getters and Setters	
	public BigDecimal getMaxBudgetValue()
	{
		return maxBudgetValue;
	}

	public void setMaxBudgetValue(BigDecimal maxBudgetValue)
	{
		this.maxBudgetValue = maxBudgetValue;
	}		
}
