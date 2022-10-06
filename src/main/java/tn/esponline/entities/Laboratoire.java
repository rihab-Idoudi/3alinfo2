package tn.esponline.entities;

import java.io.Serializable;
import java.util.List;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
@Entity
public class Laboratoire implements Serializable {
	@Id
	private int id;
	
	private String adresse;

	@OneToMany(mappedBy = "labo")
	private Set<Personne> personnes;
	
	public Laboratoire() {
		super();
		// TODO Auto-generated constructor stub
	}

}
