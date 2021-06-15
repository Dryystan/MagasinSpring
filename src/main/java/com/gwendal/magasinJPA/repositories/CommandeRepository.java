package com.gwendal.magasinJPA.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gwendal.magasinJPA.models.Client;
import com.gwendal.magasinJPA.models.Commande;

public interface CommandeRepository extends JpaRepository<Commande, Long>{
	public List<Commande> findByClientId(Long id_client);
}
