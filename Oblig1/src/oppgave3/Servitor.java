package oppgave3;

public class Servitor extends Thread{

	private HamburgerBrett brett;
	private String navn;
	
	public Servitor(HamburgerBrett brett, String navn) {
		this.brett = brett;
		this.navn = navn;
	}
	
	@Override
	public void run() {
		while(true) {
			try {
				Thread.sleep((long) (Math.floor((Math.random() * 5) + 2) * 1000));
				

					System.out.println(navn + " (servitor) tar av hamburger " + brett.taAv() + ". " + brett.toString());

				
			} catch (InterruptedException e) {
				
			}
		}
	}
}
