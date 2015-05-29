import static org.junit.Assert.*;

import org.junit.Test;


public class TestPersoana {
	
	/**
	 * Un epsilon, o eroare relativa pentru a aproxima erorile ce reies din calculele pe floating point.
	 */
	final static double EPS = 0.0000001;
	
	/**
	 * Testeaza daca doua conturi, unul cu dobanda fixa si altul cu dobanda procent pe an, cumulate
	 * dau dobanda buna. 
	 */
	@Test
	public void test0() {
		Persoana p = Persoana.getInstance();
		
		ContFactory cf = new ContFactory();
		ContDobandaFixa cdf = (ContDobandaFixa) cf.creeazaCont("FIX");
		ContDobandaProcent cdp = (ContDobandaProcent) cf.creeazaCont("PROCENT");
		
		cdf.setDobandaAn(15);
		cdf.setSuma(50);
		
		cdp.setDobandaAn(10);
		cdp.setSuma(100);
		
		p.adaugaCont(cdf);
		p.adaugaCont(cdp);
		
		assertEquals(51, p.dobandaTotala(2), EPS);
		
		p.stergeConturi();
	}
	
	/**
	 * Testeaza daca doua conturi, unul cu dobanda fixa si altul cu dobanda procent pe an, cumulate
	 * dau suma totala buna. 
	 */
	@Test
	public void test1() {
		Persoana p = Persoana.getInstance();
		
		ContFactory cf = new ContFactory();
		ContDobandaFixa cdf = (ContDobandaFixa) cf.creeazaCont("FIX");
		ContDobandaProcent cdp = (ContDobandaProcent) cf.creeazaCont("PROCENT");
		
		cdf.setDobandaAn(15);
		cdf.setSuma(50);
		
		cdp.setDobandaAn(10);
		cdp.setSuma(100);
		
		p.adaugaCont(cdf);
		p.adaugaCont(cdp);
		
		assertEquals(201, p.sumaTotala(2), EPS);
		
		p.stergeConturi();
	}
	
	/**
	 * Testeaza care dintre cele doua conturi (unul cu dobanda fixa, altul cu dobanda variabila)
	 * este mai profitabil.
	 */
	@Test
	public void test2() {
		Persoana p = Persoana.getInstance();
		
		ContFactory cf = new ContFactory();
		ContDobandaFixa cdf = (ContDobandaFixa) cf.creeazaCont("FIX");
		ContDobandaProcent cdp = (ContDobandaProcent) cf.creeazaCont("PROCENT");
		
		cdf.setDobandaAn(15);
		cdf.setSuma(50);
		
		cdp.setDobandaAn(10);
		cdp.setSuma(100);
		
		p.adaugaCont(cdf);
		p.adaugaCont(cdp);
		
		assertEquals(p.profitabil(2), cdf);
		
		p.stergeConturi();
	}
	
	/**
	 * Testeaza care dintre cele doua conturi (unul cu dobanda fixa, altul cu dobanda variabila)
	 * este mai putin profitabil.
	 */
	@Test
	public void test3() {
		Persoana p = Persoana.getInstance();
		
		ContFactory cf = new ContFactory();
		ContDobandaFixa cdf = (ContDobandaFixa) cf.creeazaCont("FIX");
		ContDobandaProcent cdp = (ContDobandaProcent) cf.creeazaCont("PROCENT");
		
		cdf.setDobandaAn(15);
		cdf.setSuma(50);
		
		cdp.setDobandaAn(10);
		cdp.setSuma(100);
		
		p.adaugaCont(cdf);
		p.adaugaCont(cdp);
		
		assertEquals(p.neprofitabil(2), cdp);
		
		p.stergeConturi();
	}
	
	
	/**
	 * Testeaza care dintre cele doua conturi (unul cu dobanda fixa, altul cu dobanda variabila)
	 * va avea o suma mai mare dupa 3 ani.
	 */
	@Test
	public void test4() {
		Persoana p = Persoana.getInstance();
		
		ContFactory cf = new ContFactory();
		ContDobandaFixa cdf = (ContDobandaFixa) cf.creeazaCont("FIX");
		ContDobandaProcent cdp = (ContDobandaProcent) cf.creeazaCont("PROCENT");
		
		cdf.setDobandaAn(15);
		cdf.setSuma(50);
		
		cdp.setDobandaAn(10);
		cdp.setSuma(100);
		
		p.adaugaCont(cdf);
		p.adaugaCont(cdp);
		
		assertEquals(p.maxim(3), cdp);
		
		p.stergeConturi();
	}
	
	
	/**
	 * Testeaza care dintre cele doua conturi (unul cu dobanda fixa, altul cu dobanda variabila)
	 * va avea o suma mai mare dupa 3 ani.
	 */
	@Test
	public void test5() {
		Persoana p = Persoana.getInstance();
		
		ContFactory cf = new ContFactory();
		ContDobandaFixa cdf = (ContDobandaFixa) cf.creeazaCont("FIX");
		ContDobandaProcent cdp = (ContDobandaProcent) cf.creeazaCont("PROCENT");
		
		cdf.setDobandaAn(15);
		cdf.setSuma(50);
		
		cdp.setDobandaAn(10);
		cdp.setSuma(100);
		
		p.adaugaCont(cdf);
		p.adaugaCont(cdp);
		
		assertEquals(p.minim(3), cdf);
		
		p.stergeConturi();
	}
}
