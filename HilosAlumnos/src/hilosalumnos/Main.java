package hilosalumnos;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String nombre;
		
		System.out.println("Introduce el primer nombre");
		nombre = sc.nextLine();
		Thread a = new Thread(new Alumno(nombre));

		System.out.println("Introduce el segundo nombre");
		nombre = sc.nextLine();
		Thread b = new Thread(new Alumno(nombre));

		System.out.println("Introduce el tercer nombre");
		nombre = sc.nextLine();
		Thread c = new Thread(new Alumno(nombre));
		
		
		try {
			a.start();
			a.join();
			
			b.start();
			b.join();
			
			c.start();
			c.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}