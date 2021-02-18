package br.com.arthur.projects.netflix.repository.impl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.NoSuchElementException;

import br.com.arthur.projects.netflix.model.Entity;
import br.com.arthur.projects.netflix.repository.Repository;

/**
 * This class is the implementation/definition of {@link Repository} interface. It contains all the methods needed to
 * save, retrieve and modify objects of an model class that implements {@link Entity} interface.
 * @author Arthur Souza
 * @since 1.0
 * @see br.com.arthur.projects.netflix.repository.Repository
 * @see br.com.arthur.projects.netflix.model.Entity
 */
public class RepositoryImpl<E extends Entity> implements Repository<E>
{	
	private List<E> itens;
	

	public RepositoryImpl()
	{
		this.itens = new ArrayList<E>();
	}

	/**
	 * Saves an item on the list.
	 * 
	 * @param  item                     item to be saved on the list     
	 * @return {@code true}             if the object was successfully added to the list
	 * @throws IllegalArgumentException if the informed item already exists in the list  
	 */
	@Override
	public boolean saveItem(E item)
	{
		if (this.itens.contains(item))
		{
			throw new IllegalArgumentException("This item already exists on the list");
		}
		else
		{
			return this.itens.add(item);
		}
	}
	
	/**
	 * Searches for an item on the list based on its ID.
	 * 
	 * @param  id ID from the object meant to be found on the list
	 * @return    the corresponding object from the ID
     * @throws    NoSuchElementException if no items from the list is corresponding to the ID 
	 */
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

	/**
	 * Retrieves an unmodifiable list containing all the existing items.
	 * 
	 * @return a list containing all the items
	 */
	@Override
	public List<E> findAllItems()
	{
		if (this.itens.isEmpty())
		{
			System.out.println("Warning! The list is empty!");
		}
		return Collections.unmodifiableList(this.itens);
	}

	/**
	 * Updates an existing item from the list.
	 * 
	 * @param  substituteItem item to replace an another item on the list based on its containing ID 
	 * @return {@code true}   if the list was successfully updated
	 */
	@Override
	public boolean updateItem(E substituteItem)
	{		
		try
		{
			Long itemId = substituteItem.getId();
			E oldItem = this.findItemById(itemId);
			int indexOldItem = this.itens.indexOf(oldItem);
			this.itens.set(indexOldItem, substituteItem);
			return true;
		}
		catch (NoSuchElementException e)
		{
			return false;
		}
	}

	/**
	 * Deletes an item from the list based on its ID.
	 * 
	 * @param  id            ID from the object meant to be deleted from the list
	 * @return {@code true}  if the list was successfully modified
	 */
	@Override
	public boolean deleteItem(Long id)
	{
		try
		{
			E itemDelete = this.findItemById(id);
			return this.itens.remove(itemDelete);
		}
		catch (NoSuchElementException e)
		{
			return false;
		}
	}	
}
