//package tn.esponline;
//
//
//import java.text.ParseException;
//import java.text.SimpleDateFormat;
//import java.util.Date;
//
//import org.junit.Test;
//import org.junit.jupiter.api.Assertions;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.test.context.junit4.SpringRunner;
//
//import tn.esponline.entities.Gender;
//import tn.esponline.entities.Personne;
//import tn.esponline.services.IPersonneServices;
//@RunWith(SpringRunner.class)
//@SpringBootTest
//public class PersTest {
//	
//	@Autowired
//	IPersonneServices perservices;
//
//	@Test
//	public void testaddPersonne() throws ParseException {
//		SimpleDateFormat df= new SimpleDateFormat("dd/mm/yyyy");
//		Date date= df.parse("22/05/1988");
//		
//		Personne personne= new Personne("Ahmed", date, Gender.homme);
//		int courant = perservices.getAll().size();
//		perservices.addPersonne(personne);
//		Assertions.assertEquals(2, perservices.getAll().size());
//		
//		
//	}
//
//}
