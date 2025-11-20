package main;

public class Tortuga extends Animal {
	private int velocidad = 2;
	private int avanza = 0;

	public Tortuga(String nombre, Thread viento) {
		super(nombre, viento);
	}


	public int getAvanza() {
		return avanza;
	}

	@Override 
	public void avanzar() {
		if (this.avanza != 0 && this.avanza != 50 && this.avanza != 150) { //He puesto que en la entrada y salida del tunel no haya charco
			hayCharco();
		} else {
			tortugaAvanza();
		}
	}
	
	public void tortugaAvanza() {
		this.avanza = this.avanza + this.velocidad;
		if (avanza > 50 && avanza <52) {
			avanza = 50;
		} else if (avanza > 150 && avanza < 152) {
			avanza = 150;
		}
		System.out.println("La tortuga " + nombre + " ha avanzando " + this.avanza + " metros");
	}
	
	public void hayCharco() { 			
		if (this.avanza % 10 == 0) { 
			this.avanza = this.avanza + this.velocidad + 3;
			System.out.println("¡La tortuga " + nombre + " cayo en un charco y acelero, ha avanzado " + avanza + " metros!");
		} else {
			tortugaAvanza();
		}
	}
}