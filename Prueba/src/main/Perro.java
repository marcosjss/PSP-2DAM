package main;

public class Perro extends Animal{
		
		public String raza;
		
		Perro(String nombre, int edad, String raza) {
			super(nombre, edad);
			this.raza = raza;
		}
	
		public void ladrar () {
			System.out.println("Guau guau");
		}
		
		@Override
		public String toString() {
			return super.toString() + " y es de raza " + raza;
		}

}
