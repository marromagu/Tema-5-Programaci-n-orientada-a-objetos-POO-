/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package E4_EjercicioCajero_Solucion;

import java.util.Scanner;

/**
 *
 * @author jmrivera
 */
public class Cliente {
    private String dni;
    private double sueldo;
    private Cuenta cuentaCliente;

    public Cliente(String dni, double sueldo, double saldo) {
        this.dni = dni;
        this.sueldo = sueldo;
        this.cuentaCliente = new Cuenta(dni,saldo,Integer.parseInt(dni));
    }
    
    public Cliente() {
        this.dni = "";
        this.sueldo = 0.0;
        this.cuentaCliente = new Cuenta();
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        try{
            Integer.parseInt(dni);
            this.dni = dni;
        }
        catch(NumberFormatException e){
        }
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        if (sueldo > 0){
            this.sueldo = sueldo;
        }
    }

    public Cuenta getCuentaCliente() {
        return cuentaCliente;
    }
    /**
     * Ingresa el importe del salario en la cuenta
     * @return 
     */
    public boolean ingresarNómina(){
        return cuentaCliente.ingreso(sueldo);
    }
    /**
     * 
     * @param contraseña 
     */
    public void sacarDinero(int contraseña){
        if (cuentaCliente.validarContraseña(contraseña)){
            System.out.println("Introduzca la cantidad a retirar: ");
            Scanner teclado = new Scanner(System.in);
            try{
                double reintegro = Double.parseDouble(teclado.nextLine());
                if(!cuentaCliente.reintegro(reintegro)){
                    System.out.println("No se pudo hacer la operación.");
                }else{
                  System.out.println("Operación realizada correctamente.");
                }
            }
            catch(NumberFormatException e){
                System.out.println("Error introduciendo importe.");
            }
        }
            
    }
    /**
     * 
     */
    public void mostrarDatos(){
        System.out.println("DNI: "+dni);
        System.out.println("Salario: "+sueldo);
    }

}
