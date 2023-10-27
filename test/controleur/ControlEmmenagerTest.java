package controleur;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import personnages.Chef;
import villagegaulois.Village;

class ControlEmmenagerTest {
	private Village village;
	private ControlEmmenager control;

	
	@BeforeEach
	private void initTest() {
		village= new Village("le village",10,10);
		Chef chef = new Chef("Chef",1,village);
		village.setChef(chef);
		control=new ControlEmmenager(village);
	}
	
	
	@Test
	void testControlEmmenager() {
		assertNotNull(control);
	}

	@Test
	void testIsHabitant() {
		assertFalse(control.isHabitant("Asterix"));
		control.ajouterGaulois("Astérix",12);
		assertTrue(control.isHabitant("Astérix"));
	}

	@Test
	void testAjouterDuide() {
		assertFalse(control.isHabitant("Coucou"));
		control.ajouterDuide("Coucou",3,2,5);
		assertTrue(control.isHabitant("Coucou"));
	}

	@Test
	void testAjouterGaulois() {
		assertFalse(control.isHabitant("Obélix"));
		control.ajouterGaulois("Obélix",3);
		assertTrue(control.isHabitant("Obélix"));
	}

}
