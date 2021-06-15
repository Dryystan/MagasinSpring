package com.gwendal.magasinJPA.services.impl;

import com.gwendal.magasinJPA.models.Client;
import com.gwendal.magasinJPA.repositories.ClientRepository;

public class ClientServiceImpl extends GenericServiceImpl<Client>{
	public ClientServiceImpl(ClientRepository repository) {
		super(repository);
	}
}
