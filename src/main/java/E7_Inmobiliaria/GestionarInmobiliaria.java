/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package E7_Inmobiliaria;

import java.util.Scanner;

/**
 *
 * @author JMRivera
 */
public class GestionarInmobiliaria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nombre = "Mario Romero Aguilar"; // Pon tu nombre aquí
        Inmobiliaria miInmobiliaria = new Inmobiliaria("Velázquez", "41-123456", "Feria 100", nombre, 1000.0);
        Scanner t = new Scanner(System.in);
        int op;
        int pos;
        do {
            op = menu();
            switch (op) {
                case 1 -> {
                    miInmobiliaria.verDatos();
                    System.out.println("¿Desea cambiar los datos? [s/n]");
                    String respuesta = t.nextLine();
                    switch (respuesta) {
                        case "s" -> {
                            System.out.println("Nuevo nombre:");
                            String propietario = t.nextLine();
                            miInmobiliaria.setPropietario(propietario);
                            System.out.println("Nueva direccion:");
                            String direccion = t.nextLine();
                            miInmobiliaria.setDireccion(direccion);
                        }
                        case "n" ->
                            System.out.println("OK");
                    }
                }
                case 2 -> {
                    miInmobiliaria.altaInmueble(miInmobiliaria.pedirDatos());
                }
                case 3 -> {
                    System.out.println("Que inmueble desea dar de baja");
                    pos = Integer.parseInt(t.nextLine());
                    miInmobiliaria.bajaInmueble(pos);
                }
                case 4 -> {
                    System.out.println("Alquila un nuevo inmueble");
                    pos = Integer.parseInt(t.nextLine());
                    miInmobiliaria.alquilar(pos);
                }
                case 5 -> {
                    System.out.println("Posicion");
                    pos = Integer.parseInt(t.nextLine());
                    miInmobiliaria.devolverInmueble(pos).verDatos();
                }
                case 6 -> {
                    miInmobiliaria.verDatosInmuebles();
                }

                case 7 -> {
                    miInmobiliaria.ordena_burbuja();
                    System.out.println("Ordenando...");
                }
                case 8 -> {
                    miInmobiliaria.GenerarObjetos();
                    System.out.println("Generando...");
                }
                case 9 ->{
                    System.out.println("Tipo de inmueble");
                    int tipo = Entrada.leerEntero();
                    miInmobiliaria.busqueda_objetos(tipo);
                }
                default -> {
                }
            }
            Entrada.leerCadena("Pulse intro para continuar...");
        } while (op != 0);
    }

    public static int menu() {
        int op;
        System.out.println("Menu");
        System.out.println("");
        System.out.println("1.- Ver/modificar los datos de la inmobiliaria.");
        System.out.println("2.- Dar de alta un inmueble.");
        System.out.println("3.- Dar de baja un inmueble.");
        System.out.println("4.- Alquilar un inmueble.");
        System.out.println("5.- Ver los datos de un inmueble.");
        System.out.println("6.- Ver los datos de todos los inmuebles.");
        System.out.println("0.- Salir.");
        op = Entrada.leerEntero("\nElija opción:");

        return op;
    }

}
