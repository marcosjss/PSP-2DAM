package main;

public class Carrera implements Runnable{

	public Tunel tunel;
	public Animal animal;
	public int contador = 0;
	public static int sleep = 500; //Cambia el Thread.sleep de esta clase y de Viento tambien, para solo tener que cambiar un valor
	
	public Carrera(Tunel tunel, Animal animal) {
		this.tunel = tunel;
		this.animal = animal;
	}

	@Override
	public void run() {
		for (int k = 0; k < 1000; k++) {
			animal.avanzar();
			
			if (animal.getAvanza() >= 300) {
				System.out.println(animal.getNombre() + " ¡llego a la meta!");
				//return;
				System.exit(0);
			}
		
			if (animal.getAvanza() == 50) {
				try {
					tunel.ticketEntrada();
					System.out.println("**** " + animal.getNombre() + " entro en el tunel ****");
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			} else if (animal.getAvanza() == 150) {
				tunel.dejarTicket();
				System.out.println("**** " + animal.getNombre() + " salio del tunel ****");
			}
			
			try {
				Thread.sleep(sleep);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}