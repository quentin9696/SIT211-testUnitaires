package voitures;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

import org.junit.Rule;
import org.junit.rules.ErrorCollector;

import voitures.Auto;
import static org.hamcrest.CoreMatchers.is;

public class AutoTest {

	public Auto auto;

	@Rule
	  public ErrorCollector collector= new ErrorCollector();
	
	public AutoTest() {
		
	}

	@Before
	public void setUp() {
		auto = new Auto("marque","modele", 10000.0f, 5.8f, 100000, 3, 4);
	}

	@After
	public void tearDown() {
	}
	
	/**
	 * Test of getMarque method, of class Auto.
	 */
	@Test
	public void testGetMarque() {
		System.out.println("Test de GetMarque");
		collector.checkThat("La marque n'est pas bonne", auto.getMarque(), is("marque"));
	}
	
	/**
	 * Test of getModele method, of class Auto.
	 */
	@Test
	public void testGetModele() {
		System.out.println("Test de GetModele");
		collector.checkThat("Le modèle n'est pas bon", auto.getModele(), is("modele"));
	}

	/**
	 * Test of getPrix method, of class Auto.
	 */
	@Test
	public void testGetPrix() {
		System.out.println("Test de GetPrix");
		collector.checkThat("Le prix n'est pas bon", auto.getPrix(), is(10000.0f));
	}

	/**
	 * Test of getConso method, of class Auto.
	 */
	@Test
	public void testGetConso() {
		System.out.println("Test de GetConso");
		collector.checkThat("Le prix n'est pas bon", auto.getConso(), is(5.8f));
	}
	
	/**
	 * Test of getKilometrage method, of class Auto.
	 */
	@Test
	public void testGetKilometrage() {
		System.out.println("Test de GetKilometrage");
		collector.checkThat("Le kilometrage n'est pas bon", auto.getKilometrage(), is(100000));
	}

	/**
	 * Test of getNbPortes method, of class Auto.
	 */
	@Test
	public void testGetNbPortes() {
		System.out.println("Test de GetNbPortes");
		collector.checkThat("Le nb de portes n'est pas bon", auto.getNbPortes(), is(3));
	}
	
	/**
	 * Test of getNbPlaces method, of class Auto.
	 */
	@Test
	public void testGetNbPlaces() {
		System.out.println("Test de GetPlaces");
		collector.checkThat("Le nb de places n'est pas bon", auto.getNbPlaces(), is(4));
	}
}