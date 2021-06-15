package com.gwendal.magasinJPA.models;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Data;

@Entity
@Table(name="produits")
@JsonIgnoreProperties({"commandes"})
public class Produit {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	private String nom;
	private int prix;
	
	@ManyToOne
	@JoinColumn(name="id_categorie")
	private Categorie categorie;

	public Long getId() {
		return id;
	}

	public String getNom() {
		return nom;
	}

	public int getPrix() {
		return prix;
	}

	public Categorie getCategorie() {
		return categorie;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public void setPrix(int prix) {
		this.prix = prix;
	}

	public void setCategorie(Categorie categorie) {
		this.categorie = categorie;
	}
	
}