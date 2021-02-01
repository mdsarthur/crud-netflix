package br.com.projetos.netflix;

import java.util.Scanner;

import br.com.projetos.netflix.banco.Banco;
import br.com.projetos.netflix.modelo.Filme;

public class Aplicacao
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		Banco banco = new Banco();
		Filme filme1 = new Filme();
		Filme filme1Novo = new Filme();
		
		filme1.setNome("Velozes e Furiosos");
		filme1.setAnoDeEstreia(2001);
		filme1.setId(1L);		
		System.out.println(banco.saveMovie(filme1));
		System.out.println(banco.findAllMovies());
		
		filme1Novo.setNome("Need for Speed");
		filme1Novo.setAnoDeEstreia(2014);
		filme1Novo.setId(1L);
		System.out.println(banco.updateMovie(filme1Novo));
		System.out.println(banco.findAllMovies());
		
		System.out.println(banco.deleteMovie(5L));
		System.out.println(banco.findAllMovies());
		
	}
}