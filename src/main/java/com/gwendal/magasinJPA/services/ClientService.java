package com.gwendal.magasinJPA.services;

import java.util.List;

import com.gwendal.magasinJPA.models.Client;
import com.gwendal.magasinJPA.models.Commande;

public interface ClientService extends GenericService<Client> {
	public List<Client> findByNom(String nom);
	public List<Client> findByPrenom(String prenom);
	public List<Commande> findCommandeByClientId(Long id);
}
