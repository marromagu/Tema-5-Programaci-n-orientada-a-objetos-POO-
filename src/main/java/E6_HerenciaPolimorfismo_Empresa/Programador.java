/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package E6_HerenciaPolimorfismo_Empresa;

/**
 *
 * @author mario
 */
public class Programador extends Empleados {

    private int horasExtras;

    public Programador(int horasExtras, String nombre, String dni, double salario) {
        super(nombre, dni, salario);
        this.horasExtras = horasExtras;
    }

    @Override
    protected double extras() {

        return horasExtras * 20;

    }

    public void datosEmpleados() {
        System.out.println("\n\n--------------------------------------------");
        System.out.println("\tProgramador");
        System.out.println("--------------------------------------------");
        super.datosEmpleados(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    public int getHorasExtras() {
        return horasExtras;
    }

    public void setHorasExtras(int horasExtras) {
        this.horasExtras = horasExtras;
    }

}
