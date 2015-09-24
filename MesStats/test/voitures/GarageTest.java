package voitures;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

import org.junit.Rule;
import org.junit.rules.ErrorCollector;

import voitures.Garage;
import static org.hamcrest.CoreMatchers.is;

public class GarageTest {

	Garage garage;
	Garage garage2;
	
	Auto auto1;
	Auto auto2;
	Auto auto3;
	
	@Rule
	  public ErrorCollector collector= new ErrorCollector();
	
	public GarageTest() {
	}

	@Before
	public void setUp() {
		// TODO
		// Declare 1 garage de 20 places
		garage = new Garage(20);
		garage2 = new Garage(10);
		
		// Auto 
		auto1 = new Auto("marque","modele", 10000.0f, 5.8f, 100000, 3, 4);
		auto2 = new Auto("marque2","modele2", 5000.0f, 3.4f, 10000, 5, 5);
		auto3 = new Auto("marque","modele", 100000.0f, 2.8f, 1, 5, 4);
		
		//Add les voitures au garage
		garage.ajouter(auto1);
		garage.ajouter(auto2);
		garage.ajouter(auto3);
	}

	@After
	public void tearDown() {
	}
	
	/**
	 * Test of f1 method, of class Garage.
	 */
	@Test
	public void testF1() {
		/*System.out.println("Test de f1");
		collector.checkThat("Test de f1 1",,is());*/
		fail("Not yet implemented"); // TODO
	}
	
	/**
	 * Test of f2 method, of class Garage.
	 */
	@Test
	public void testF2() {
		System.out.println("Test de f2");
		collector.checkThat("Test de f2 1",garage.f2("modele"),is(2));
		
		System.out.println("Test de f2");
		collector.checkThat("Test de f2 2",garage.f2("modele2"),is(1));
		//fail("Not yet implemented"); // TODO
	}
	
	/**
	 * Test of f3 method, of class Garage.
	 */
	@Test
	public void testF3() {
		fail("Not yet implemented"); // TODO
	}
	
	/**
	 * Test of f4 method, of class Garage.
	 */
	@Test
	public void testF4() {
		System.out.println("Test de f4");
		collector.checkThat("Test de f4 1",garage.f4(),is(false));
		
		System.out.println("Test de f4");
		collector.checkThat("Test de f4 1",garage2.f4(),is(true));
		
		//fail("Not yet implemented"); // TODO
	}
	
	/**
	 * Test of f5 method, of class Garage.
	 */
	@Test
	public void testF5() {
		fail("Not yet implemented"); // TODO
	}
	
	/**
	 * Test of f6 method, of class Garage.
	 */
	@Test
	public void testF6() {
		
		System.out.println("Test de f6");
		collector.checkThat("Test de f6 1",garage.f6(),is(2));
		
		Garage garage_f6 = garage;
		garage_f6.ajouter(new Auto("marque","modele", 1000000.0f, 2.8f, 1, 5, 4));
		
		System.out.println("Test de f6");
		collector.checkThat("Test de f6 2",garage.f6(),is(3));
		
		//fail("Not yet implemented"); // TODO
	}
	
	/**
	 * Test of f7 method, of class Garage.
	 */
	@Test
	public void testF7() {
		fail("Not yet implemented"); // TODO
	}
	
	/**
	 * Test of f8 method, of class Garage.
	 */
	@Test
	public void testF8() {
		
		System.out.println("Test de f8");
		collector.checkThat("Test de f8 1",garage.f8(),is(36667));
		
		Garage garage_f8 = garage;
		garage_f8.ajouter(new Auto("marque","modele", 1000000.0f, 2.8f, 10, 5, 4));
		
		System.out.println("Test de f8");
		collector.checkThat("Test de f8 2",garage_f8.f8(),is(27502));
		
		//fail("Not yet implemented"); // TODO
	}
	
	/**
	 * Test of f9 method, of class Garage.
	 */
	@Test
	public void testF9() {
		fail("Not yet implemented"); // TODO
	}
	
	/**
	 * Test of f10 method, of class Garage.
	 */
	@Test
	public void testF10() {
		
		System.out.println("Test de f10");
		collector.checkThat("Test de f10 2",garage.f10(2,1),is(-1));
		
		System.out.println("Test de f10");
		collector.checkThat("Test de f10 2",garage.f10(6,10001),is(27502));
		fail("Not yet implemented"); // TODO
	}

}