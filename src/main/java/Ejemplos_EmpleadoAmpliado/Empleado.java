/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejemplos_EmpleadoAmpliado;

/**
 *
 * @author jmrivera
 */
public class Empleado {
    private String nombre;
    protected double salario;

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Empleado(String nombre) {
        this.nombre = nombre;
        this.salario = 1000.0;
    }
    
    public Empleado() {
        this.nombre = "";
    }

    @Override
    public String toString() {
        return "Empleado " + nombre;
    }
    
    public double calculaSalario(){
        return this.salario;
    }
}
