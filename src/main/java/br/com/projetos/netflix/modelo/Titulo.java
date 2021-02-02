package br.com.projetos.netflix.modelo;

import java.util.List;

import br.com.projetos.netflix.banco.InterfaceEntidade;

public abstract class Titulo implements InterfaceEntidade
{
	// Atributos
	private Long id;
	private String nome;
	private int anoDeEstreia;
	private String sinopse;
	private int classificacaoIndicativa;
	private Genero generoPrincipal;
	private List<Ator> elencoPrincipal;
	private List<Produtor> produtoresPrincipais;
	private List<Diretor> diretoresPrincipais;

	// Getters e Setters
	@Override
	public Long getId()
	{
		return id;
	}
	
	@Override
	public void setId(Long id)
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

	// Substituicao de Metodos
		
	@Override
	public int hashCode()
	{
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj)
	{
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Titulo other = (Titulo) obj;
		if (id == null)
		{
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}	
}
