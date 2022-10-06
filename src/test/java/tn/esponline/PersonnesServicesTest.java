package tn.esponline;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import tn.esponline.entities.Gender;
import tn.esponline.entities.Personne;
import tn.esponline.services.IPersonneServices;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PersonnesServicesTest {

	@Autowired
	IPersonneServices personnesservices;
	@Test
	public void testaddPErsonne() throws ParseException {
		SimpleDateFormat df= new SimpleDateFormat("dd/mm/yyyy");
		Date date= df.parse("22/05/1988");
		Personne p = new Personne("Foued", date, Gender.homme);
		//int actuel=personnesservices.getAll().size();
		
//		personnesservices.addPersonne(p);
//		assertEquals(7, personnesservices.getAll().size());
		
	}
	
	@Test(expected = NullPointerException.class)
	public void whenExceptionThrown_thenExpectationSatisfied() {
	    String test = null;
	    test.length();
	}
	
}
