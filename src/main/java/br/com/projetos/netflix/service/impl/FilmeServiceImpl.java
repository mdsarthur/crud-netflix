package br.com.projetos.netflix.service.impl;

import java.util.List;

import br.com.projetos.netflix.modelo.Filme;
import br.com.projetos.netflix.repository.Repository;
import br.com.projetos.netflix.service.FilmeService;

public class FilmeServiceImpl implements FilmeService
{	
	private Repository<Filme> repo;
	
	public FilmeServiceImpl(Repository<Filme> repo)
	{
		this.repo = repo;
	}
	
	@Override
	public boolean salvarFilme(Filme filme)
	{
		return this.repo.saveItem(filme);
	}

	@Override
	public Filme buscarFilmePorId(Long id)
	{
		return this.repo.findItemById(id);
	}

	@Override
	public List<Filme> buscarTodosFilmes()
	{
		return this.repo.findAllItems();
	}

	@Override
	public boolean atualizarFilme(Filme filmeSubstituto)
	{
		return this.repo.updateItem(filmeSubstituto);
	}

	@Override
	public boolean deletarFilme(Long id)
	{
		return this.repo.deleteItem(id);
	}	
}
