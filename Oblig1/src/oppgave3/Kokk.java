package oppgave3;

public class Kokk extends Thread{

	private HamburgerBrett brett;
	private String navn;
	
	public Kokk(HamburgerBrett brett, String navn) {
		this.brett = brett;
		this.navn = navn;
	}
	
	
	@Override
	public void run() {
		while(true) {
			try {
					Thread.sleep((long) (Math.floor((Math.random() * 5) + 2) * 1000));
					System.out.println(navn + " (kokk) legger på hamburger " + brett.leggPaa() + ". " + brett.toString());
			
			} catch (InterruptedException e) {				
			}
		}
	}
}
