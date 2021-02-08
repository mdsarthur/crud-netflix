package br.com.projects.netflix.repository;

import java.util.List;

public interface Repository<E>
{
	public boolean saveItem(E item);
	public E findItemById(Long id);
	public List<E> findAllItems();
	public boolean updateItem(E substituteItem);
	public boolean deleteItem(Long id);
}