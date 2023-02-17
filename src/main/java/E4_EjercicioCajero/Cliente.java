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
    //Cuenta cuenta;

    public Cliente(String DNI, double salario) {
        this.DNI = DNI;
        this.salario = salario;
    }

    public Cliente(String DNI, double salario, double saldo) {
        this.DNI = DNI;
        this.salario = salario;
        cuenta.setCuenta(DNI);
        cuenta.setContraseña(Integer.parseInt(DNI));
        cuenta.setSaldo(saldo);
        //this.cuenta = new Cuenta(DNI, saldo, Integer.parseInt(DNI));
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        try {
            Integer.parseInt(DNI);
            this.DNI = DNI;
        } catch (ExceptionInInitializerError e) {
            System.out.println("Escribe solo numeros para el DNI");
        }
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        if (salario > 0) {
            this.salario = salario;
        }
    }

    public String mostrarDatos() {
        StringBuilder sb = new StringBuilder();
        sb.append("Cliente ");
        sb.append("DNI= ").append(DNI);
        sb.append(", saldo= ").append(cuenta.getSaldo());
        return sb.toString();
    }

    public double ingresarNómina() {
        double saldoC = cuenta.getSaldo();
        saldoC += this.salario;
        cuenta.setSaldo(salario);
        return cuenta.getSaldo();
    }

    public double sacarDinero(int contra) {
        Scanner t = new Scanner(System.in);
        if (cuenta.validarContraseña(contra)) {
            System.out.println("Cunato dinero desa sacar");
            int dinero = Integer.parseInt(t.nextLine());
            dinero *= -1;
            cuenta.setSaldo(dinero);
        }
        return cuenta.getSaldo();
    }

}
