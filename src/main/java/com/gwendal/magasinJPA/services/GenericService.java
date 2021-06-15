package com.gwendal.magasinJPA.services;

import java.util.List;

public interface GenericService<T> {
	
	public List<T> findAll();
	public T findById(int id);
	public T save(T entity);
	public T update(int id, T entity);
	public void delete(int id);
}
