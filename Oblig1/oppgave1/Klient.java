package oppgave1;

import javax.swing.JOptionPane;

public class Klient {

	public static void main(String[] args) throws InterruptedException {
		
		String st = "";
		
		MinTraad t = new MinTraad("u");
		t.nyStreng("Hallo verden!");
		t.start();
		
		while(st != null && !st.equals("stopp")) {
			st = JOptionPane.showInputDialog("Skriv her. Skriv |stopp| for å avslutte");
			t.nyStreng(st);
		}
		
		t.stopp();
	}
}
