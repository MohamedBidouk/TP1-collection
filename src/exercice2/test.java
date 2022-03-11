package exercice2;

import java.util.*;

public class test {

	public static void main(String[] args) {
		Note noteJava = new Note("java", 0);
		Note noteUx = new Note("ux", 0);
		Note noteFr = new Note("fr", 15);
		
		Note noteJava1 = new Note("java", 20);
		Note noteUx1 = new Note("ux", 14);
		Note noteFr1 = new Note("fr", 17);
		
		Note noteJava2 = new Note("java", 5);
		Note noteUx2 = new Note("ux", 16);
		Note noteFr2 = new Note("fr", 17);
		
		ArrayList<Note> noteMohamed = new ArrayList<Note>();
		noteMohamed.add(noteUx);
		noteMohamed.add(noteJava);
		
		ArrayList<Note> noteMohsen = new ArrayList<Note>();
		noteMohsen.add(noteUx2);
		noteMohsen.add(noteJava2);
		
		ArrayList<Note> noteAissa = new ArrayList<Note>();
		noteAissa.add(noteUx1);
		noteAissa.add(noteJava1);
		
		etudiant e1 = new etudiant(92747,"Mohamed",noteMohamed);
		e1.addNote(noteFr);
		
		etudiant e2 = new etudiant(92723,"Aissa",noteAissa);
		e2.addNote(noteFr1);
		
		etudiant e3 = new etudiant(71723,"Mohsen",noteMohsen);
		e3.addNote(noteFr2);
		
		System.out.println(e1.toString());
		System.out.println(e2.toString());
		System.out.println(e3.toString());
		
		ArrayList<etudiant> listEtud = new ArrayList<etudiant>();
		listEtud.add(e1);
		listEtud.add(e2);
		listEtud.add(e3);
		
		System.out.println(listEtud);

		System.out.println("\n sorted by matricule: \n");
		Collections.sort((List<etudiant>) listEtud);
		System.out.println(listEtud);
		
		System.out.println("\n Sort by moyenne: ");
		compareMoyenne moyenneComparator = new compareMoyenne();
		listEtud.sort(moyenneComparator);
		System.out.println(listEtud);
		
		System.out.println("\n Sort by name: ");
		compareNom nameComparator = new compareNom();
		listEtud.sort(nameComparator);
		System.out.println(listEtud);
		
		Stats etudiantsList = new Stats(listEtud);
		etudiantsList.getClassDetails();
		double avg = etudiantsList.getClassAvg(); 
		System.out.println("\n Le moyenne de la class: "+avg);
		
		etudiant bestEtudiant = etudiantsList.getBestStudent();
		System.out.println("\n Le meilleure étudiant de la class: "+bestEtudiant);
		
		etudiant worstEtudiant = etudiantsList.getWorstStudent();
		System.out.println("\n Le moindre étudiant de la class: "+worstEtudiant);
		
		
		

	}

}
