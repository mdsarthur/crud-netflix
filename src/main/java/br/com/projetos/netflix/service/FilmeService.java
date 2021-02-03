package br.com.projetos.netflix.service;

import java.util.List;

import br.com.projetos.netflix.modelo.Filme;

public interface FilmeService
{
	public boolean salvarFilme(Filme filme);
	public Filme buscarFilmePorId(Long id);
	public List<Filme> buscarTodosFilmes();
	public boolean atualizarFilme(Filme filmeSubstituto);
	public boolean deletarFilme(Long id);
}
