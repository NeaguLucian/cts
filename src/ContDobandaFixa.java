
public class ContDobandaFixa implements Cont {
	/**
	 * Suma initiala
	 */
	private double suma;
	
	/**
	 * Dobanda fixa pe an
	 */
	private double dobandaAn;
	
	/**
	 * Constructor implicit
	 */
	public ContDobandaFixa()
	{
		dobandaAn = 0;
		suma = 0;
	}
	
	/**
	 * Constructor cu doi parametri
	 * @param suma Suma initiala in cont
	 * @param dobanda Dobanda fixa pe an 
	 */
	public ContDobandaFixa(double suma, double dobanda)
	{
		dobandaAn = dobanda;
		this.suma = suma;
	}
	
	/**
	 * Getter pentru dobanda pe an
	 * @return double
	 */
	public double getDobandaAn()
	{
		return dobandaAn;
	}
	
	/**
	 * Setter pentru dobanda pe an
	 * @param dobanda double
	 */
	public void setDobandaAn(double dobanda)
	{
		dobandaAn = dobanda;
	}
	
	/**
	 * Getter pentru suma initiala
	 * @return double
	 */
	public double getSuma()
	{
		return suma;
	}
	
	/**
	 * Setter pentru suma initiala
	 * @param suma double
	 */
	public void setSuma(double suma)
	{
		this.suma = suma;
	}
	
	/**
	 * Returneaza dobanda dupa n ani
	 * @return double
	 */
	public double dobanda(int ani)
	{
		return dobandaAn * ani;
	}
	
	/**
	 * Returneaza suma din cont dupa n ani
	 * @return double
	 */
	public double total(int ani)
	{
		return dobandaAn * ani + suma;
	}
	
	/**
	 * Metoda toString()
	 */
	public String toString()
	{
		return "[Suma: " + suma + ", Dobanda/An: " + dobandaAn + "]";
	}
}
