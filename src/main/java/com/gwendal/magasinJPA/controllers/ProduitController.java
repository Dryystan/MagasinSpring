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

import com.gwendal.magasinJPA.models.Produit;
import com.gwendal.magasinJPA.services.impl.ProduitServiceImpl;

@RestController
@RequestMapping("produits")
@CrossOrigin
public class ProduitController {

	@Autowired
	private ProduitServiceImpl service;
	
	@GetMapping("")
	public List<Produit> findAll() {
		return this.service.findAll();
	}
	
	@GetMapping("{id}")
	public Produit findById(@PathVariable Long id) {
		return this.service.findById(id);
	}
	
	@PostMapping("")
	public Produit save(@RequestBody Produit produit) {
		return this.service.save(produit);
	}
	
	@DeleteMapping("{id}")
	public void delete(@PathVariable Long id) {
		this.service.delete(id);
	}
}
