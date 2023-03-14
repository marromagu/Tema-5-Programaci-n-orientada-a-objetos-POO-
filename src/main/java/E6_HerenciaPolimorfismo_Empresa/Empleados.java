/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package E6_HerenciaPolimorfismo_Empresa;

import Ejemplos_Empleado.*;

/**
 *
 * @author jmrivera
 */
public abstract class Empleados {

    private String nombre;
    private String dni;
    private double salario;
    private Cuenta cuentaEmpleado;

    public Empleados(String nombre, String dni, double salario) {
        this.nombre = nombre;
        this.dni = dni;
        this.salario = salario;
        this.cuentaEmpleado = new Cuenta(nombre, dni, 5, salario);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public Cuenta getCuentaEmpleado() {
        return cuentaEmpleado;
    }

    public void setCuentaEmpleado(Cuenta cuentaEmpleado) {
        this.cuentaEmpleado = cuentaEmpleado;
    }

    protected abstract double extras();
    //El método abstracto extras que devuelve un double y no recibe parámetros. Calculará los extras del salario del empleado.

    public void datosEmpleados() {
        StringBuilder sb = new StringBuilder();
        sb.append("Nombre: ").append(nombre);
        sb.append(" DNI: ").append(dni);
        sb.append(" Salario: ").append(salario);
        sb.append(" Los Extras son: ").append(extras());
        sb.append(" Cuenta Empleado: ").append(cuentaEmpleado);

        sb.append("--------------------------------------------");
        System.out.println(sb.toString());
    }

}
