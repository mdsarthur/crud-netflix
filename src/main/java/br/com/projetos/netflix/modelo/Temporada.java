package br.com.projetos.netflix.modelo;

import java.util.List;

public class Temporada
{
	// Atributos
	private Long id;
	private int numeroDaTemporada;
	private int numeroDeEpisodios;
	private List<Episodio> episodios;

	// Getters e Setters
	public Long getId()
	{
		return id;
	}
	
	public void setId(Long id)
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

	// Substituicao de Metodos
			
	@Override
	public int hashCode()
	{
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj)
	{
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Temporada other = (Temporada) obj;
		if (id == null)
		{
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
}
