package tn.esponline.services;

import java.util.List;

import tn.esponline.entities.Laboratoire;

public interface ILaboratoireServices {
	
	public void addLabo(Laboratoire labo);
	public Laboratoire getLabo(int idl);
	public List<Laboratoire> getAllLabo();
	public void deleteById(int idl);

}
