package br.com.projetos.netflix.banco;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.NoSuchElementException;

import br.com.projetos.netflix.modelo.Filme;
import br.com.projetos.netflix.modelo.Seriado;

public class Banco
{	
	private List<Filme> filmes;
	private List<Seriado> seriados;
	
	public Banco()
	{
		this.filmes = new ArrayList<Filme>();
		this.seriados = new ArrayList<Seriado>();
	}
	
	private Long generateMovieId()
	{
		if (this.filmes.isEmpty())
		{
			return Long.valueOf(1);
		}
		else
		{
			int ultimoItem = this.filmes.size() - 1;
			Long proximoId = this.filmes.get(ultimoItem).getId() + 1;
			return proximoId;
		}
	}
	
	public boolean saveMovie(Filme filme)
	{
		if (this.filmes.contains(filme))
		{
			throw new IllegalArgumentException("O filme informado ja esta presente na lista");
		}
		else
		{
			return this.filmes.add(filme);
		}		
	}
	
	public Filme findMovieById(Long id)
	{		
		for (Filme filme : filmes)
		{
			if (filme.getId().equals(id))
			{
				return filme;
			}			
		}
		throw new NoSuchElementException("Nenhum filme com este ID foi encontrado");
	}
	
	public List<Filme> findAllMovies()
	{
		if (this.filmes.isEmpty())
		{
			System.out.println("Aviso! A lista esta vazia!");
		}
		return Collections.unmodifiableList(this.filmes);
	}
	
	public boolean updateMovie(Filme filmeSubstituto)
	{
		Long idFilme = filmeSubstituto.getId();
		Filme filmeAntigo = this.findMovieById(idFilme);
		int indiceFilmeAntigo = this.filmes.indexOf(filmeAntigo);
		this.filmes.set(indiceFilmeAntigo, filmeSubstituto);
		return true; // Sera alterado no proximo commit
	}
	
	public boolean deleteMovie(Long id)
	{
		Filme movieDelete = this.findMovieById(id);
		return this.filmes.remove(movieDelete);
	}	
}
