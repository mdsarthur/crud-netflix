package br.com.projetos.netflix.modelo;

import java.util.List;

public class Temporada
{
	// Atributos
	private long id;
	private int numeroDaTemporada;
	private int numeroDeEpisodios;
	private List<Episodio> episodios;
	
	// Construtores
	public Temporada()
	{
		super();
	}

	//Getters e Setters
	public long getId()
	{
		return id;
	}

	public void setId(long id)
	{
		this.id = id;
	}

	public int getNumeroDaTemporada()
	{
		return numeroDaTemporada;
	}

	public void setNumeroDaTemporada(int numeroDaTemporada)
	{
		this.numeroDaTemporada = numeroDaTemporada;
	}

	public int getNumeroDeEpisodios()
	{
		return numeroDeEpisodios;
	}

	public void setNumeroDeEpisodios(int numeroDeEpisodios)
	{
		this.numeroDeEpisodios = numeroDeEpisodios;
	}

	public List<Episodio> getEpisodios()
	{
		return episodios;
	}

	public void setEpisodios(List<Episodio> episodios)
	{
		this.episodios = episodios;
	}	
}
