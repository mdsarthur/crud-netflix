package br.com.projetos.netflix.banco;

import java.util.List;

import br.com.projetos.netflix.modelo.Filme;
import br.com.projetos.netflix.modelo.Seriado;

public class NovoBanco
{	
	private BancoParaEntidade<Filme> bancoFilmes;
	private BancoParaEntidade<Seriado> bancoSeriado;
	
	public NovoBanco()
	{
		this.bancoFilmes = new BancoParaEntidade<Filme>();
		this.bancoSeriado = new BancoParaEntidade<Seriado>();
	}
	
	// Metodos de Filme
	@SuppressWarnings("unused")
	private Long generateMovieId()
	{
		return this.bancoFilmes.generateItemId(); 
	}
	
	public boolean saveMovie(Filme filme)
	{
		return this.bancoFilmes.saveItem(filme);		
	}
	
	public Filme findMovieById(Long id)
	{
		return this.bancoFilmes.findItemById(id);	
	}
	
	public List<Filme> findAllMovies()
	{
		return this.bancoFilmes.findAllItems();
	}
	
	public boolean updateMovie(Filme filmeSubstituto)
	{
		return this.bancoFilmes.updateItem(filmeSubstituto);
	}
	
	public boolean deleteMovie(Long id)
	{
		return this.bancoFilmes.deleteItem(id);
	}
	
	// Metodos de Seriado	
	@SuppressWarnings("unused")
	private Long generateShowId()
	{
		return this.bancoSeriado.generateItemId(); 
	}
	
	public boolean saveShow(Seriado seriado)
	{
		return this.bancoSeriado.saveItem(seriado);		
	}
	
	public Seriado findShowById(Long id)
	{
		return this.bancoSeriado.findItemById(id);	
	}
	
	public List<Seriado> findAllShows()
	{
		return this.bancoSeriado.findAllItems();
	}
	
	public boolean updateShow(Seriado seriadoSubstituto)
	{
		return this.bancoSeriado.updateItem(seriadoSubstituto);
	}
	
	public boolean deleteShow(Long id)
	{
		return this.bancoSeriado.deleteItem(id);
	}
}
