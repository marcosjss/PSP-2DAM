package main;

import java.util.concurrent.Semaphore;

public class Main {
	
	public static void main (String [] args) {
		Semaphore tunel = new Semaphore (1);
		Thread matilda = new Thread(new Tortuga("Matilda", tunel));
		Thread pepita = new Thread(new Tortuga("Pepita", tunel));
		Thread godofreda = new Thread(new Tortuga("Godofreda", tunel));
		
		matilda.start();
		pepita.start();
		godofreda.start();
	}
}
