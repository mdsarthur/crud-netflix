package br.com.projetos.netflix;

import java.util.Scanner;

import br.com.projetos.netflix.modelo.Filme;
import br.com.projetos.netflix.repository.Repository;
import br.com.projetos.netflix.repository.impl.RepositoryImpl;
import br.com.projetos.netflix.service.FilmeService;
import br.com.projetos.netflix.service.impl.FilmeServiceImpl;

public class Aplicacao
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		Repository<Filme> repo = new RepositoryImpl<>();
		FilmeService fs = new FilmeServiceImpl(repo);
		Filme filme1 = new Filme();
		Filme filme1Novo = new Filme();
		
		filme1.setNome("Velozes e Furiosos");
		filme1.setAnoDeEstreia(2001);
		filme1.setId(1L);		
		System.out.println(fs.salvarFilme(filme1));
		System.out.println(fs.buscarTodosFilmes());
		
		filme1Novo.setNome("Need for Speed");
		filme1Novo.setAnoDeEstreia(2014);
		filme1Novo.setId(1L);
		System.out.println(fs.atualizarFilme(filme1Novo));
		System.out.println(fs.buscarTodosFilmes());
		
		System.out.println(fs.deletarFilme(1L));
		System.out.println(fs.buscarTodosFilmes());		
	}
}