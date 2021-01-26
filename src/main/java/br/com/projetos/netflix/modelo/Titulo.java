package br.com.projetos.netflix.modelo;

import java.util.List;

public abstract class Titulo
{
	// Atributos
	private long id;
	private String nome;
	private int anoDeEstreia;
	private String sinopse;
	private int classificacaoIndicativa;
	private Genero generoPrincipal;
	private List<Ator> elencoPrincipal;
	private List<Produtor> produtoresPrincipais;
	private List<Diretor> diretoresPrincipais;
	
	// Construtores
	public Titulo()
	{
		super();
	}

	//Getters e Setters	
	public long getId()
	{
		return id;
	}
	
	public void setId(long id)
	{
		this.id = id;
	}
	
	public String getNome()
	{
		return nome;
	}
	
	public void setNome(String nome)
	{
		this.nome = nome;
	}
	
	public int getAnoDeEstreia()
	{
		return anoDeEstreia;
	}
	
	public void setAnoDeEstreia(int anoDeEstreia)
	{
		this.anoDeEstreia = anoDeEstreia;
	}
	
	public String getSinopse()
	{
		return sinopse;
	}
	
	public void setSinopse(String sinopse)
	{
		this.sinopse = sinopse;
	}
	
	public int getClassificacaoIndicativa()
	{
		return classificacaoIndicativa;
	}
	
	public void setClassificacaoIndicativa(int classificacaoIndicativa)
	{
		this.classificacaoIndicativa = classificacaoIndicativa;
	}
	
	public Genero getGeneroPrincipal()
	{
		return generoPrincipal;
	}

	public void setGeneroPrincipal(Genero generoPrincipal)
	{
		this.generoPrincipal = generoPrincipal;
	}

	public List<Ator> getElencoPrincipal()
	{
		return elencoPrincipal;
	}

	public void setElencoPrincipal(List<Ator> elencoPrincipal)
	{
		this.elencoPrincipal = elencoPrincipal;
	}

	public List<Produtor> getProdutoresPrincipais()
	{
		return produtoresPrincipais;
	}

	public void setProdutoresPrincipais(List<Produtor> produtoresPrincipais)
	{
		this.produtoresPrincipais = produtoresPrincipais;
	}

	public List<Diretor> getDiretoresPrincipais()
	{
		return diretoresPrincipais;
	}

	public void setDiretoresPrincipais(List<Diretor> diretoresPrincipais)
	{
		this.diretoresPrincipais = diretoresPrincipais;
	}	

			
	
	
}
