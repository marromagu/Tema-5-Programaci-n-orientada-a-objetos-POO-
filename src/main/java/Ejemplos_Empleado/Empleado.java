/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejemplos_Empleado;

/**
 *
 * @author jmrivera
 */
public class Empleado {
    private String nombre;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Empleado(String nombre) {
        this.nombre = nombre;
    }
    
    public Empleado() {
        this.nombre = "";
    }

    @Override
    public String toString() {
        return "Empleado " + nombre;
    }
    
    
}
