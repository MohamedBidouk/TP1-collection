package exercice1;

public class tacheElementaire<T> implements Tache{
	String nom;
	int cout;
	
	public String getNom() {
		return nom;
	}
	
	public int getCout() {
		return cout;
	}
	

	@Override
	public String toString() {
		return "tacheElementaire [nom=" + nom + ", cout=" + cout + "]";
	}

	public tacheElementaire(String nom, int cout) {
		super();
		this.nom = nom;
		this.cout = cout;
	}
	
	
}
