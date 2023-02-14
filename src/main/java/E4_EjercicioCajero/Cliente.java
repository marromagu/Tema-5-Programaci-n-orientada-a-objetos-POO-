/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package E4_EjercicioCajero;

import java.util.Scanner;

/**
 *
 * @author DAM_T
 */
public class Cliente {

    private String DNI;
    private double salario;

    Cuenta cuenta = new Cuenta();
    private double saldo = cuenta.getSaldo();

    public Cliente(String DNI, double salario) {
        this.DNI = DNI;
        this.salario = salario;
    }

    public Cliente(String DNI, double salario, double saldo) {
        int dni = Integer.parseInt(DNI);
        cuenta.setCuenta(DNI);
        cuenta.setContraseña(dni);

    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        int dni = Integer.parseInt(DNI);
        this.DNI = DNI;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        if (this.salario > 0) {
            this.salario = salario;
        }
    }
    public String mostrarDatos() {
        StringBuilder sb = new StringBuilder();
        sb.append("Cliente{");
        sb.append("DNI= ").append(DNI);
        sb.append(", saldo= ").append(saldo);
        sb.append('}');
        return sb.toString();
    }
    public double ingresarNómina(){
        this.saldo += this.salario;
        return this.saldo;
    }
    public double sacarDinero(int contra){
        Scanner t = new Scanner(System.in);
        if(cuenta.validarContraseña(contra)){
            System.out.println("Cunato dinero desa sacar");
            int dinero = Integer.parseInt(t.nextLine());
            saldo-=dinero;
        }
        return this.saldo;
    }
    
    

}
