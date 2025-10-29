package main;

public class Main {
	
	public static void main (String [] args) {
	Caja a = new Caja();
	
	Thread marcos = new Thread(new Empleado("Marcos", a));
	Thread paco = new Thread(new Empleado("Paco", a));
	Thread juan = new Thread(new Empleado("Juan", a));
	
		marcos.start();
		paco.start();
		juan.start();
		
		try {
			marcos.join();
			paco.join();
			juan.join();
			} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("El total de la caja es: " + a.getTotal());
	}
}
