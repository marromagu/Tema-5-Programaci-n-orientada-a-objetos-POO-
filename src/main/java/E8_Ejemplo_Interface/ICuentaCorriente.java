/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package E8_Ejemplo_Interface;

/**
 *
 * @author JMRivera
 */
public interface ICuentaCorriente {
	public boolean ingresarEnCuenta(double dinero);
	public boolean retirarEfectivo(double dinero);
	public void mostrarSaldo();
	public void mostrarDatos();
	public boolean transferenciaBancaria(double dinero,ICuentaCorriente objetoCuenta);
}
