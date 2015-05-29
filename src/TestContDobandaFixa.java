import static org.junit.Assert.*;

import org.junit.Test;


public class TestContDobandaFixa {
	/**
	 * Un epsilon, o eroare relativa pentru a aproxima erorile ce reies din calculele pe floating point.
	 */
	final static double EPS = 0.0000001;
	
	/**
	 * Verifica daca dupa 0 ani dobanda este 0
	 */
	@Test
	public void testDobanda0()
	{
		ContFactory cf = new ContFactory();
		ContDobandaFixa cont = (ContDobandaFixa) cf.creeazaCont("FIX");
		
		cont.setDobandaAn(15);
		cont.setSuma(0);
		
		assertEquals(0, cont.dobanda(0), EPS);
	}
	
	/**
	 * Verifica daca dupa 5 ani de dobanda fixa 15, dobanda totala este 75
	 */
	@Test
	public void testDobanda1()
	{
		ContFactory cf = new ContFactory();
		ContDobandaFixa cont = (ContDobandaFixa) cf.creeazaCont("FIX");
		
		cont.setDobandaAn(15);
		cont.setSuma(20);
		
		assertEquals(75, cont.dobanda(5), EPS);
	}
	
	/**
	 * Verifica daca dupa 5 ani de dobanda fixa 15, cu suma initiala de 20, suma finala este 95
	 */
	@Test
	public void testTotal0()
	{
		ContFactory cf = new ContFactory();
		ContDobandaFixa cont = (ContDobandaFixa) cf.creeazaCont("FIX");
		
		cont.setDobandaAn(15);
		cont.setSuma(20);
		
		assertEquals(95, cont.total(5), EPS);
	}

}
