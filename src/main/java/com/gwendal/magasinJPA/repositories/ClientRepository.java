package com.gwendal.magasinJPA.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gwendal.magasinJPA.models.Client;

public interface ClientRepository extends JpaRepository<Client, Long>{
	public List<Client> findByNom(String nom);
	public List<Client> findByPrenom(String prenom);
}
