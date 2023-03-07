/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejemplos_EmpleadoAmpliado;

/**
 *
 * @author jmrivera
 */
public class Directivo extends Empleado{
    
    private String  cargo;
    
    public Directivo(String nombre) {
        super(nombre);
        this.salario = this.salario;
        this.cargo = "";
    }

    @Override
    public double calculaSalario() {
        return super.calculaSalario()*2;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    
    
    
    @Override
    public String toString() {
        return super.toString()+"-> Directivo";
    }
    
}
