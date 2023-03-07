/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejemplos_EmpleadoAmpliado;

/**
 *
 * @author jmrivera
 */
public class TestEmpleados {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Empleado [] empleados = new Empleado[5];
        empleados[0] = new Empleado("Paco");
        empleados[1] = new Operario("Pepe", 10);
        empleados[2] = new Directivo("Marco");
        empleados[3] = new Oficial("Jero", 20);
        empleados[4] = new Tecnico("Manu", 30);
        for (int i = 0; i<5; i++){
            System.out.println(empleados[i].toString()+" "+empleados[i].calculaSalario());
        }
    }
    
}
