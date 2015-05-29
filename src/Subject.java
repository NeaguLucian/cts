import java.util.List;
import java.util.ArrayList;

public class Subject {
	/**
	 * Lista de observatori
	 */
	private List<Observer> observatori = new ArrayList<Observer>();

	/**
	 * Ataseaza un observator o acestui subiect.
	 * @param o Observer
	 */
	public void attach(Observer o)
	{
		observatori.add(o); 
	}
	
	/**
	 * Alerteaza observatorii ca s-a produs o modificare.
	 */
	protected void notifyObservers()
	{
		for (Observer o : observatori)
		{
			o.update();
		}
	}
}
