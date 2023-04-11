/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package E8_Ejemplo_Interface;

/**
 *
 * @author JMRivera
 */
public class CuentaCorriente extends Cuenta{

  public CuentaCorriente(int numCuenta, String nombre, String apellidos, double saldo) {
    super(numCuenta, nombre, apellidos, saldo);
  }

  @Override
  public boolean transferenciaBancaria(double dinero, ICuentaCorriente objetoCuenta) {
    if (super.transferenciaBancaria(dinero, objetoCuenta)){
      super.setSaldo(super.getSaldo() - dinero * 0.01);
      return true;
    }
    return false;
  }

  @Override
  public boolean retirarEfectivo(double dinero) {
    if (dinero <= 600){
      return super.retirarEfectivo(dinero); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    return false;
  }

  
  
}
