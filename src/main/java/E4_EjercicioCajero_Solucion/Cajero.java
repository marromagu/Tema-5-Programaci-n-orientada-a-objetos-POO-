/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package E4_EjercicioCajero_Solucion;

import java.util.Scanner;

/**
 *
 * @author jmrivera
 */
public class Cajero {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // referencia a la clase Cliente
        Cliente unCliente;
        // Variables locales
        char modificar;
        int opcion;
        String dni;
        double importe;
        int password;
        // Construción de los objetos
        Scanner teclado = new Scanner(System.in);
        unCliente = new Cliente("12345678",1100,15000);
        // Bucle del programa
        do{
            opcion = menu();
            switch(opcion){
                case 1:
                    unCliente.mostrarDatos();
                    System.out.println("¿Quiere modificar los datos? (s/n):");
                    try{
                        modificar = teclado.nextLine().charAt(0);
                    }catch(Exception e){
                        modificar = 'n';
                    }
                    if (modificar == 's'){
                        System.out.println("Nuevo DNI:");
                        dni = teclado.nextLine();
                        unCliente.setDni(dni);
                        System.out.println("Nuevo salario:");
                        try{
                            importe = Double.parseDouble(teclado.nextLine());
                            unCliente.setSueldo(importe);
                        }
                        catch(NumberFormatException e){
                            // No hacemos nada
                            // Si ha fallado la entrada de datos
                            // no se cambia el salario
                        }
                    }
                    break;
                case 2:
                    if (unCliente.ingresarNómina()){
                        System.out.println("Nómina ingresada en cuenta.");
                    }else{
                        System.out.println("No se ha podido ingresar la nómina en cuenta.");
                    }
                    break;
                case 3:
                    System.out.println("Introduzca contraseña:");
                    try{
                        password = Integer.parseInt(teclado.nextLine());
                        unCliente.getCuentaCliente().mostrarDatos(password);
                    }
                    catch(NumberFormatException e){
                        System.out.println("Error introduciendo contraseña.");
                    }
                    break;
                case 4:
                    System.out.println("Introduzca contraseña:");
                    try{
                        password = Integer.parseInt(teclado.nextLine());
                        unCliente.sacarDinero(password);
                    }
                    catch(NumberFormatException e){
                        System.out.println("Error introduciendo contraseña.");
                    }
                    break;
                case 5:
                    unCliente.getCuentaCliente().modificarContraseña();
                    break;
                default:
                    // No hacemos nada
            }
            if (opcion != 6){
                esperar();
            }
        }while (opcion != 6);
    }
    /**
     * Método que muestra el menú y devuelve la opción elegida por el usuario
     * @return 
     */
    public static int menu(){
        Scanner teclado = new Scanner(System.in);
        int opcion;
        System.out.println("CAJERO AUTOMÁTICO");
        System.out.println("-----------------");
        System.out.println("1. Consultar/Modificar Datos personales");
        System.out.println("2. Ingresar Nomina");
        System.out.println("3. Consultar Datos Bancarios");
        System.out.println("4. Sacar Dinero");
        System.out.println("5. Modificar Contraseña");
        System.out.println("6. Salir");
        System.out.print("\n¿Opción?: ");
        try{
            opcion = Integer.parseInt(teclado.nextLine());
        }
        catch(NumberFormatException e){
            opcion = 100;
        }
        return opcion;
    }
    /**
     * Método que espera pulsar intro para continuar
     */
     public static void esperar(){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Pulse intro para continuar...");
        teclado.nextLine();
    }   
    
}
