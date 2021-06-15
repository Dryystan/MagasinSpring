package com.gwendal.magasinJPA.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gwendal.magasinJPA.models.Produit;

public interface ProduitRepository extends JpaRepository<Produit, Long>{
	public List<Produit> findByNom(String nom);
}
