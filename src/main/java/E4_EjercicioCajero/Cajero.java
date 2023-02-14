/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package E4_EjercicioCajero;

import java.util.Scanner;

/**
 *
 * @author DAM_T
 */
public class Cajero {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Cliente cliente = new Cliente("12345678", 1100, 15000);
        Scanner teclado = new Scanner(System.in);

        int op;
        do {
            op = menu(teclado);
            switch (op) {
                case 1:
                    consultarModificarPersonales(teclado, cliente);
                    break;
                case 2:
                    //  ingresarNomina(teclado);
                    break;
                case 3:
                    //  consultarDB(teclado);
                    break;
                case 4:
                    //  SacarDinero(teclado);
                    break;
                case 5:
                    //  ModificarContraseña(teclado);
                    break;
                default://Nada que hacer
            }
            if (op != 0) {
                System.out.println("\nPelse intro para continuar...");
                teclado.nextLine();
            } else {
                System.out.println("\nFin del programa.");
            }
        } while (op != 6);
    }

    public static int menu(Scanner a) {
        System.out.println(" CAJERO AUTOMÁTICO");
        System.out.println("---------------------");
        System.out.println();
        System.out.println("1. Consultar/Modificar Datos personales");
        System.out.println("2. Ingresar Nomina");
        System.out.println("3. Consultar Datos Bancarios");
        System.out.println("4. Sacar Dinero");
        System.out.println("5. Modificar Contraseña");
        System.out.println("6. Salir");
        System.out.println();
        System.out.print("Introduzca opción: ");
        int op = Integer.parseInt(a.nextLine());
        System.out.println();
        return op;
    }

    public static void consultarModificarPersonales(Scanner t, Cliente cli) {
        cli.mostrarDatos();
        System.out.println("Desea modificar los datos S/N");
        String respuesta = t.nextLine();
        if (respuesta == "S") {
            System.out.println("Nuevo DNI: ");
            cli.setDNI(t.nextLine());
            System.out.println("Nuevo Sueldo: ");
            cli.setSalario(t.nextInt());
        }
    }
    public static void ingresarNomina(Cliente cli){
       // cli.cuenta.setSaldo() += cli.setSalario();
    }
}
