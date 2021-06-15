package com.gwendal.magasinJPA.services;

import java.util.List;

import com.gwendal.magasinJPA.models.Client;
import com.gwendal.magasinJPA.models.Commande;

public interface CommandeService extends GenericService<Commande>{
	public List<Commande> findByClientId(Long client);
}
