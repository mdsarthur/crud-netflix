package br.com.projetos.netflix.modelo;

import java.math.BigDecimal;

public class Ator extends Pessoa
{
	// Atributos
	private BigDecimal valorMedioPorHora;
	
	// Construtores
	public Ator()
	{
		super();
	}

	// Getters e Setters
	public BigDecimal getValorMedioPorHora()
	{		
		return valorMedioPorHora;
	}

	public void setValorMedioPorHora(BigDecimal valorMedioPorHora)
	{
		this.valorMedioPorHora = valorMedioPorHora;
	}
}
