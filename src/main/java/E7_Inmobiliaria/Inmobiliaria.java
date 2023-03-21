/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package E7_Inmobiliaria;

import java.util.Scanner;

/**
 *
 * @author mario
 */
public class Inmobiliaria {

    //Atributos
    private String nombre;
    private String cif;
    private String direccion;
    private String propietario;
    private Inmueble[] inmuebles;
    private Cuenta cuenta;
    private int numeroInmuebles;

    public Inmobiliaria(String nombre, String cif, String direccion, String propietario, double saldo) {
        this.nombre = nombre;
        this.cif = cif;
        this.direccion = direccion;
        this.propietario = propietario;
        inmuebles = new Inmueble[100];
        numeroInmuebles = 0;
        cuenta = new Cuenta(nombre, cif, 10, saldo);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCif() {
        return cif;
    }

    public void setCif(String cif) {
        this.cif = cif;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getPropietario() {
        return propietario;
    }

    public void setPropietario(String propietario) {
        this.propietario = propietario;
    }

    public Inmueble[] getInmueble() {
        return inmuebles;
    }

    public void setInmueble(Inmueble[] inmueble) {
        this.inmuebles = inmueble;
    }

    public Cuenta getCuenta() {
        return cuenta;
    }

    public void setCuenta(Cuenta cuenta) {
        this.cuenta = cuenta;
    }

    public int getNumeroInmuebles() {
        return numeroInmuebles;
    }

    public void setNumeroInmuebles(int numeroInmuebles) {
        this.numeroInmuebles = numeroInmuebles;
    }

    public boolean altaInmueble(Inmueble nuevoInmueble) {
        if (numeroInmuebles < inmuebles.length) {
            inmuebles[numeroInmuebles++] = nuevoInmueble;
            return true;
        }

        return false;
    }

    public Inmueble devolverInmueble(int pos) {
        if (numeroInmuebles > 0) {
            return inmuebles[pos];
        }

        return null;
    }

    public boolean bajaInmueble(int pos) {
        inmuebles[pos] = inmuebles[numeroInmuebles - 1];
        inmuebles[numeroInmuebles--] = null;

        return false;
    }

    public boolean alquilar(int pos) {
        cuenta.ingreso(inmuebles[pos].comision() + inmuebles[pos].getPrecio());
        System.out.println(inmuebles[pos].comision() + inmuebles[pos].getPrecio());
        inmuebles[pos].verDatos();
        bajaInmueble(pos);
        return false;
    }

    public Inmueble pedirDatos() {
        Scanner t = new Scanner(System.in);
        System.out.println("Tipo de Inmueble [A/L/V]");
        String r = t.nextLine();
        System.out.println("Superficie");
        double superficie = t.nextDouble();
        System.out.println("Direccion");
        String direccion = t.nextLine();
        System.out.println("Precio");
        double precio = t.nextDouble();

        switch (r) {
            case "A" -> {
                System.out.println("Terraza");
                double terraza = t.nextDouble();
                Atico nuevoAtico = new Atico(terraza, superficie, direccion, precio);
                return nuevoAtico;
            }
            case "V" -> {
                System.out.println("numHabitaciones");
                int numHabitaciones = t.nextInt();
                System.out.println("numBaños");
                int numBaños = t.nextInt();
                System.out.println("plazasGaraje");
                int plazasGaraje = t.nextInt();
                System.out.println("planta");
                int planta = t.nextInt();
                System.out.println("ascensor");
                boolean ascensor;
                r = t.nextLine();
                ascensor = switch (r) {
                    case "s" ->
                        true;
                    default ->
                        false;
                };
                Vivienda nuevaVivienda = new Vivienda(numHabitaciones, numBaños, plazasGaraje, planta, ascensor, superficie, direccion, precio);
                return nuevaVivienda;
            }
            case "L" -> {
                Local nuevoLocal = new Local(superficie, direccion, precio);
                return nuevoLocal;
            }

            default -> {
            }
        }
        return null;
    }
    public void verDatos(){
        System.out.println(numeroInmuebles);
        System.out.println(cuenta.getSaldo());
    }
    public void verDatosInmuebles(){
        for (int i = 0; i < numeroInmuebles; i++) {
            inmuebles[i].verDatos();
        }
    }

}
