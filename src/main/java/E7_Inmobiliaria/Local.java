/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package E7_Inmobiliaria;

/**
 *
 * @author mario
 */
public class Local extends Inmueble {

    //Atributos -Sólo los de la clase padre
    
    //Metodos -Getters y setters. 
    
    public Local(double superficie, String direccion, double precio) {
        //Constructor con parámetros
        super(superficie, direccion, precio);
    }
    
    @Override
    public double precioAlquiler() {
        return super.getSuperficie()*20;
    }

    @Override
    public double comision() {
       return precioAlquiler()*2;
    }


    public void varDatos() {
        System.out.println("Local");
        super.verDatos();
    }

}
