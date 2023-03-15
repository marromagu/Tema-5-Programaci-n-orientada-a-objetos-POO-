/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package E6_HerenciaPolimorfismo_Empresa;

/**
 *
 * @author mario
 */
public class Empresa {

    private String nombreEmpresa;
    private String cif;
    private int numeroEmpleados;
    private Cuenta cuentaEmpresa;
    private Empleados[] empleados;

    public Empresa(String nombreEmpresa, String cif, double saldo) {
        this.nombreEmpresa = nombreEmpresa;
        this.cif = cif;
        this.empleados = new Empleados[20];
        this.numeroEmpleados = 0;
        this.cuentaEmpresa = new Cuenta(nombreEmpresa, cif, 10, saldo);
    }

    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    public void setNombreEmpresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }

    public String getCif() {
        return cif;
    }

    public void setCif(String cif) {
        this.cif = cif;
    }

    public int getNumeroEmpleados() {
        return numeroEmpleados;
    }

    public void setNumeroEmpleados(int numeroEmpleados) {
        this.numeroEmpleados = numeroEmpleados;
    }

    public Cuenta getCuentaEmpresa() {
        return cuentaEmpresa;
    }

    public void setCuentaEmpresa(Cuenta cuentaEmpresa) {
        this.cuentaEmpresa = cuentaEmpresa;
    }

    public Empleados[] getEmpleados() {
        return empleados;
    }

    public void setEmpleados(Empleados[] empleados) {
        this.empleados = empleados;
    }

    protected boolean contratar(Empleados empleado) {
        if (numeroEmpleados < empleados.length) {
            this.empleados[numeroEmpleados++] = empleado;
            // numeroEmpleados++;
            return true;
        }
        return false;
    }

    protected Empleados devolverEmpleado(int posicion) {
        if (empleados[posicion] != null) {
            return empleados[posicion];
        }

        return null;
    }

    protected boolean pagarNomina(int posicion) {
        double nomina;
        if (devolverEmpleado(posicion) != null) {
            Empleados miEmpleado = devolverEmpleado(posicion);
            nomina = miEmpleado.getSalario() + miEmpleado.extras();

            return this.cuentaEmpresa.transferencia(miEmpleado.getCuentaEmpleado(), nomina);
        }

        return false;
    }

    protected void listarEmpleados() {
        for (int i = 0; i < numeroEmpleados; i++) {
            devolverEmpleado(i).datosEmpleados();
            //empleados[i].datosEmpleados();
        }
    }

    protected void datosEmpresa() {
        System.out.println("Nombre: " + nombreEmpresa);
        System.out.println("CIF: " + cif);
        System.out.println("Saldo: " + cuentaEmpresa.getSaldo());
    }

}
