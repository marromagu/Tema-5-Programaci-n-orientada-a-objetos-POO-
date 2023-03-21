/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package E7_Inmobiliaria;

/**
 *
 * @author mario
 */
public class Atico extends Inmueble {

    //Atributos
    private double terraza;

    //Metodos
    public Atico(double terraza, double superficie, String direccion, double precio) {
        super(superficie, direccion, precio);
        this.terraza = terraza;
    }

    @Override
    public double precioAlquiler() {
        return terraza + super.getSuperficie() * 20;
    }

    @Override
    public double comision() {
        return terraza + super.getSuperficie() * 10;
    }

    public double getTerraza() {
        return terraza;
    }

    public void setTerraza(double terraza) {
        this.terraza = terraza;
    }

    public void verDatos() {
        System.out.println("---------");
        System.out.println("| Atico |");
        System.out.println("---------");
        super.verDatos();
        System.out.println("Terraza: " + terraza);
    }
}
