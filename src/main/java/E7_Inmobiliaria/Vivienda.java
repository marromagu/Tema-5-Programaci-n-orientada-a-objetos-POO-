/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package E7_Inmobiliaria;

/**
 *
 * @author mario
 */
public class Vivienda extends Inmueble {

    //Atributos
    private int numHabitaciones;
    private int numBaños;
    private int plazasGaraje;
    private int planta;
    private boolean ascensor;

    //Metodos
    public Vivienda(int numHabitaciones, int numBaños, int plazasGaraje, int planta, boolean ascensor, double superficie, String direccion, double precio) {
        super(superficie, direccion, precio);
        this.numHabitaciones = numHabitaciones;
        this.numBaños = numBaños;
        this.plazasGaraje = plazasGaraje;
        this.planta = planta;
        this.ascensor = ascensor;
    }

    @Override
    public double precioAlquiler() {
        double precio;
        precio = super.getSuperficie() * 10;
        precio += numHabitaciones * 50;
        precio += numBaños * 10;
        if (ascensor) {
            precio += 50;
        } else {
            precio -= planta * 10;
        }

        return precio;
    }

    @Override
    public double comision() {
        return precioAlquiler() + (super.getPrecio() * 1.5);
    }

    public void verDatos() {
        System.out.println("------------");
        System.out.println("| Vivienda |");
        System.out.println("------------");
        super.verDatos();
        StringBuilder sb = new StringBuilder();
        sb.append("\nNumero de Habitaciones: ").append(numHabitaciones);
        sb.append("\nNumero de Baños: ").append(numBaños);
        sb.append("\nPlazas de Garaje: ").append(plazasGaraje);
        sb.append("\nPlantas: ").append(planta);
        sb.append("\nAscensor: ").append(ascensor);
        System.out.println(sb.toString());
    }

    public int getNumHabitaciones() {
        return numHabitaciones;
    }

    public void setNumHabitaciones(int numHabitaciones) {
        this.numHabitaciones = numHabitaciones;
    }

    public int getNumBaños() {
        return numBaños;
    }

    public void setNumBaños(int numBaños) {
        this.numBaños = numBaños;
    }

    public int getPlazasGaraje() {
        return plazasGaraje;
    }

    public void setPlazasGaraje(int plazasGaraje) {
        this.plazasGaraje = plazasGaraje;
    }

    public int getPlanta() {
        return planta;
    }

    public void setPlanta(int planta) {
        this.planta = planta;
    }

    public boolean isAscensor() {
        return ascensor;
    }

    public void setAscensor(boolean ascensor) {
        this.ascensor = ascensor;
    }

}
