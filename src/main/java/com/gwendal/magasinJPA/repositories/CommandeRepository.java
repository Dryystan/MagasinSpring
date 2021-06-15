package com.gwendal.magasinJPA.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gwendal.magasinJPA.models.Commande;

public interface CommandeRepository extends JpaRepository<Commande, Long>{
	
}
