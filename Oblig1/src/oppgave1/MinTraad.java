package oppgave1;

public class MinTraad extends Thread {
	
	boolean fortsette = true;
	String s = "";
	
	public MinTraad(String navn) {
		super(navn);
	}
	
	public void nyStreng(String ny) {
		s = ny;
	}
	public void stopp() {
		fortsette = false;
	}
	
	@Override
	public void run() {
		while(fortsette) {
			System.out.println(s);
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
			}
		}
	}
	
}
