import static org.junit.Assert.*;

import org.junit.Test;


public class TestContDobandaProcent {
	
	/**
	 * Un epsilon, o eroare relativa pentru a aproxima erorile ce reies din calculele pe floating point.
	 */
	final static double EPS = 0.0000001;

	/**
	 * Verifica daca dobanda cu procent dupa 10 ani, pornind de la o suma initiala nula
	 * este tot nula.
	 */
	@Test
	public void testDobanda0() {
		ContFactory cf = new ContFactory();
		ContDobandaProcent cont = (ContDobandaProcent) cf.creeazaCont("PROCENT");
		
		cont.setDobandaAn(15);
		cont.setSuma(0);
		
		assertEquals(0, cont.dobanda(10), EPS);
	}
	
	/**
	 * Verifica daca dobanda cu procent de 10% pe an, dupa 2 ani, pornind de la o suma initiala de 100 
	 * este de 21.
	 */
	@Test
	public void testDobanda1() {
		ContFactory cf = new ContFactory();
		ContDobandaProcent cont = (ContDobandaProcent) cf.creeazaCont("PROCENT");
		
		cont.setDobandaAn(10);
		cont.setSuma(100);
		
		assertEquals(21, cont.dobanda(2), EPS);
	}

	/**
	 * Verifica daca suma totala, cu dobanda de 10% pe an, dupa 2 ani, pornind de la o suma initiala de 100 
	 * este de 121.
	 */
	@Test
	public void testTotal0() {
		ContFactory cf = new ContFactory();
		ContDobandaProcent cont = (ContDobandaProcent) cf.creeazaCont("PROCENT");
		
		cont.setDobandaAn(10);
		cont.setSuma(100);
		
		assertEquals(121, cont.total(2), EPS);
	}
}
