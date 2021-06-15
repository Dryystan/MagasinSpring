package com.gwendal.magasinJPA.services.impl;

import com.gwendal.magasinJPA.models.Produit;
import com.gwendal.magasinJPA.repositories.ProduitRepository;

public class ProduitServiceImpl extends GenericServiceImpl<Produit> {
	public ProduitServiceImpl(ProduitRepository repository) {
		super(repository);
	}
}
