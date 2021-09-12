package oppgave3;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;

public class HamburgerBrett {
	
	private LinkedBlockingQueue<Integer> brett;
	private AtomicInteger burgernr;
	
	public HamburgerBrett(int KAPASITET) {
		brett = new LinkedBlockingQueue<Integer>(KAPASITET);
		burgernr = new AtomicInteger(1);
	}
	
	public int leggPaa() throws InterruptedException {
		brett.put(burgernr.get());
		return burgernr.incrementAndGet();
	}
	
	public int taAv() throws InterruptedException {
		return brett.take();
	}
	
//	public boolean erFull() {
//	}
	
//	public boolean erTom() {
//	}

	@Override
	public String toString() {
		return "Brett: " + brett.toString();
	}
	
	
}
