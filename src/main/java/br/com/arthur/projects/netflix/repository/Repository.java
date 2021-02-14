package br.com.arthur.projects.netflix.repository;

import java.util.List;

import br.com.arthur.projects.netflix.entity.Entity;
import br.com.arthur.projects.netflix.repository.impl.RepositoryImpl;

/**
 * This interface makes explicit five (5) methods that every {@link RepositoryImpl} must have in order to save, retrieve and modify objects of
 * any model class that implements {@link Entity} interface.
 * @author Arthur Souza
 * @since 1.0
 * @see br.com.arthur.projects.netflix.repository.impl.RepositoryImpl
 * @see br.com.arthur.projects.netflix.entity.Entity
 */
public interface Repository<E>
{
	public boolean saveItem(E item);
	public E findItemById(Long id);
	public List<E> findAllItems();
	public boolean updateItem(E substituteItem);
	public boolean deleteItem(Long id);
}