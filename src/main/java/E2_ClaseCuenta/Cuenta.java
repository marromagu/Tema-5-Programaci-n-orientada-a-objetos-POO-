/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package E2_ClaseCuenta;

/**
 *
 * @author mario
 */
public class Cuenta {

    //Datos de la cuenta:
    //Definicion de las varibles como privada para encapsulamiento
    private String nombre;
    private String nCuenta;
    private double interes;
    private double saldo;

    public Cuenta(String nombre, String nCuenta, double interes, double saldo) {
        //Constuctor por defecto
        this.nombre = nombre;
        this.nCuenta = nCuenta;
        this.interes = interes;
        this.saldo = saldo;
    }

    public Cuenta() {
        //Constructor con parametros
        this.interes = 0;
        this.nCuenta = "";
        this.nombre = "";
        this.saldo = 0;
    }

    public Cuenta(Cuenta cuentaCopia) {
        //Constructor copia
        this.interes = cuentaCopia.interes;
        this.nCuenta = cuentaCopia.nCuenta;
        this.nombre = cuentaCopia.nombre;
        this.saldo = cuentaCopia.saldo;
    }

    //Get & Set
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getnCuenta() {
        return nCuenta;
    }

    public void setnCuenta(String nCuenta) {
        this.nCuenta = nCuenta;
    }

    public double getInteres() {
        return interes;
    }

    public void setInteres(double interes) {
        this.interes = interes;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    //toString, que devuelve un String con los datos de la cuenta
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\tCuenta:");
        sb.append("\n---------------------------");
        sb.append("\nNombre: ").append(nombre);
        sb.append("\nNumero de Cuenta:").append(nCuenta);
        sb.append("\nInteres: ").append(interes);
        sb.append("\nSaldo:").append(saldo);
        sb.append("\n---------------------------");
        return sb.toString();
    }

    public boolean ingreso(double ingreso) {
        boolean operacion = false;
        if (ingreso > 0) {
            this.saldo += ingreso;
            operacion = true;
        } else {
            operacion = false;
        }
        return operacion;
    }

    public boolean reintegro(double reintegro) {
        boolean operacion = false;
        if (this.saldo >= 0) {
            if (reintegro > 0) {
                this.saldo -= reintegro;
                operacion = true;
            } else {
                operacion = false;
            }
        }

        return operacion;
    }

    public boolean transferencia(Cuenta cuentaDestino, double importe) {
        
        if (this.reintegro(importe)) {
            cuentaDestino.ingreso(importe);
            return true;
        }
        //cuentaDestino.saldo += importe;
        //this.saldo -= importe;
        return false;
    }
}
