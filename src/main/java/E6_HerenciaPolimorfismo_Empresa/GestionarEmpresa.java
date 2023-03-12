/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package E6_HerenciaPolimorfismo_Empresa;

import java.util.Scanner;

/**
 *
 * @author mario
 */
public class GestionarEmpresa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Empresa empresa = new Empresa("Mario S.A", "ABC123", 500);
        Scanner teclado = new Scanner(System.in);

        int op;
        do {
            op = menu(teclado);
            switch (op) {
                case 1:
                    System.out.println(empresa.getNombreEmpresa());
                    System.out.println(empresa.getCif());
                    System.out.println(empresa.getCuentaEmpresa().getSaldo());
                    System.out.println("Desea cambiar los datos del Nombre y el CIF");
                    String respuesta = teclado.nextLine();
                    switch (respuesta) {
                        case "s":
                            System.out.println("Nuevo nombre");
                            respuesta = teclado.nextLine();
                            empresa.setNombreEmpresa(respuesta);
                            System.out.println("Nueva CIF");
                            respuesta = teclado.nextLine();
                            empresa.setCif(respuesta);
                            break;
                        case "n":
                            System.out.println("OK");
                            break;
                    }
                    break;
                case 2:
                    //Empleados empleado = new Empleados();
                   //empresa.contratar();
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;

                default://Nada que hacer
            }
            if (op != 0) {
                System.out.println("\nPelse intro para continuar...");
                teclado.nextLine();
            } else {
                System.out.println("\nFin del programa.");
            }
        } while (op != 0);

    }

    public static int menu(Scanner a) {
        System.out.println(" GESTION EMPRESA");
        System.out.println("---------------------");
        System.out.println();
        System.out.println("1. Ver/modificar los datos de la empresa.");
        System.out.println("2. Contratar a un empleado.");
        System.out.println("3. Ver los datos de un empleado.");
        System.out.println("4. Ver los datos de todos los empleado.");
        System.out.println("5. Pagar todas las nóminas.");
        System.out.println("6. Ingresar en la cuenta de la empresa.");
        System.out.println();
        System.out.print("Introduzca opción: ");
        int op = Integer.parseInt(a.nextLine());
        System.out.println();
        return op;
    }

}
