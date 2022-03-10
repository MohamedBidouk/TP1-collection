package exercice1;
import java.util.*;

public class main {

	public static void main(String[] args) {
		tacheElementaire t1 = new tacheElementaire("écrire",21);
		System.out.println(t1.toString());
		tacheElementaire t2 = new tacheElementaire("modif",23);
		System.out.println(t2.toString());
		tacheElementaire t3 = new tacheElementaire("save",12);
		System.out.println(t3.toString());
		
		ArrayList<tacheElementaire> lesTaches = new ArrayList<tacheElementaire>();
		lesTaches.add(t1);
		lesTaches.add(t2);
		lesTaches.add(t3);
		System.out.println("La liste contien:");
		for(int i = 0; i < lesTaches.size(); i++) {
			System.out.println(lesTaches.get(i));
		}
		int c = 0;
		int coutT = 0;
		while(lesTaches.size()>c) {
			coutT = coutT + lesTaches.get(c).cout;
			c = c + 1;
		}
		System.out.println("Le cout Totale de cette list est: " + coutT +" TND");
		}

}
