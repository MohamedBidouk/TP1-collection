package exercice2;

import java.util.*;

public class Stats{
	private ArrayList<etudiant> etudiantsList;

	public Stats(ArrayList<etudiant> etudiantsList) {
		super();
		this.etudiantsList = etudiantsList;
	}
	
	public void getClassDetails() {
		System.out.println("Ce class contient "+etudiantsList.size()+" étudiants");
	}
	public double getClassAvg() {
		double tot = 0;
		for(int i = 0; i < etudiantsList.size(); i++) {
			tot = tot + etudiantsList.get(i).getAvg();
		}
			
		return tot/(etudiantsList.size());
	}
	public etudiant getBestStudent() {
		int indexOfBest = 0;
		int i = 0;
		while(i<etudiantsList.size() - 1) {
			if(etudiantsList.get(i+1).getAvg() > etudiantsList.get(i).getAvg()) indexOfBest = i+1;
			i = i + 1;
		}
		return etudiantsList.get(indexOfBest);
	}
	public etudiant getWorstStudent() {
		int indexOfWorst = 0;
		int i = 0;
		while(i < etudiantsList.size()-1) {
			if(etudiantsList.get(i+1).getAvg() < etudiantsList.get(i).getAvg()) indexOfWorst = i+1;
			i = i +1;
		}
		return etudiantsList.get(indexOfWorst);
	}
	
}
