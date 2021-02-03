package br.com.projetos.netflix.service;

import java.util.List;

import br.com.projetos.netflix.modelo.Seriado;

public interface SeriadoService
{
	public boolean salvarSeriado(Seriado seriado);
	public Seriado buscarSeriadoPorId(Long id);
	public List<Seriado> buscarTodosSeriados();
	public boolean atualizarSeriado(Seriado seriadoSubstituto);
	public boolean deletarSeriado(Long id);
}