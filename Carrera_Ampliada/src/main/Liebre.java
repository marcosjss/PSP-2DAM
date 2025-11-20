package main;

public class Liebre extends Animal{

	private int velocidad = 5;
	private int avanza = 0;
	private int liebreVaga = 0;
	private int segundosQuieta;
	private int caeSuelo = 5;
	private boolean charco = false;
	
	public Liebre(String nombre, Thread viento) {
		super(nombre, viento);	
	}
	
	
	public int getAvanza() {
		return avanza;
	}
	
	@Override
	public void avanzar() {
		if (Viento.isHayViento() == true && liebreVaga == 4) {
			liebreVaga = 0;
			System.out.println("¡La liebre " + nombre + " se desperto gracias al viento!");
        	liebreAvanza();
			
		} else {
			if (liebreVaga != 4) {
	            pisaCharco();
	    			
			} else if (liebreVaga == 4) {
				liebreDuerme();
			}
		}
	}	
		
	public void liebreAvanza() {
    	this.avanza = this.avanza + this.velocidad;
		System.out.println("La liebre " + nombre + " ha avanzando " + this.avanza + " metros, se dormira en " + (4 - liebreVaga) + " segundos");
		liebreVaga ++;
		segundosQuieta = 10;
	}
	
	public void liebreDuerme() {
		System.out.println("¡La liebre " + nombre + " se ha dormido y no avanzara hasta dentro de " + segundosQuieta + " segundos!");
		segundosQuieta --;
		
		if (segundosQuieta == 0) {
			liebreVaga = 0;
		}
	}

	public void hayCharco() {
		if (this.avanza != 0 && this.avanza != 50 && this.avanza != 150) { //He puesto que en la entrada y salida del tunel no haya charco
			if (charco == false) {
				if (this.avanza % 10 == 0) { 
					charco = true;
					caeSuelo = 5;
				}
			}
		}
	}
	
	public void pisaCharco() {
		hayCharco();
    	if (charco == false) {
    		liebreAvanza();
    	} else if (charco = true) {
			if (caeSuelo == 0) {
				charco = false;
				liebreAvanza();
			} else {
				System.out.println("¡La liebre " + nombre + " cayo en un charco y resbalo, se levantara en " + caeSuelo + " segundos!");
				caeSuelo--;
			}
    	}	
    }
}
	
