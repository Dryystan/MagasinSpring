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
	
	@ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.PERSIST)
	@JoinTable(name = "commandes_has_produits",
				joinColumns = {
						@JoinColumn(name = "id_commande", referencedColumnName = "id",
								nullable = false, updatable = false)},
				inverseJoinColumns = {
						@JoinColumn(name =  "id_produit", referencedColumnName = "id",
								nullable = false, updatable = false)})
	private Set<Produit> produits = new HashSet<>();
}