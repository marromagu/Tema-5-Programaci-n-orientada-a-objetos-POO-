/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package E8_Ejemplo_Interface;

/**
 *
 * @author JMRivera
 */
public class Cuenta implements ICuentaCorriente{
  private int numCuenta;
  private String nombre;
  private String apellidos;
  private double saldo;

  public Cuenta(int numCuenta, String nombre, String apellidos, double saldo) {
    this.numCuenta = numCuenta;
    this.nombre = nombre;
    this.apellidos = apellidos;
    this.saldo = saldo;
  }

  public double getSaldo() {
    return saldo;
  }

  public void setSaldo(double saldo) {
    this.saldo = saldo;
  }

  public int getNumCuenta() {
    return numCuenta;
  }

  public void setNumCuenta(int numCuenta) {
    this.numCuenta = numCuenta;
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public String getApellidos() {
    return apellidos;
  }

  public void setApellidos(String apellidos) {
    this.apellidos = apellidos;
  }

  @Override
  public boolean ingresarEnCuenta(double dinero) {
    if (dinero > 0){
      this.saldo += dinero;
      return true;
    }else
      return false;
  }

  @Override
  public boolean retirarEfectivo(double dinero) {
    if (dinero > 0){
      this.saldo -= dinero;
      return true;
    }else
      return false;
  }

  @Override
  public void mostrarSaldo() {
    System.out.println("El saldo de la cuenta es: "+this.saldo);
  }

  @Override
  public void mostrarDatos() {
    System.out.println("Cuenta nº: "+this.numCuenta);
    System.out.println("Nombre: "+this.nombre);
    System.out.println("Apellidos: "+this.apellidos);
    System.out.println("Saldo: "+this.saldo);
  }

  @Override
  public boolean transferenciaBancaria(double dinero, ICuentaCorriente objetoCuenta) {
    if(this.retirarEfectivo(dinero)){
      return objetoCuenta.ingresarEnCuenta(dinero);
    }
    return false;
  }
  
  
}
