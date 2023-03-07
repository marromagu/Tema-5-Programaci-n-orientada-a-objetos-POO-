/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package E5_HerenciaPolimorfismo_Vehículos;

/**
 *
 * @author DAM_T
 */
/*Clase Coche: tiene como atributo propio numPlazas. Tiene el constructor con parámetros y el getter para su atributo.
El método trucarVehiculo se implementa multiplicando por 2 la potencia del coche.*/
public class Choche {
    private int numPlazas;

    public Choche(int numPlazas) {
        this.numPlazas = numPlazas;
    }

    public int getNumPlazas() {
        return numPlazas;
    }

    public void setNumPlazas(int numPlazas) {
        this.numPlazas = numPlazas;
    }
    
    
    
}
