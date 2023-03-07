/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejemplos_EmpleadoAmpliado;

/**
 *
 * @author jmrivera
 */
public class Operario extends Empleado{
    
    protected int horasExtras;

    public int getHorasExtras() {
        return horasExtras;
    }

    public void setHorasExtras(int horasExtras) {
        this.horasExtras = horasExtras;
    }
    
    public Operario(String nombre, int horasExtras) {
        super(nombre);
        this.horasExtras = horasExtras;
    }

    @Override
    public double calculaSalario() {
        return super.calculaSalario() + this.horasExtras * 15;
    }

    @Override
    public String toString() {
        return super.toString()+ "-> Operario "+this.horasExtras;
    }

    
}
