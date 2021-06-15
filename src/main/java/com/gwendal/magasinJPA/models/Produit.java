package com.gwendal.magasinJPA.models;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="produits")
public class Produit {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	private String nom;
	private int prix;
	
	@ManyToOne
	@JoinColumn(name="id_categorie")
	private Categorie categorie;
	
	@ManyToMany(mappedBy = "produits", fetch = FetchType.LAZY)
	private Set<Commande> commandes = new HashSet<>();
}