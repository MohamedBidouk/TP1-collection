package exercice2;

public class compareNom implements Comparator<etudiant>, java.util.Comparator<etudiant>{

	@Override
	public int compare(etudiant a, etudiant b) {
	     return a.nom.compareTo(b.nom);
	}
}
