package main;

public class Empleado implements Runnable {

	
	private String nombreEmpleado;
	private Caja cajaCompartida;
	
	
	public Empleado(String nombreEmpleado, Caja cajaCompartida) {
		this.nombreEmpleado = nombreEmpleado;
		this.cajaCompartida = cajaCompartida;
	}




	@Override
	public void run() {
		// TODO Auto-generated method stub
		synchronized (this) {
			for (int k = 1; k <= 5; k++) {
				
				double importeAleatorio = Math.round((Math.random() * (100 - 5 + 1) + 5) * 100.0) / 100.0;
				
				cajaCompartida.cobrar(nombreEmpleado, importeAleatorio);
				
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
}
