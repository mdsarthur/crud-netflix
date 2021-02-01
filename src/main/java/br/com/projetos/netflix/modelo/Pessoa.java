package br.com.projetos.netflix.modelo;

import java.time.LocalDate;

public abstract class Pessoa
{
	// Atributos
	private Long id;
	private String nome;
	private LocalDate dataNascimento;
	private String biografia;
	private boolean emAtividade;
	private Sexo sexo;

	// Getters e Setters
	public Long getId()
	{
		return id;
	}
	
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

	public LocalDate getDataNascimento()
	{
		return dataNascimento;
	}

	public void setDataNascimento(LocalDate dataNascimento)
	{
		this.dataNascimento = dataNascimento;
	}

	public String getBiografia()
	{
		return biografia;
	}

	public void setBiografia(String biografia)
	{
		this.biografia = biografia;
	}

	public boolean isEmAtividade()
	{
		return emAtividade;
	}

	public void setEmAtividade(boolean emAtividade)
	{
		this.emAtividade = emAtividade;
	}

	public Sexo getSexo()
	{
		return sexo;
	}

	public void setSexo(Sexo sexo)
	{
		this.sexo = sexo;
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
		Pessoa other = (Pessoa) obj;
		if (id == null)
		{
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
	
}
