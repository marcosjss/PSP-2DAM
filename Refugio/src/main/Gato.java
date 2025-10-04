package main;

public class Gato extends Animal{
	
		public int longitudBigotes;
		
		Gato(String nombre, int edad, int longitudBigotes) {
			super(nombre, edad);
			this.longitudBigotes=longitudBigotes;	
		}
		
		public void maullar () {
			System.out.println("Miau miau");
		}
		
		@Override
		public String toString() {
			return super.toString() + " y tiene bigotes de " + longitudBigotes + " cm";
		}
		
}