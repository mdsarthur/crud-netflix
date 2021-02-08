package br.com.projects.netflix.model;

import java.math.BigDecimal;

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
