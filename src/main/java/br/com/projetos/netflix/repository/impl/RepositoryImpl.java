package br.com.projetos.netflix.repository.impl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.NoSuchElementException;

import br.com.projetos.netflix.entidade.Entidade;
import br.com.projetos.netflix.repository.Repository;

public class RepositoryImpl<E extends Entidade> implements Repository<E>
{
	
	private List<E> itens;
	
	public RepositoryImpl()
	{
		this.itens = new ArrayList<E>();
	}

	@Override
	public boolean saveItem(E item)
	{
		if (this.itens.contains(item))
		{
			throw new IllegalArgumentException("O item informado ja esta presente na lista");
		}
		else
		{
			return this.itens.add(item);
		}
	}

	@Override
	public E findItemById(Long id)
	{
		for (E item : itens)
		{
			if (item.getId().equals(id))
			{
				return item;
			}			
		}
		throw new NoSuchElementException("Nenhum item com este ID foi encontrado");
	}

	@Override
	public List<E> findAllItems()
	{
		if (this.itens.isEmpty())
		{
			System.out.println("Aviso! A lista esta vazia!");
		}
		return Collections.unmodifiableList(this.itens);
	}

	@Override
	public boolean updateItem(E itemSubstituto)
	{
		Long idItem = itemSubstituto.getId();
		E itemAntigo = this.findItemById(idItem);
		int indiceItemAntigo = this.itens.indexOf(itemAntigo);
		this.itens.set(indiceItemAntigo, itemSubstituto);
		return true; // Sera alterado no proximo commit
	}

	@Override
	public boolean deleteItem(Long id)
	{
		E itemDelete = this.findItemById(id);
		return this.itens.remove(itemDelete);
	}
	
	
}
