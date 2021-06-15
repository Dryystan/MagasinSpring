package com.gwendal.magasinJPA.services.impl;

import com.gwendal.magasinJPA.models.Categorie;
import com.gwendal.magasinJPA.repositories.CategorieRepository;

public class CategorieServiceImpl extends GenericServiceImpl<Categorie>{
	public CategorieServiceImpl(CategorieRepository repository) {
		super(repository);
	}
}
