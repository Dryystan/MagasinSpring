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
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;

@Data
@Entity
@Table(name="commandes")
public class Commande {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@ManyToOne
	@JoinColumn(name="id_client")
	private Client client;
	
	@JsonIgnore
	@ManyToMany(targetEntity = Produit.class, cascade = CascadeType.PERSIST)
	@JoinTable(name="commandes_has_produits",
				joinColumns = @JoinColumn(name = "id_commande"),
				inverseJoinColumns = @JoinColumn(name = "id_produit"))	
	private Set<Produit> produits = new HashSet<>();
}