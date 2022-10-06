package tn.esponline.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;
import tn.esponline.entities.Laboratoire;
import tn.esponline.repository.ILaboratoireRepository;

@Service
@Slf4j
public class LaboratoireServices implements ILaboratoireServices{
	
	@Autowired
	ILaboratoireRepository laborepo;

	@Override
	public void addLabo(Laboratoire labo) {
		// TODO Auto-generated method stub
		laborepo.save(labo);
	}

	@Override
	public Laboratoire getLabo(int idl) {
		// TODO Auto-generated method stub
		return laborepo.findById(idl).orElse(null);
	}

	@Override
	public List<Laboratoire> getAllLabo() {
		// TODO Auto-generated method stub
		return laborepo.findAll();
	}

	@Override
	public void deleteById(int idl) {
		// TODO Auto-gelabonerated method stub
		laborepo.deleteById(idl);
	}
	
	

}
