package com.gwendal.magasinJPA.services;

import java.util.List;

import com.gwendal.magasinJPA.models.Categorie;

public interface CategorieService extends GenericService<Categorie>{
	public List<Categorie> findByNom(String nom);
}
