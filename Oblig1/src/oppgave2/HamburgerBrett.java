package oppgave2;

import java.util.Arrays;
import java.util.LinkedList;

public class HamburgerBrett {

	private int antall = 0;
	private int burgernr = 1;
	
	public HamburgerBrett(int KAPASITET) {
		antall = KAPASITET;
	}
	LinkedList<Integer> burgerB = new LinkedList<>();
	
	//Legger en hamburger til i listen og returnerer burgernummeret.
	public int leggPaa() {
		int nr = burgernr;
		burgerB.add(burgernr);
		burgernr++;
		return nr;
	}
	
	//Fjerner første plassen i listen og returnerer burgernummeret.
	public int taAv() {
		return burgerB.removeFirst();
	}
	
	public boolean erFull() {
		return burgerB.size() == antall;
	}
	
	public boolean erTom() {
		return burgerB.isEmpty();
	}

	@Override
	public String toString() {
		return "Brett: " + burgerB.toString();
	}
	
	
}
