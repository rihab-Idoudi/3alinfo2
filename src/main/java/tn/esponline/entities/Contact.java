package tn.esponline.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Contact implements Serializable {
	@Id
	private int id;
	//premiere modification

	//modif mabranche
	//modif 2branch

	private String adresse;
	@OneToOne(mappedBy = "contact")
	private Personne personne;

	
}
