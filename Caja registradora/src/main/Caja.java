package main;

public class Caja {

	private double total = 0;
	
	
	public synchronized void cobrar(String nombreEmpleado, double cantidad) {
		total = total + cantidad;

		System.out.println("Empleado " + nombreEmpleado + " cobro " + cantidad + " €. Total en caja: " + getTotal() + " €");
		
	}


	public double getTotal() {
		return Math.round(total * 100.0) / 100.0;
	}
}
