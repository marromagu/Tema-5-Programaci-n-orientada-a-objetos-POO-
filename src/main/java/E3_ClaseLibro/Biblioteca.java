/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package E3_ClaseLibro;

import java.util.Scanner;

/**
 *
 * @author DAM_T
 */
public class Biblioteca {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner t = new Scanner(System.in);
        Libro libro1 = new Libro("El quijote", "Cervantes", 1, 0);
        Libro libro2 = new Libro();
        System.out.println("Tirtulo del libro:");
        libro2.setTitulo(t.nextLine());
        System.out.println("Autor del libro:");
        libro2.setAutor(t.nextLine());
        System.out.println("Ejemplares del libro:");
        libro2.setnEjemplares(t.nextInt());
        System.out.println("Ejemplares prestados del libro");
        libro2.setnPrestados(t.nextInt());
        System.out.println(libro1.toString());
        libro1.prestamos();
        libro1.devolucion();
        libro1.prestamos();
        if (!libro1.prestamos()) {
            System.out.println("|||||||||||||||||||||||||||||||||||");
            System.out.println("No quedan ejemplares del libro…");
            System.out.println("|||||||||||||||||||||||||||||||||||");

        }
        System.out.println(libro1.toString());
        System.out.println(libro2.toString());

    }

}
