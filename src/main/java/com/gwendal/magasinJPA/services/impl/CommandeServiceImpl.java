package com.gwendal.magasinJPA.services.impl;

import com.gwendal.magasinJPA.models.Commande;
import com.gwendal.magasinJPA.repositories.CommandeRepository;

public class CommandeServiceImpl extends GenericServiceImpl<Commande>{
	public CommandeServiceImpl(CommandeRepository repository) {
		super(repository);
	}
}
