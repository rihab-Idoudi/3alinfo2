package tn.esponline.entities;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
@Entity
public class Competence implements Serializable {
	@Id
	private int id;
	
	private String label;
	@ManyToMany
	private Set<Personne> personnes;

	public Competence() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
