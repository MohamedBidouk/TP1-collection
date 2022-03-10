package exercice1;
import java.util.*;

public class tacheComplexe <T extends tacheElementaire>{
	boolean estComplexe;
	T tacheElementaire;
	ArrayList<tacheElementaire> listTache = new ArrayList<tacheElementaire>();
	
	
	public tacheComplexe(ArrayList<tacheElementaire> listTache) {
		super();
		this.listTache = listTache;
	}



	public boolean isEstComplexe() {
		return estComplexe;
	}



	public void setEstComplexe(boolean estComplexe) {
		this.estComplexe = estComplexe;
	}



	public T getTacheElementaire() {
		return tacheElementaire;
	}



	public void setTacheElementaire(T tacheElementaire) {
		this.tacheElementaire = tacheElementaire;
	}



	public ArrayList<tacheElementaire> getListTache() {
		return listTache;
	}



	public void setListTache(ArrayList<tacheElementaire> listTache) {
		this.listTache = listTache;
	}



	



	@Override
	public String toString() {
		return "tacheComplexe [listTache=" + listTache + "]";
	}
	
}
