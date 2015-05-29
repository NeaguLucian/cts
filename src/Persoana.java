import java.util.ArrayList;


public class Persoana extends Subject {

	/*
	 * Singleton pattern
	 */
	private static Persoana singletonInstance = null;
	
	/**
	 * Protected constructor - obiectele nu poate fi instantiates decat din interior
	 */
	protected Persoana()
	{
		listaConturi = new ArrayList<Cont>();
	}
	
	/**
	 * @return instanta singleton
	 */
	public static Persoana getInstance()
	{
		if (singletonInstance == null)
			singletonInstance = new Persoana();
		
		return singletonInstance;
	}
	
	/**
	 * Lista cu conturile adaugate
	 */
	private ArrayList<Cont> listaConturi;
	
	/**
	 * Adauga un cont specificat ca parametru.
	 * @param cont ContDobandaFixa sau ContDobandaProcent
	 */
	public void adaugaCont(Cont cont)
	{
		listaConturi.add(cont);
		notifyObservers();
	}
	
	/**
	 * Elimina toate conturile din lista
	 */
	public void stergeConturi()
	{
		listaConturi.clear();
	}
	
	/**
	 * Returneaza dobanda obtinuta dupa n ani de conturile adaugate
	 * @param ani Numar intreg
	 * @return Dobanda obtinuta
	 */
	public double dobandaTotala(int ani)
	{
		double sum = 0;
		for (Cont c : listaConturi) {
			sum += c.dobanda(ani);
		}
		
		return sum;
	}
	
	/**
	 * Returneaza suma obtinuta dupa n ani in conturile adaugate
	 * @param ani Numar intreg
	 * @return Suma totala
	 */
	public double sumaTotala(int ani)
	{
		double sum = 0;
		for (Cont c : listaConturi) {
			sum += c.total(ani);
		}
		
		return sum;
	}
	
	/**
	 * Returneaza cel mai profitabil cont dupa n ani
	 * @param ani Numar intreg
	 * @return Cont
	 */
	public Cont profitabil(int ani)
	{
		double max = 0;
		Cont ans = null;
		
		for (Cont c : listaConturi) {
			if (c.dobanda(ani) > max) {
				max = c.dobanda(ani);
				ans = c;
			}
		}
		
		return ans;
	}
	
	/**
	 * Returneaza cel mai neprofitabil cont dupa n ani
	 * @param ani Numar intreg
	 * @return Cont
	 */
	public Cont neprofitabil(int ani)
	{
		double min = Double.POSITIVE_INFINITY;
		Cont ans = null;
		
		for (Cont c : listaConturi) {
			if (c.dobanda(ani) < min) {
				min = c.dobanda(ani);
				ans = c;
			}
		}
		
		return ans;
	}
	
	/**
	 * Returneaza contul cu cea mai mare suma dupa n ani
	 * @param ani Numar intreg
	 * @return Cont
	 */
	public Cont maxim(int ani)
	{
		double max = 0;
		Cont ans = null;
		
		for (Cont c : listaConturi) {
			if (c.total(ani) > max) {
				max = c.total(ani);
				ans = c;
			}
		}
		
		return ans;
	}
	
	/**
	 * Returneaza contul cu cea mai mica suma dupa n ani
	 * @param ani Numar intreg
	 * @return Cont
	 */
	public Cont minim(int ani)
	{
		double min = Double.POSITIVE_INFINITY;
		Cont ans = null;
		
		for (Cont c : listaConturi) {
			if (c.total(ani) < min) {
				min = c.total(ani);
				ans = c;
			}
		}
		
		return ans;
	}
}
