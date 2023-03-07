/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejemplos_EmpleadoAmpliado;

/**
 *
 * @author jmrivera
 */
public class Oficial extends Operario{

    public Oficial(String nombre, int horas) {
        super(nombre, horas);
    }

    @Override
    public String toString() {
        return super.toString()+"-> Oficial";
    }
    
    
}
