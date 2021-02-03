package br.com.projetos.netflix;

import java.util.Scanner;

import br.com.projetos.netflix.modelo.Filme;
import br.com.projetos.netflix.repository.Repository;
import br.com.projetos.netflix.repository.impl.RepositoryImpl;

public class Aplicacao
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		Repository<Filme> repo = new RepositoryImpl<>();
		Filme filme1 = new Filme();
		Filme filme1Novo = new Filme();
		
		filme1.setNome("Velozes e Furiosos");
		filme1.setAnoDeEstreia(2001);
		filme1.setId(1L);		
		System.out.println(repo.saveItem(filme1));
		System.out.println(repo.findAllItems());
		
		filme1Novo.setNome("Need for Speed");
		filme1Novo.setAnoDeEstreia(2014);
		filme1Novo.setId(1L);
		System.out.println(repo.updateItem(filme1Novo));
		System.out.println(repo.findAllItems());
		
		System.out.println(repo.deleteItem(1L));
		System.out.println(repo.findAllItems());		
	}
}