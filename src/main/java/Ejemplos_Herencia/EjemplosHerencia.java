/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejemplos_Herencia;

/**
 *
 * @author JMRivera
 */
public class EjemplosHerencia {

  /**
   * @param args the command line arguments
   */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Punto p1 = new Punto(3,2);
		Punto2DFormato p2 = new Punto2DFormato(1,1,"otroPunto");
		Punto3D p3 = new Punto3D(1,1,7);
		Punto4D p4 = new Punto4D(6,5,3,2.1f);
    
		System.out.println("\nMostrando p1 ");
		p1.muestraPunto();
		
		System.out.println("\nMostrando p2 ");
		p2.muestraPunto();
		
		System.out.println("\nMostrando p3 ");
		p3.muestraPunto();
		
		System.out.println("\nMostrando p4 ");
		p4.muestraPunto();
    
		System.out.println("POLIMORFISMO");
		Punto[] vectorPuntos = new Punto[5];
		vectorPuntos[0] = new Punto2DFormato(1,2,"punto2D");
		vectorPuntos[1] = new Punto3D(4,5,9);
		vectorPuntos[2] = new Punto(6,7);
		vectorPuntos[3] = new Punto4D(0,-3,1,1.02f);
		vectorPuntos[4] = new Punto3D(2,2,-1);
		
		for(int i=0; i<vectorPuntos.length;i++)
		{
			System.out.println("\nMostrando vectorPuntos["+i+"]:");
			if(vectorPuntos[i] instanceof Punto4D){
				System.out.println("Añadiendo tiempo al objeto 4D");
				((Punto4D)vectorPuntos[i]).sumaTiempo(2.31f);
			}
			vectorPuntos[i].muestraPunto();
		}
				
	}
  
}
