package oppgave1;

public class Streng {

	private String s = "Hallo verden!";
	
	public Streng(String s) {
		super();
		this.s = s;
	}

	public String getString() {
		return s;
	}
	
	public synchronized void nyStreng(String ny) {
		s = ny;
	}
	
	public synchronized void skrivUt() {
		System.out.println(s);
	}
}
