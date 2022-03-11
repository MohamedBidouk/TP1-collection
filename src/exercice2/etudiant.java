package exercice2;

import java.util.*;

public class etudiant implements IStatisticable, java.lang.Comparable<etudiant>, Comparable<etudiant>{
	int matricule;
	String nom;
	Note n;
	ArrayList<Note> listNote = new ArrayList<Note>();

	public etudiant(int matricule, String nom, ArrayList<Note> listNote) {
		this.matricule = matricule;
		this.nom = nom;
		this.listNote = listNote;
	}
	
	
	public int getMatricule() {
		return matricule;
	}


	public void setMatricule(int matricule) {
		this.matricule = matricule;
	}


	public String getNom() {
		return nom;
	}


	public void setNom(String nom) {
		this.nom = nom;
	}


	public ArrayList<Note> getListNote() {
		return listNote;
	}


	public void setListNote(ArrayList<Note> listNote) {
		this.listNote = listNote;
	}


	public void addNote(Note n) {
		listNote.add(n);
	}

	@Override
	public String toString() {
		return "\n etudiant de matricule: " + matricule + "\n nom: " + nom + "\n listNote:" + listNote ;
	}
	
	@Override
	public double getAvg() {
		double tot = 0;
		for(int i = 0; i < listNote.size();i++ ) {
			tot = tot + listNote.get(i).note;
		}
		return tot/(listNote.size()-1);
	}

	@Override
	public double getMin() {
		double min = listNote.get(0).note;
		for(int i = 0; i < listNote.size();i++ ) {
			if (listNote.get(i).note < min ) min = listNote.get(i).note ;
		}
		return min;
	}

	@Override
	public double getMax() {
		double max = listNote.get(0).note;
		for(int i = 0; i < listNote.size();i++ ) {
			if (listNote.get(i).note > max ) max = listNote.get(i).note ;
		}
		return max;
	}

	@Override
	public int compareTo(etudiant e) {
        if(this.matricule==e.matricule) return 0;
        else if (this.matricule>e.matricule) return 1;
        else return -1;
        
	}


	
}
