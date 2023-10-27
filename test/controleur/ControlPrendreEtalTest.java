package controleur;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import personnages.Chef;
import villagegaulois.Village;

class ControlPrendreEtalTest {
	private Village village;
	private ControlPrendreEtal control;
	private ControlEmmenager controlEmmenager;
	
	@BeforeEach
	private void initTest() {
		village= new Village("le village",10,10);
		Chef chef = new Chef("Chef",1,village);
		village.setChef(chef);
		ControlVerifierIdentite controlVerifiderId= new ControlVerifierIdentite(village);
		control=new ControlPrendreEtal(controlVerifiderId,village);
		controlEmmenager=new ControlEmmenager(village);
	}
	
	
	
	
	@Test
	void testControlPrendreEtal() {
		assertNotNull(control);
	}

	@Test
	void testResteEtals() {
		fail("Not yet implemented");
	}

	@Test
	void testPrendreEtal() {
		assertEquals(control.prendreEtal("Damien","vestes",4),-1);
		controlEmmenager.ajouterGaulois("Damien",90);
		assertEquals(control.prendreEtal("Damien","vestes",4),0);
		assertEquals(control.prendreEtal("Emily","vestes",4),1);
	}

	@Test
	void testVerifierIdentite() {
		fail("Not yet implemented");
	}

}
