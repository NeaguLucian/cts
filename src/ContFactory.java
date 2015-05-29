
public class ContFactory {
	/**
	 * Creeaza un Cont (ContDobandaFixa / ContDobandaProcent) in functie de parametrul dat.
	 * @param tipCont String "FIX"/"PROCENT"
	 * @return Cont
	 */
	public Cont creeazaCont(String tipCont) {
		if (tipCont == "FIX") {
			return new ContDobandaFixa();
		}
		if (tipCont == "PROCENT") {
			return new ContDobandaProcent();
		}
		return null;
	}
}
