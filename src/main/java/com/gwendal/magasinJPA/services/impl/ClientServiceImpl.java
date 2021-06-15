package com.gwendal.magasinJPA.services.impl;

import java.util.List;

import com.gwendal.magasinJPA.models.Client;
import com.gwendal.magasinJPA.models.Commande;
import com.gwendal.magasinJPA.repositories.ClientRepository;

public class ClientServiceImpl extends GenericServiceImpl<Client>{
	
	ClientRepository repository;
	
	public ClientServiceImpl(ClientRepository repository) {
		super(repository);
		this.repository = repository;
	}
	
	public List<Client> findByNom(String nom) {
		return this.repository.findByNom(nom);
	}
	
	public List<Client> findByPrenom(String prenom) {
		return this.repository.findByPrenom(prenom);
	}
}
