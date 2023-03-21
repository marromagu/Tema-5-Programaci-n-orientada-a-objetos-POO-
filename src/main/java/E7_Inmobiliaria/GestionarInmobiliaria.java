/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package E7_Inmobiliaria;

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
        String nombre = "José María Rivera Calvete"; // Pon tu nombre aquí
        Inmobiliaria miInmobiliaria = new Inmobiliaria("Velázquez", "41-123456", "Feria 100", nombre, 1000.0);

        int op;
        do {
            op = menu();
            switch (op) {
                case 1:

                    break;
                case 2:

                    break;
                case 3:

                    break;
                case 4:

                    break;
                case 5:

                    break;
                case 6:

                    break;
                default:
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
