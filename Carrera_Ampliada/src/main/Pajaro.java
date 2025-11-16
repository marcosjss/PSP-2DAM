package main;

public class Pajaro extends Animal {
	private int velocidad = 3;
	private int avanza = 0;
	int volarRandom;
	public boolean pajaroTunel = false;
	

	public Pajaro(String nombre) {
		super(nombre);
	}


	public int getAvanza() {
		return avanza;
	}

	@Override
	public void avanzar() {
		pajaroEnTunel();
		
		volar();
				
		if (velocidad == 3) {
			this.avanza = this.avanza + this.velocidad;
				System.out.println("El pajaro " + nombre + " ha avanzando " + this.avanza + " metros");
				
		} else if (velocidad == 10) {
			
			this.avanza = this.avanza + this.velocidad;
				System.out.println("El pajaro " + nombre + " hecho a volar y avanzo hasta los " + this.avanza + " metros");
		} else if (velocidad == -10) {
			
			this.avanza = this.avanza + this.velocidad; //esta parte hasta el siguiente comentario no se si estara bien planteado pero no se me ocurrio como hacerlo
				if (avanza >= 40 && avanza < 60) {
					avanza += 10;
					System.out.println("El pajaro " + nombre + " no puede retroceder tan cerca de la entrada del tunel! esta vez no retrocedera!");
				} else if ( avanza >= 140 && avanza < 160) {
					avanza += 10;
					System.out.println("El pajaro " + nombre + " no puede retroceder tan cerca de la salida del tunel! esta vez no retrocedera!");
				}
			
			System.out.println("Oh no, tu pajaro " + nombre + " esta tan confuso que volo hacia atras y retrocedio hasta los " + this.avanza + " metros");

		
			if (pajaroTunel = true) {
				if (avanza > 40 && avanza < 50) {
					avanza = 50;
					System.out.println("El pajaro " + nombre + " hecho a volar y avanzo hasta los " + this.avanza + " metros");
					pajaroTunel = false;
				} else if (avanza > 140 && avanza < 150) {
					avanza = 150;
					System.out.println("El pajaro " + nombre + " hecho a volar y avanzo hasta los " + this.avanza + " metros"); 
					pajaroTunel = false; //hasta aqui
				}
	
			}
		}
	}
	
	public void /*boolean*/ volar() {
		int volarRandom = (int) (Math.random()*10 + 1);
		if (volarRandom > 7) {
			this.velocidad = 10;
		} else if (volarRandom < 3) {
			this.velocidad = -10;
		} else {
			this.velocidad = 3;
		}
	}
	
	public boolean pajaroEnTunel() {
		if (avanza > 40 && avanza < 50) {
			pajaroTunel = true;
		} else if (avanza > 140 && avanza < 150) {
			pajaroTunel = true;
		}
		return false;
	}
}