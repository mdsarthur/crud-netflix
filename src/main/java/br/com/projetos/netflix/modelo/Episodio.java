package br.com.projetos.netflix.modelo;

import java.time.Duration;

public class Episodio
{
	// Atributos
	private long id;
	private int numeroDoEpisodio;
	private Duration tempoMedioDeDuracao;
	
	// Construtores
	public Episodio()
	{
		super();
	}

	// Getters e Setters	
	public long getId()
	{
		return id;
	}

	public void setId(long id)
	{
		this.id = id;
	}

	public int getNumeroDoEpisodio()
	{
		return numeroDoEpisodio;
	}

	public void setNumeroDoEpisodio(int numeroDoEpisodio)
	{
		this.numeroDoEpisodio = numeroDoEpisodio;
	}

	public Duration getTempoMedioDeDuracao()
	{
		return tempoMedioDeDuracao;
	}

	public void setTempoMedioDeDuracao(Duration tempoMedioDeDuracao)
	{
		this.tempoMedioDeDuracao = tempoMedioDeDuracao;
	}	
}
