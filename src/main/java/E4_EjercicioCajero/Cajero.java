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
                    System.out.println("Saldo: " + cliente.cuenta.getSaldo());
                    cliente.ingresarNómina();
                    System.out.println("Nuevo saldo: " + cliente.cuenta.getSaldo());
                    break;
                case 3:
                    System.out.println("Contraseña:");
                    int datosC = teclado.nextInt();
                    if (cliente.cuenta.validarContraseña(datosC)) {
                        System.out.println(cliente.mostrarDatos());
                    }else{
                        System.out.println("Contraseña erronea");
                    }
                    break;
                case 4:
                    System.out.println("Contraseña:");
                    int dinero = teclado.nextInt();
                    System.out.println(cliente.sacarDinero(dinero));
                    break;
                case 5:
                    System.out.println("Contraseña:");
                    int contraseña = teclado.nextInt();
                    cliente.cuenta.modificarContraseña(contraseña);
                    System.out.println("Su nueva contraseña es: " + cliente.cuenta.getContraseña());
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
        System.out.println(cli.mostrarDatos());
        System.out.println("Desea modificar los datos S/N");
        String respuesta = t.nextLine();
        switch (respuesta) {
            case "S":
                System.out.println("Nuevo DNI");
                cli.setDNI(t.nextLine());
                System.out.println("Nuevo salario");
                double salario = t.nextDouble();
                cli.setSalario(salario);
                System.out.println(cli.mostrarDatos());
                System.out.println("Salario: " + cli.getSalario());
                break;
            case "N":
                System.out.println("OK");
                break;
            default://Nada que hacer
            }
    }
}
