package br.com.projetos.netflix.modelo;

import java.math.BigDecimal;
import java.time.Duration;

public class Filme extends Titulo
{
	// Atributos 
	private String saga;
	private Duration duracao;
	private BigDecimal vendaEmBilheteria;

	// Getters e Setters
	public String getSaga()
	{
		return saga;
	}
	public void setSaga(String saga)
	{
		this.saga = saga;
	}
	public Duration getDuracao()
	{
		return duracao;
	}
	public void setDuracao(Duration duracao)
	{
		this.duracao = duracao;
	}
	public BigDecimal getVendaEmBilheteria()
	{
		return vendaEmBilheteria;
	}
	public void setVendaEmBilheteria(BigDecimal vendaEmBilheteria)
	{
		this.vendaEmBilheteria = vendaEmBilheteria;
	}

	// Substituicao de Metodos
	
	@Override
	public String toString()
	{
		return this.getNome() + " " + this.getAnoDeEstreia() + " " + this.getId();
	}
	
}
