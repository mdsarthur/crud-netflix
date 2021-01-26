package br.com.projetos.netflix.modelo;

import java.math.BigDecimal;

public class Produtor extends Pessoa
{
	// Atributos
	private BigDecimal valorMaximoDeOrcamento;

	// Construtores
	public Produtor()
	{
		super();
	}

	// Getters e Setters	
	public BigDecimal getValorMaximoDeOrcamento()
	{
		return valorMaximoDeOrcamento;
	}

	public void setValorMaximoDeOrcamento(BigDecimal valorMaximoDeOrcamento)
	{
		this.valorMaximoDeOrcamento = valorMaximoDeOrcamento;
	}		
}
