/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejempos;

import java.util.Scanner;

/**
 *
 * @author JMRivera
 */
public class PruebaCoche {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // TODO code application logic here
    Scanner teclado = new Scanner(System.in);
    Coche c1 = new Coche();
		Coche c2 = new Coche("2222AAA","MERCEDES","BLANCO",540,20,10,2);
		
		Coche[] vector = new Coche[5];
		
		for(int i = 0; i < 3; i++){
			vector[i] = new Coche();
    }  
		
		vector[3] = new Coche(c2); // Constructor copia
		vector[4] = new Coche("4444CCC","SEAT","ROJO",13540,12,6,5);
		
		for(int i = 0; i < vector.length; i++){
			System.out.println("Las matriculas son: " + vector[i].getMatricula());
    }
		// Cambiando el color
		System.out.println("\nEl color del coche 1 es: "+c1.getColor());
		c1.setColor("caca"); // ignora este color
		System.out.println("Ahora el color del coche 1 es: "+c1.getColor());
		// Cambiando la matricula
		System.out.println("\nLa matrícula del coche 2 es: "+c2.getMatricula());
    c2.setMatricula("5555bbb");
		System.out.println("Ahora la matrícula del coche 2 es: "+c2.getMatricula());
    
		// Variable de clase
    // Accediendo a través de la clase
		System.out.println("\nEl número de coches es: "+Coche.getNumeroCoches());
		Coche.setNumeroCoches(5);
    // Accediendo a través de un objeto
		System.out.println("Ahora el número de coches es: "+c1.getNumeroCoches());
    // Vámonos de viaje
    do{
      System.out.println("\nEl coche tiene "+c2.getKilometraje()+" kilometros"
          +" y "+c2.getCantidadGasolina()+" de gasolina");
      System.out.println("¿Cuántos kms quieres hacer?");
      int kms = Integer.parseInt(teclado.nextLine());
      if(c2.hacerViaje(kms)==true){
        System.out.println("El viaje de "+kms+" kms se ha realizado");
      }else{
        System.out.println("No hay gasolina para "+kms+" kms");
      }
      System.out.println(c2.toString());
    }while(!c2.enReserva());
    
    System.out.println("\nEl coche está en reserva");
		String nuevaCad=c2.devuelveMatriculaFormat();
		System.out.println("Coche c2: "+nuevaCad);
  }
  
}
