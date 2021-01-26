package br.com.projetos.netflix.modelo;

import java.time.LocalDate;

public abstract class Pessoa
{
	// Atributos
	private long id;
	private String nome;
	private LocalDate dataNascimento;
	private String biografia;
	private boolean emAtividade;
	private Sexo sexo;
	
	// Construtores
	public Pessoa()
	{
		super();
	}

	// Getters e Setters
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
}
