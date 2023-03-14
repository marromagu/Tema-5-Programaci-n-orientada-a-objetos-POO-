/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package E6_HerenciaPolimorfismo_Empresa;

import java.util.Random;
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
        Empresa empresa = new Empresa("Mario S.A", "ABC123", 999999);
        Scanner teclado = new Scanner(System.in);
        String respuesta;
        int op;
        do {
            op = menu(teclado);
            switch (op) {
                case 1:
                    System.out.println(empresa.getNombreEmpresa());
                    System.out.println(empresa.getCif());
                    System.out.println(empresa.getCuentaEmpresa().getSaldo());
                    System.out.println("Desea cambiar los datos del Nombre y el CIF ( s / n )");
                    respuesta = teclado.nextLine();
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
                    System.out.println("¿Generar Empleados automaticamente?");
                    respuesta = teclado.nextLine();
                    if (respuesta == "s") {
                        //randomEmpleados();
                    } else {
                        System.out.println("¿Que empleado desea contratar?(Programador[p] / Gerente[g])");
                        respuesta = teclado.nextLine();
                        System.out.println("Nombe del Empleado");
                        String nombe = teclado.nextLine();
                        System.out.println("DNI del Empleado");
                        String dni = teclado.nextLine();
                        System.out.println("Su Salario");
                        double salario = teclado.nextDouble();

                        switch (respuesta) {
                            case "p":
                                System.out.println("Horas extras del Programador");
                                int horasExtras = teclado.nextInt();
                                Programador empleadoP = new Programador(horasExtras, nombe, dni, salario);
                                empresa.contratar(empleadoP);
                                break;
                            case "g":
                                System.out.println("Comisiones del Gerente");
                                double comisiones = teclado.nextDouble();
                                System.out.println("Proyectos del Gerente");
                                int proyecto = teclado.nextInt();
                                Gerente empleadoG = new Gerente(comisiones, proyecto, nombe, dni, salario);
                                empresa.contratar(empleadoG);
                                break;
                        }
                    }
                    break;
                case 3:
                    System.out.println("Dime el numero del Empleado que deseas ver( '0' para el primero.)");
                    int posicion = teclado.nextInt();
                    Empleados miEmpleado = empresa.devolverEmpleado(posicion);
                    miEmpleado.datosEmpleados();
                    break;
                case 4:
                    empresa.listarEmpleados();
                    break;
                case 5:
                    for (int i = 0; i < empresa.getNumeroEmpleados(); i++) {
                        empresa.pagarNomina(i);
                        if (empresa.pagarNomina(i)) {
                            System.out.println("Pago realizado...");

                        }

                    }

                    break;
                case 6:
                    System.out.println("¿Cuanto dinero desea ingresar en la cuenta de la empresa?");
                    double dinero = teclado.nextDouble();
                    empresa.getCuentaEmpresa().ingreso(dinero);
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

    public void randomEmpleados(Empresa empresa) {
        String nombres[] = {"Mario", "Laura", "Jose", "Pablo", "Paula"};
        for (int i = 0; i < 20; i++) {
            int r = (int) (Math.random() * 5);
            String nombe = nombres[r];
            String dni = "000" + (i + 1) + nombres[r].charAt(1);
            double salario = (double) (Math.random() * 2000);
            if (r % 2 != 0) {
                int horasExtras = (int) (Math.random() * 10);
                Programador empleadoP = new Programador(horasExtras, nombe, dni, salario);
                empresa.contratar(empleadoP);
                System.out.println("Empleado Creado." + (i + 1));
            } else {
                double comisiones = (double) (Math.random() * 1000);
                int proyecto = (int) (Math.random() * 10);
                Gerente empleadoG = new Gerente(comisiones, proyecto, nombe, dni, salario);
                empresa.contratar(empleadoG);
                System.out.println("Empleado Creado." + (i + 1));
            }

        }
    }

}
