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

import com.gwendal.magasinJPA.models.Client;
import com.gwendal.magasinJPA.models.Commande;
import com.gwendal.magasinJPA.services.impl.ClientServiceImpl;
import com.gwendal.magasinJPA.services.impl.CommandeServiceImpl;

@RestController
@RequestMapping("commandes")
@CrossOrigin
public class CommandeController {
	
	@Autowired
	private CommandeServiceImpl service;
	
	@GetMapping("")
	public List<Commande> findAll() {
		return this.service.findAll();
	}
	
	@GetMapping("{id}")
	public Commande findById(@PathVariable Long id) {
		return this.service.findById(id);
	}
	
	@GetMapping("client/{id_client}")
	public List<Commande> findByClientId(@PathVariable Long id_client) {
		return this.service.findByClientId(id_client);
	}
	
	@PostMapping("")
	public Commande save(@RequestBody Commande commande) {
		return this.service.save(commande);
	}
	
	@DeleteMapping("{id}")
	public void delete(@PathVariable Long id) {
		this.service.delete(id);
	}
}
