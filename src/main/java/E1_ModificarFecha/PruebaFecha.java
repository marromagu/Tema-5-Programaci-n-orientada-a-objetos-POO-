/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package E1_ModificarFecha;

import java.util.Scanner;

/**
 *
 * @author JMRivera
 */
public class PruebaFecha {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        Fecha f1, f2;
        f1 = new Fecha();
        f2 = new Fecha(2, 6, 1965);
        System.out.println("Fecha1: " + f1 + (f1.comprobarFecha() ? " válida" : " errónea"));
        System.out.println("Fecha2: " + f2 + (f2.comprobarFecha() ? " válida" : " errónea"));
        System.out.println("Introduzca una fecha:");
        do {
            System.out.print("Día:");
            f1.setDia(Integer.parseInt(teclado.nextLine()));
            System.out.print("Mes:");
            f1.setMes(Integer.parseInt(teclado.nextLine()));
            System.out.print("Año:");
            f1.setAnnio(Integer.parseInt(teclado.nextLine()));
            System.out.println("Fecha1: " + f1 + (f1.comprobarFecha() ? " válida" : " errónea"));
        } while (!f1.esBisiesto(f1.getAnnio()));//Hasta q el año sea Bisiesto.
        f1.diaSiguiente();
        f2.diaSiguiente();
        System.out.println("Fecha1: " + f1 + (f1.comprobarFecha() ? " válida" : " errónea"));
        System.out.println("Fecha2: " + f2 + (f2.comprobarFecha() ? " válida" : " errónea"));

    }

}
