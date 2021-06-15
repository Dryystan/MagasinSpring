package com.gwendal.magasinJPA.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gwendal.magasinJPA.models.Categorie;

public interface CategorieRepository extends JpaRepository<Categorie, Long>{
	public List<Categorie> findByNom(String nom);
}
