package com.gwendal.magasinJPA.controllers;

import java.util.List;
import java.util.Optional;

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

@RestController
@RequestMapping("clients")
@CrossOrigin
public class ClientController {

	@Autowired
	private ClientServiceImpl service;
	
	@GetMapping("")
	public List<Client> findAll() {
		return this.service.findAll();
	}
	
	@GetMapping("{id}")
	public Client findById(@PathVariable Long id) {
		return this.service.findById(id);
	}
	
	@GetMapping("/nom/{nom}")
	public List<Client> findByNom(@PathVariable String nom) {
		List<Client> client = service.findByNom(nom);
		return client;
	}
	
	@GetMapping("/prenom/{prenom}")
	public List<Client> findByPreom(@PathVariable String prenom) {
		List<Client> client = service.findByPrenom(prenom);
		return client;
	}
	
	@PostMapping("")
	public Client save(@RequestBody Client client) {
		return this.service.save(client);
	}
	
	@DeleteMapping("{id}")
	public void delete(@PathVariable Long id) {
		this.service.delete(id);
	}
}
