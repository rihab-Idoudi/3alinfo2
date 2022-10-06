package tn.esponline.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;
import tn.esponline.entities.Personne;
import tn.esponline.repository.IPersonneRepository;

@Service
@Slf4j
public class PersonneServices implements IPersonneServices {
	
	@Autowired
	IPersonneRepository perrep;

	@Override
	public Personne addPersonne(Personne p) {
		// TODO Auto-generated method stub
		return perrep.save(p);
	}

	@Override
	public Personne getPerson(int id) {
		// TODO Auto-;generated method stub
		return perrep.findById(id).orElse(null);
	}

	@Override
	public void deletPerson(int id) {
		// TODO Auto-generated method stub
		perrep.deleteById(id);
		
	}

	@Override
	public Personne updatePer(int id,  String nom) {
		// TODO Auto-generated method stub
		Personne p= perrep.findById(id).get();
		p.setNom(nom);
		return perrep.save(p);
	}

	@Override
	public List<Personne> getByAge(int age) {
		// TODO Auto-generated method stub
		return perrep.findByAgeGreaterThan(age);
	}

	@Override
	public List<Personne> getAll() {
		// TODO Auto-generated method stub
	
		return (List<Personne>) perrep.findAll();
	}

}
