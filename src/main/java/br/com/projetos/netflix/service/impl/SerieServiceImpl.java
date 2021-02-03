package br.com.projetos.netflix.service.impl;

import java.util.List;

import br.com.projetos.netflix.modelo.Seriado;
import br.com.projetos.netflix.repository.Repository;
import br.com.projetos.netflix.service.SeriadoService;

public class SerieServiceImpl implements SeriadoService
{
	private Repository<Seriado> repo;
	
	public SerieServiceImpl(Repository<Seriado> repo)
	{
		this.repo = repo;
	}	
	
	@Override
	public boolean salvarSeriado(Seriado seriado)
	{
		return this.repo.saveItem(seriado);
	}

	@Override
	public Seriado buscarSeriadoPorId(Long id)
	{
		return this.repo.findItemById(id);
	}

	@Override
	public List<Seriado> buscarTodosSeriados()
	{
		return this.repo.findAllItems();
	}

	@Override
	public boolean atualizarSeriado(Seriado seriadoSubstituto)
	{
		return this.repo.updateItem(seriadoSubstituto);
	}

	@Override
	public boolean deletarSeriado(Long id)
	{
		return this.repo.deleteItem(id);
	}
}
