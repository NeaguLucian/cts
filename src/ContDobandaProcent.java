
public class ContDobandaProcent implements Cont {
	/**
	 * Suma initiala
	 */
	private double suma;
	
	/**
	 * Procentul de dobanda pe an
	 */
	private double procentAn;
	
	/**
	 * Constructor implicit
	 */
	public ContDobandaProcent()
	{
		procentAn = 0;
	}
	
	/**
	 * Constructor cu doi parametri
	 * @param suma Suma initiala 
	 * @param procent Procentul de dobanda pe an
	 */
	public ContDobandaProcent(double suma, double procent)
	{
		procentAn = procent;
		this.suma = suma;
	}
	
	/**
	 * Getter pentru procentul de dobanda pe an
	 * @return double
	 */
	public double getDobandaAn()
	{
		return procentAn;
	}
	
	/**
	 * Setter pentru procentul de dobanda pe an
	 * @param procent double
	 */
	public void setDobandaAn(double procent)
	{
		procentAn = procent;
	}
	
	/**
	 * Getter pentru suma initiala
	 * @return
	 */
	public double getSuma()
	{
		return procentAn;
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
		double suma_finala = suma;
		
		for (int i = 0; i < ani; i++) {
			suma_finala *= (100.0 + procentAn) / 100.0;
		}
		
		return suma_finala - suma;
	}
	
	/**
	 * Returneaza suma din cont dupa n ani
	 * @return double
	 */
	public double total(int ani)
	{
		double suma_finala = suma;
		
		for (int i = 0; i < ani; i++) {
			suma_finala *= (100.0 + procentAn) / 100.0;
		}
		
		return suma_finala;
	}
	
	/**
	 * Metoda toString()
	 */
	public String toString()
	{
		return "[Suma: " + suma + ", Dobanda/An: " + procentAn + "%]";
	}
}
