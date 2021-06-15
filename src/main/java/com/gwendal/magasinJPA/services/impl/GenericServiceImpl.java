package com.gwendal.magasinJPA.services.impl;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gwendal.magasinJPA.services.GenericService;

public class GenericServiceImpl<T> implements GenericService<T> {
	private JpaRepository<T, Long> repository;
	
	public GenericServiceImpl(JpaRepository<T, Long> repository) {
		this.repository = repository;
	}
	
	public List<T> findAll() {
		return this.repository.findAll();
	}
	
	public T findById(Long id) {
		return this.repository.findById(id).get();
	}
	
	public T save(T entity) {
		return this.repository.save(entity);
	}
	
	public T update(Long id, T entity) {
		return this.repository.save(entity);
	}
	
	public void delete(Long id) {
		this.repository.deleteById(id);
	}
}
