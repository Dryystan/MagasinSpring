package com.gwendal.magasinJPA.services;

import java.util.List;

import com.gwendal.magasinJPA.models.Produit;

public interface ProduitService extends GenericService<Produit> {
	public List<Produit> findByNom(String nom);
}
