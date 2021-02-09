package br.com.projects.netflix.entity;

import br.com.projects.netflix.repository.impl.RepositoryImpl;

/**
 * This interface makes explicit two (2) methods that every model class must define to work properly with a {@link RepositoryImpl}.
 * @author Arthur Souza
 * @since 1.0
 * @see br.com.projects.netflix.repository.impl.RepositoryImpl
 */
public interface Entity
{
	public Long getId();	
	public void setId(Long id);
}