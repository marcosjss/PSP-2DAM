package main;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main (String[] args) {
				Scanner sc = new Scanner(System.in);
				
				ArrayList<Perro> dog = new ArrayList<>();
				ArrayList<Gato> cat = new ArrayList<>();
				
				String nombre;
				int edad;
				int longitudBigotes;
				String raza;
				
				int x = 3;
				
					while (x != 0) {
						System.out.println ("0.Salir, 1.Añadir animal, 2.Mostar todos los datos");
						
						x = sc.nextInt();
						
							if (x == 1) {
								System.out.println ("1.Añadir gato, 2.Añadir perro"); {
									int y = sc.nextInt();
									if (y == 1) {
										System.out.println ("Introduce un nombre");
											nombre = sc.next();
										System.out.println ("Introduce la edad");
											edad = sc.nextInt();
										System.out.println ("Introduce la longitud de los bigotes");
											longitudBigotes = sc.nextInt();
											Gato gato = new Gato(nombre, edad, longitudBigotes);
											cat.add(gato);
									} else if (y == 2) {
										System.out.println ("Introduce un nombre");
											nombre = sc.next();
										System.out.println ("Introduce la edad");
											edad = sc.nextInt();
										System.out.println ("Introduce la raza");
											raza = sc.next();
											Perro perro = new Perro(nombre, edad, raza);
											dog.add(perro);
									}
										
								}
									
							} else if (x == 2) {
								System.out.println("1.Mostrar gatos, 2.Mostrar perros");
									int z = sc.nextInt();
										if (z == 1) {
											for(int i= 0; i<cat.size(); i++) {
												System.out.println(cat.get(i));
											}
										} else if (z == 2) {
											for(int i= 0; i<dog.size(); i++) {
												System.out.println(dog.get(i));
											}
										}				
							}else if ( x == 0) {
								return;
							}
											
					}
	}
					
}
