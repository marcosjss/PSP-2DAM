package hilosalumnos;

public class Alumno implements Runnable {
	
	String  mensaje;

	public Alumno (String nombre) {
		if (nombre.toLowerCase().equals("pepito")) {
			this.mensaje = "Mira que ser yo " + nombre.toLowerCase() + "... pues me cierro";
		} else {
			this.mensaje = "Hola soy " + nombre + " y este es mi mensaje numero: ";
		}
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		 for (int i = 1; i <= 5; i++) {
			 if (this.mensaje.equals("Mira que ser yo Pepito... pues me cierro")) {
				 System.out.println(mensaje);
				 return;
			 
			 } else {
				 System.out.println(mensaje + i);
			
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			 }
			}
		 }
	}

	public String getMensaje() {
		return mensaje;
	}

}


