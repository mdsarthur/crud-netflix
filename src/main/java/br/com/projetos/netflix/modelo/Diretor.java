package br.com.projetos.netflix.modelo;

import java.math.BigDecimal;

public class Diretor extends Pessoa
{
	// Atributos
	private BigDecimal valorMinimoDeContratacao;

	// Construtores
	public Diretor()
	{
		super();
	}
	
	//Getters e Setters
	public BigDecimal getValorMinimoDeContratacao()
	{
		return valorMinimoDeContratacao;
	}

	public void setValorMinimoDeContratacao(BigDecimal valorMinimoDeContratacao)
	{
		this.valorMinimoDeContratacao = valorMinimoDeContratacao;
	}	
}
