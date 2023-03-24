/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package E7_Inmobiliaria;

/**
 *
 * @author JMRivera
 */
public abstract class Inmueble {

    private double superficie;
    private String direccion;
    private double precio;

    public Inmueble(double superficie, String direccion, double precio) {
        this.superficie = superficie;
        this.direccion = direccion;
        this.precio = precio;
    }

    public double getSuperficie() {
        return superficie;
    }

    public void setSuperficie(double superficie) {
        this.superficie = superficie;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void verDatos() {
        System.out.println("Superficie: " + superficie + " mts2");
        System.out.println("Direccion: " + direccion);
        System.out.println("Precio: " + precio + "€ (euros)");
        System.out.println("Alquiler: " + precioAlquiler());
        System.out.println("Comisión: " + comision());
    }

    public abstract double precioAlquiler();

    public abstract double comision();

    public boolean menorQue(Inmueble inmueble) {
        if (this.superficie < inmueble.superficie) {
            return true;
        }
        return false;
    }
}
