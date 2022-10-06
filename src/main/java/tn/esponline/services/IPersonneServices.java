package tn.esponline.services;

import java.util.List;

import tn.esponline.entities.Personne;

public interface IPersonneServices {
	
	public Personne addPersonne(Personne p);
	public Personne getPerson(int id);
	public void deletPerson (int id);
	public Personne updatePer(int id, String nom);
	public List<Personne> getByAge(int age);
	public List<Personne> getAll();

}
