package main;

public class Animal {

		public int edad;
		public String nombre;
		
		Animal (String nombre, int edad) {
			this.nombre=nombre;
			this.edad = edad;
		}

		public void mostrarDatos () {
			System.out.println("Se llama " + nombre + ", tiene " + edad + " años");
		}
		

		@Override
		public String toString() {
			return "Se llama " + nombre + ", tiene " + edad + " años";
		}
		
}