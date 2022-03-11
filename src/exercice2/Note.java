package exercice2;

public class Note {
	private String NomCours;
	double note;
	public Note(String nomCours, double note) {
		super();
		NomCours = nomCours;
		this.note = note;
	}
	public String getNomCours() {
		return NomCours;
	}
	public void setNomCours(String nomCours) {
		NomCours = nomCours;
	}
	public double getNote() {
		return note;
	}
	public void setNote(double note) {
		this.note = note;
	}
	@Override
	public String toString() {
		return "\n Cour: " + NomCours + ", note=" + note ;
	}
	
	
}
