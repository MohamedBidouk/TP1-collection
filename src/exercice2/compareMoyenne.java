package exercice2;

public class compareMoyenne implements Comparator<etudiant>, java.util.Comparator<etudiant>{

	@Override
	public int compare(etudiant a, etudiant b) {
		if(a.getAvg()==b.getAvg()) return 0;
        else if (a.getAvg()>b.getAvg()) return 1;
        else return -1;
	}


}
