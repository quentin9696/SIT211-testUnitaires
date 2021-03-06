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
		System.out.println("Test de f1");
		collector.checkThat("Test de f1 1",garage.f1("marque"),is(2));
		
		System.out.println("Test de f1");
		collector.checkThat("Test de f1 2",garage.f1("marque2"),is(1));
		
		System.out.println("Test de f1");
		collector.checkThat("Test de f1 3",garage2.f1("marque2"),is(0));
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
		
		System.out.println("Test de f2");
		collector.checkThat("Test de f2 3",garage2.f2("modele2"),is(0));
	}
	
	/**
	 * Test of f3 method, of class Garage.
	 */
	@Test
	public void testF3() {
		System.out.println("Test de f3");
		collector.checkThat("Test de f3 1",garage.f3(),is(3));
		
		System.out.println("Test de f3");
		collector.checkThat("Test de f3 2",garage2.f3(),is(0));
		
	}
	
	/**
	 * Test of f4 method, of class Garage.
	 */
	@Test
	public void testF4() {
		System.out.println("Test de f4");
		collector.checkThat("Test de f4 1",garage.f4(),is(false));
		
		System.out.println("Test de f4");
		collector.checkThat("Test de f4 2",garage2.f4(),is(true));
		
	}
	
	/**
	 * Test of f5 method, of class Garage.
	 */
	@Test
	public void testF5() {
		System.out.println("Test de f5");
		collector.checkThat("Test de f5 1",garage.f5(),is(2));

		System.out.println("Test de f5");
		collector.checkThat("Test de f5 2",garage2.f5(),is(-1));
	}
	
	
	@Test
	public void testF6() {
		
		System.out.println("Test de f6");
		collector.checkThat("Test de f6 1",garage.f6(),is(2));
		
		Garage garage_f6 = garage;
		garage_f6.ajouter(new Auto("marque","modele", 1000000.0f, 2.8f, 1, 5, 4));
		
		System.out.println("Test de f6");
		collector.checkThat("Test de f6 2",garage.f6(),is(3));
		
		System.out.println("Test de f6");
		collector.checkThat("Test de f6 2",garage2.f6(),is(-1));
	}
	
	/**
	 * Test of f7 method, of class Garage.
	 */
	@Test
	public void testF7() {
		System.out.println("Test de f7");
		collector.checkThat("Test de f7 1",garage.f7(),is(95000f));
		
		Garage garage_f7 = garage;
		garage_f7.ajouter(new Auto("marque","modele", 110000.0f, 2.8f, 1, 5, 4));
		System.out.println("Test de f7");
		collector.checkThat("Test de f7 2",garage_f7.f7(),is(105000f));
		System.out.println("Test de f7");
		collector.checkThat("Test de f7 3",garage2.f7(),is(0f));
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
		
		System.out.println("Test de f8");
		collector.checkThat("Test de f8 3",garage2.f8(),is(0));
	}
	
	/**
	 * Test of f9 method, of class Garage.
	 */
	@Test
	public void testF9() {
		System.out.println("Test de f9");
		collector.checkThat("Test de f9 1",garage.f9(),is(1));
		
		System.out.println("Test de f9");
		collector.checkThat("Test de f9 2",garage2.f9(),is(-1));
		
		garage2.ajouter(new Auto("marque","modele", 10000.0f, 5.8f, 100000, 3, 4));
		
		System.out.println("Test de f9");
		collector.checkThat("Test de f9 3",garage2.f9(),is(-1));
		
	}
	
	/**
	 * Test of f10 method, of class Garage.
	 */
	@Test
	public void testF10() {
		
		System.out.println("Test de f10");
		collector.checkThat("Test de f10 2",garage.f10(2,1),is(-1));
		
		System.out.println("Test de f10");
		collector.checkThat("Test de f10 2",garage.f10(5,10001),is(2));
		
		System.out.println("Test de f10");
		collector.checkThat("Test de f10 3",garage2.f10(2,10000),is(-1));
		
	}

}