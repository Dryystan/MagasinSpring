package com.gwendal.magasinJPA.services;

import java.util.List;

import com.gwendal.magasinJPA.models.Client;

public interface ClientService extends GenericService<Client> {
	public List<Client> findByNom(String nom);
	public List<Client> findByPrenom(String prenom);
}
