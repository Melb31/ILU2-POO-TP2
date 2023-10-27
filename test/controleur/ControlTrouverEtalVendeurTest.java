package controleur;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import personnages.Chef;
import villagegaulois.Village;

class ControlTrouverEtalVendeurTest {
	private Village village;
	private ControlTrouverEtalVendeur control;
	
	@BeforeEach
	private void initTest() {
		village= new Village("le village",10,10);
		control=new ControlTrouverEtalVendeur(village);
	}
	
	
	@Test
	void testControlTrouverEtalVendeur() {
		assertNotNull(control);
		
	}

	@Test
	void testTrouverEtalVendeur() {
		assertNull(control.trouverEtalVendeur("Obélix"));
		
	}

}
