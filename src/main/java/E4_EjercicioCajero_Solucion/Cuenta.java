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
public class Cuenta {
    private String Cuenta;
    private double saldo;
    private int contraseña;

    public Cuenta(String Cuenta, double saldo, int contraseña) {
        this.Cuenta = Cuenta;
        this.saldo = saldo;
        this.contraseña = contraseña;
    }
    
    public Cuenta() {
        this.Cuenta = "";
        this.saldo = 0.0;
        this.contraseña = 0;
    }

    public String getCuenta() {
        return Cuenta;
    }

    public double getSaldo() {
        return saldo;
    }
    /**
     * Realiza un ingreso en la cuenta por la cantidad indicada 
     * si es mayor que 0
     * 
     * @param cantidad a ingresar 
     * @return devuelve true si la operación se ha podido realizar 
     * o false en caso contrario
     */
    protected boolean ingreso(double cantidad){
        boolean operacionRealizada = false;
        if (cantidad > 0){
            saldo += cantidad;
            operacionRealizada = true;
        }
        return operacionRealizada;
    }
    
    /**
     * Realiza un reintegro en la cuenta por la cantidad indicada 
     * si es mayor que 0 y hay saldo suficiente
     * 
     * @param cantidad a ingresar 
     * @return devuelve true si la operación se ha podido realizar 
     * o false en caso contrario
     */
    protected boolean reintegro(double cantidad){
        boolean operacionRealizada = false;
        if (cantidad > 0 && saldo >= cantidad){
            saldo -= cantidad;
            operacionRealizada = true;
        }
        return operacionRealizada;
    }
    /**
     * 
     * @return 
     */    
    private int generarContraseña(){
        return (int) (Math.random()*9000 + 1000);
    }
    /**
     * 
     */
    protected void modificarContraseña(){
        Scanner teclado = new Scanner(System.in);
        int password;
        System.out.println("Contraseña actual: ");
        password = Integer.parseInt(teclado.nextLine());
        if (validarContraseña(password)) {
            this.contraseña = generarContraseña();
            System.out.println("Nueva contraseña: "+this.contraseña);
        } else {
            System.out.println("Error al introducir la contraseña.");
        }
    }
    /**
     * 
     * @param contraseña
     * @return 
     */
    protected boolean validarContraseña(int contraseña){
        return contraseña == this.contraseña;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Cuenta{Cuenta=").append(Cuenta);
        sb.append(", saldo=").append(saldo);
        sb.append(", contrase\u00f1a=").append(contraseña);
        sb.append('}');
        return sb.toString();
    }
   /**
    * 
    * @param contraseña 
    */ 
    public void mostrarDatos(int contraseña){
        if (validarContraseña(contraseña)){
            System.out.println("Cuenta: "+this.Cuenta);
            System.out.println("Saldo: "+this.saldo);
            System.out.println("Contraseña: "+this.contraseña);
        } else {
            System.out.println("Error al introducir la contraseña.");
        }
    }
}
