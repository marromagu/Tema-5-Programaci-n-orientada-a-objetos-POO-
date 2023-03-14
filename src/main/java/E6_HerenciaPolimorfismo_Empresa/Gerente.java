/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package E6_HerenciaPolimorfismo_Empresa;

/**
 *
 * @author mario
 */
public class Gerente extends Empleados {

    private double comision;
    private int proyectos;

    public Gerente(double comision, int proyectos, String nombre, String dni, double salario) {
        super(nombre, dni, salario);
        this.comision = comision;
        this.proyectos = proyectos;
    }

    public void datosEmpleados() {
        System.out.println("--------------------------------------------");
        System.out.println("Gerente");
        System.out.println("--------------------------------------------");

        super.datosEmpleados(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    protected double extras() {
        return comision * proyectos;
    }

    public double getComision() {
        return comision;
    }

    public void setComision(double comision) {
        this.comision = comision;
    }

    public int getProyectos() {
        return proyectos;
    }

    public void setProyectos(int proyectos) {
        this.proyectos = proyectos;
    }

}
