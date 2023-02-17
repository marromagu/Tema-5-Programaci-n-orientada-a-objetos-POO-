/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package E4_EjercicioCajero;

/**
 *
 * @author DAM_T
 */
public class Cuenta {

    private String cuenta;
    private double saldo;
    private int contraseña;

    public Cuenta(String cuenta, double saldo, int contraseña) {
        //constructor por defecto
        this.cuenta = cuenta;
        this.saldo = saldo;
        this.contraseña = contraseña;
    }

    public Cuenta() {
        //constructor por parámetros
        this.cuenta = "";
        this.saldo = 0;
        this.contraseña = 0;
    }

    public String getCuenta() {
        return cuenta;
    }

    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo += saldo;
    }

    public int getContraseña() {
        return contraseña;
    }

    public void setContraseña(int contraseña) {
        this.contraseña = contraseña;
    }

    public boolean ingreso(double ingreso) {
        boolean operacion = false;
        if (ingreso > 0) {
            this.saldo += ingreso;
            operacion = true;
        } else {
            operacion = false;
        }
        return operacion;
    }

    public boolean reintegro(double reintegro) {
        boolean operacion = false;
        if (this.saldo >= 0) {
            if (reintegro > 0) {
                this.saldo -= reintegro;
                operacion = true;
            } else {
                operacion = false;
            }
        }
        return operacion;
    }

    private int generarContraseña() {
        this.contraseña = (int) (Math.random() * 9999 + 1000);
        return this.contraseña;
    }

    public boolean modificarContraseña(int contra) {
        if (validarContraseña(contra)) {
            this.contraseña = (int) (Math.random() * 9999 + 1000);
            return true;
        } else {
            System.out.println("error");
        }
        return false;
    }

    public boolean validarContraseña(int contra) {
        if (contra == this.contraseña) {
            return true;
        }
        return false;
    }

    public String mostrarDatos(int contra) {
        if (validarContraseña(contra)) {
            return "Cuenta = " + cuenta + ", Saldo = " + saldo;
        }
        return "error";
    }

}