
public class Program {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Persoana p = Persoana.getInstance();
		ContFactory cf = new ContFactory();
		
		ContDobandaFixa cdf = (ContDobandaFixa) cf.creeazaCont("FIX");
		cdf.setDobandaAn(1);
		cdf.setSuma(100);
		
		ContDobandaProcent cdp = (ContDobandaProcent) cf.creeazaCont("PROCENT");
		cdp.setDobandaAn(35);
		cdp.setSuma(10);
		
		cdp = (ContDobandaProcent) cf.creeazaCont("PROCENT");
		cdp.setDobandaAn(15);
		cdp.setSuma(10);
		
		p.adaugaCont(cdf);
		p.adaugaCont(cdp);
		
		System.out.println("Dobanda dupa 10 ani: " + p.dobandaTotala(10));
		System.out.println("Suma dupa 10 ani: " + p.sumaTotala(10));
		System.out.println("Contul cel mai profitabil dupa 10 ani: " + p.profitabil(10).toString());
		System.out.println("Contul cel mai neprofitabil dupa 10 ani: " + p.neprofitabil(10).toString());
		System.out.println("Contul cu cea mai mare suma dupa 10 ani: " + p.maxim(10).toString());
		System.out.println("Contul cu cea mai mica suma dupa 10 ani: " + p.minim(10).toString());
	}

}
