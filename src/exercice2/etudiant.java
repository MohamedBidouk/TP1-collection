package exercice2;

import java.util.*;

public class etudiant{
	int matricule;
	String nom;
	Note n;
	ArrayList<Note> listNote = new ArrayList<Note>();

	public etudiant(int matricule, String nom, ArrayList<Note> listNote) {
		this.matricule = matricule;
		this.nom = nom;
		this.listNote = listNote;
	}
	
	public void addNote(Note n) {
		listNote.add(n);
	}

	@Override
	public String toString() {
		return "etudiant [matricule=" + matricule + ", nom=" + nom + ", listNote=" + listNote + "]";
	}
	
}
