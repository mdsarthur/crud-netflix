package br.com.projetos.netflix.banco;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.NoSuchElementException;

public class BancoParaEntidade<E extends InterfaceEntidade>
{	
	private List<E> itens;
	
	public BancoParaEntidade()
	{
		this.itens = new ArrayList<E>();
	}
	
	Long generateItemId()
	{
		if (this.itens.isEmpty())
		{
			return Long.valueOf(1);
		}
		else
		{
			int ultimoItem = this.itens.size() - 1;
			Long proximoId = this.itens.get(ultimoItem).getId() + 1;
			return proximoId;
		}
	}
	
	boolean saveItem(E item)
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
	
	E findItemById(Long id)
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
	
	List<E> findAllItems()
	{
		if (this.itens.isEmpty())
		{
			System.out.println("Aviso! A lista esta vazia!");
		}
		return Collections.unmodifiableList(this.itens);
	}
	
	boolean updateItem(E itemSubstituto)
	{
		Long idItem = itemSubstituto.getId();
		E itemAntigo = this.findItemById(idItem);
		int indiceItemAntigo = this.itens.indexOf(itemAntigo);
		this.itens.set(indiceItemAntigo, itemSubstituto);
		return true; // Sera alterado no proximo commit
	}
	
	boolean deleteItem(Long id)
	{
		E itemDelete = this.findItemById(id);
		return this.itens.remove(itemDelete);
	}
}
