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

    @Override
    public String datosEmpleados() {
        System.out.println("--------------------------------------------");
        System.out.println("Programador");
        System.out.println("--------------------------------------------");
        return super.datosEmpleados(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    public int getHorasExtras() {
        return horasExtras;
    }

    public void setHorasExtras(int horasExtras) {
        this.horasExtras = horasExtras;
    }

}
