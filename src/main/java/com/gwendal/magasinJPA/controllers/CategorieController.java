package com.gwendal.magasinJPA.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gwendal.magasinJPA.models.Categorie;

import com.gwendal.magasinJPA.services.impl.CategorieServiceImpl;

@RestController
@RequestMapping("categories")
@CrossOrigin
public class CategorieController {

	@Autowired
	private CategorieServiceImpl service;
	
	@GetMapping("")
	public List<Categorie> findAll() {
		return this.service.findAll();
	}
	
	@GetMapping("{id}")
	public Categorie findById(@PathVariable Long id) {
		return this.service.findById(id);
	}
	
	@PostMapping("")
	public Categorie save(@RequestBody Categorie categorie) {
		return this.service.save(categorie);
	}
	
	@DeleteMapping("{id}")
	public void delete(@PathVariable Long id) {
		this.service.delete(id);
	}
}
