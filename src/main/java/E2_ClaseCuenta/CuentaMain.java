/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package E2_ClaseCuenta;

import java.util.Scanner;

/**
 *
 * @author DAM_T
 */
public class CuentaMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        Cuenta cuenta1 = new Cuenta();
        Cuenta cuenta2 = new Cuenta("Diego Rodríguez de Silva y Velázquez","1234567890",1.25,500);
        
        System.out.println("Nombre de la cuenta:");
        cuenta1.setNombre(leer.nextLine());
        System.out.println("Numero de cuenta:");
        cuenta1.setnCuenta(leer.nextLine());
        System.out.println("Tipo de interes:");
        cuenta1.setInteres(leer.nextDouble());
        System.out.println("Saldo:");
        cuenta1.setSaldo(leer.nextDouble());
        System.out.println(cuenta1.toString());
        System.out.println(cuenta2.toString());
        Cuenta cuenta3 = new Cuenta(cuenta1);
        System.out.println(cuenta3.toString());
        System.out.println("");
        cuenta3.transferencia(cuenta2, 10);
        System.out.println("Saldo: "+ cuenta3.getSaldo());
        System.out.println("Saldo: "+cuenta2.getSaldo());
       
        cuenta1.ingreso(100);
        System.out.println(cuenta1.getSaldo());
        cuenta1.reintegro(50);
        System.out.println(cuenta1.getSaldo());

        
        
    }
    
}
