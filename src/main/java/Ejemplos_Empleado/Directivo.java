/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejemplos_Empleado;

/**
 *
 * @author jmrivera
 */
public class Directivo extends Empleado{

    public Directivo(String nombre) {
        super(nombre);
    }

    @Override
    public String toString() {
        return super.toString()+"-> Directivo";
    }
    
}
