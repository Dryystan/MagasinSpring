package com.gwendal.magasinJPA.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.gwendal.magasinJPA.repositories.CategorieRepository;
import com.gwendal.magasinJPA.repositories.ClientRepository;
import com.gwendal.magasinJPA.repositories.CommandeRepository;
import com.gwendal.magasinJPA.repositories.ProduitRepository;
import com.gwendal.magasinJPA.services.impl.CategorieServiceImpl;
import com.gwendal.magasinJPA.services.impl.ClientServiceImpl;
import com.gwendal.magasinJPA.services.impl.CommandeServiceImpl;
import com.gwendal.magasinJPA.services.impl.ProduitServiceImpl;

@Configuration
public class ServiceConfig {
	
	@Bean
	public CategorieServiceImpl categorieServiceFactory(CategorieRepository repository) {
		return new CategorieServiceImpl(repository);
	}
	
	@Bean
	public ClientServiceImpl clientServiceFactory(ClientRepository repository) {
		return new ClientServiceImpl(repository);
	}
	
	@Bean
	public CommandeServiceImpl commandeServiceFactory(CommandeRepository repository) {
		return new CommandeServiceImpl(repository);
	}
	
	@Bean
	public ProduitServiceImpl produitServiceFactory(ProduitRepository repository) {
		return new ProduitServiceImpl(repository);
	}
}
