package com.gwendal.magasinJPA.services.impl;

import java.util.List;

import com.gwendal.magasinJPA.models.Client;
import com.gwendal.magasinJPA.models.Commande;
import com.gwendal.magasinJPA.repositories.CommandeRepository;

public class CommandeServiceImpl extends GenericServiceImpl<Commande>{
	
	CommandeRepository repository;
	
	public CommandeServiceImpl(CommandeRepository repository) {
		super(repository);
		this.repository = repository;
	}
	
	public List<Commande> findByClientId(Long id_client) {
		return this.repository.findByClientId(id_client);
	}
}