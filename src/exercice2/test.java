package exercice2;

import java.util.*;

public class test {

	public static void main(String[] args) {
		Note noteJava = new Note("java", 19);
		Note noteUx = new Note("ux", 18);
		Note noteFr = new Note("fr", 15);
		
		ArrayList<Note> noteMohamed = new ArrayList<Note>();
		noteMohamed.add(noteUx);
		noteMohamed.add(noteJava);
		
		etudiant e1 = new etudiant(92747,"Mohamed",noteMohamed);
		e1.addNote(noteFr);
		
		System.out.println(e1.toString());
		
	}

}
