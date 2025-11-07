package main;

import java.util.concurrent.Semaphore;


public class Tortuga implements Runnable {
	private String nombre;
	private int velocidad;
	private int avanza = 0;
	private Semaphore tunel;
	
	
	public Tortuga(String nombre, Semaphore tunel) {
		this.nombre = nombre;
		this.tunel = tunel;
		this.velocidad = 1;
	}
	
	public void avanzar() {
		this.avanza = this.avanza + this.velocidad;
		System.out.println("La tortuga " + nombre + " ha avanzando " + avanza + " metros");
	}

	@Override
	public void run() {
		for (int k = 0; k < 35; k++) {
			if (k == 20) {
				try {
					tunel.acquire();
					System.out.println(nombre + " entro en el tunel");
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			} else if (k == 30) {
				tunel.release();
				System.out.println(nombre + " salio del tunel");
			}
			
			this.avanzar();
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
	
