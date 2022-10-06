package tn.esponline.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import tn.esponline.entities.Laboratoire;

@Repository
public interface ILaboratoireRepository extends JpaRepository<Laboratoire, Integer>{

}
