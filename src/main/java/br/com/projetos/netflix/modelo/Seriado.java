package br.com.projetos.netflix.modelo;

import java.util.List;

public class Seriado extends Titulo
{
	// Atributos
	private int numeroDeTemporadas;
	private boolean emAndamento;
	private boolean spinOff;
	private List<Temporada> temporadas;
	
	// Construtor
	public Seriado()
	{
		super();
	}
	
	// Getters e Setters
	public int getNumeroDeTemporadas()
	{
		return numeroDeTemporadas;
	}
	
	public void setNumeroDeTemporadas(int numeroDeTemporadas)
	{
		this.numeroDeTemporadas = numeroDeTemporadas;
	}
	
	public boolean isEmAndamento()
	{
		return emAndamento;
	}
	
	public void setEmAndamento(boolean emAndamento)
	{
		this.emAndamento = emAndamento;
	}
	
	public boolean isSpinOff()
	{
		return spinOff;
	}
	
	public void setSpinOff(boolean spinOff)
	{
		this.spinOff = spinOff;
	}

	public List<Temporada> getTemporadas()
	{
		return temporadas;
	}

	public void setTemporadas(List<Temporada> temporadas)
	{
		this.temporadas = temporadas;
	}
}
