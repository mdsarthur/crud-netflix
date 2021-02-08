package br.com.projects.netflix.repository.impl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.NoSuchElementException;

import br.com.projects.netflix.entity.Entity;
import br.com.projects.netflix.repository.Repository;

public class RepositoryImpl<E extends Entity> implements Repository<E>
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
			throw new IllegalArgumentException("This item already exists in the database");
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
		throw new NoSuchElementException("No items with this ID were found");
	}

	@Override
	public List<E> findAllItems()
	{
		if (this.itens.isEmpty())
		{
			System.out.println("Warning! The list is empty!");
		}
		return Collections.unmodifiableList(this.itens);
	}

	@Override
	public boolean updateItem(E substituteItem)
	{
		Long itemId = substituteItem.getId();
		E oldItem = this.findItemById(itemId);
		int indexOldItem = this.itens.indexOf(oldItem);
		this.itens.set(indexOldItem, substituteItem);
		return true; // Will be changed on next commit
	}

	@Override
	public boolean deleteItem(Long id)
	{
		E itemDelete = this.findItemById(id);
		return this.itens.remove(itemDelete);
	}	
}
