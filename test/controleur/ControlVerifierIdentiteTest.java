package controleur;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import personnages.Chef;
import villagegaulois.Village;

class ControlVerifierIdentiteTest {
	private Village village;
	private ControlVerifierIdentite control;
	private ControlEmmenager controlEmmenager;
	
	@BeforeEach
	private void initTest() {
		village= new Village("le village",10,10);
		Chef chef = new Chef("Chef",1,village);
		village.setChef(chef);
		control=new ControlVerifierIdentite(village);
		controlEmmenager=new ControlEmmenager(village);
	}
	
	
	@Test
	void testControlVerifierIdentite() {
		assertNotNull(control);
	}

	@Test
	void testVerifierIdentite() {
		assertFalse(control.verifierIdentite("Astérix"));
		controlEmmenager.ajouterGaulois("Astérix",3);
		assertTrue(control.verifierIdentite("Astérix"));
		
	}

}
