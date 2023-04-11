/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package E8_Ejemplo_Interface;

/**
 *
 * @author JMRivera
 */
public class EjemploInterface {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
		Cuenta cc = new CuentaCorriente(1,"Manuel", "Ruiz de Lopera", 1600);
		Cuenta ca = new CuentaAhorro(2, "José María", "del Nido Benavente", 5000);
		
		System.out.println("\nMostrando las cuentas...");
		cc.mostrarSaldo();
		ca.mostrarSaldo();
		
		if (cc.retirarEfectivo(500))
			System.out.println("Dinero retirado correctamente de la cuenta corriente.");
		else
			System.out.println("No se ha podido retirar el dinero de la cuenta corriente.");
		
		System.out.println("\nMostrando las cuentas...");
		cc.mostrarSaldo();
		ca.mostrarSaldo();
		
		if (ca.retirarEfectivo(575))
			System.out.println("Dinero retirado correctamente de la cuenta de ahorro.");
		else
			System.out.println("NO se ha podido retirar el dinero de la cuenta de ahorro.");
		
		System.out.println("\nMostrando las cuentas...");
		cc.mostrarSaldo();
		ca.mostrarSaldo();
		
		if (cc.transferenciaBancaria(263, ca))
			System.out.println("Transferencia bancaria realizada correctamente de la cuenta corriente a la cuenta de ahorro.");
		else 
			System.out.println("NO se ha podido realizar la transferencia de la cuenta de corriente a la cuenta ahorro.");

		System.out.println("\nMostrando las cuentas...");
		cc.mostrarSaldo();
		ca.mostrarSaldo();
		
		if (ca.transferenciaBancaria(627, cc))
			System.out.println("Transferencia bancaria realizada correctamente de la cuenta de ahorro a la cuenta corriente.");
		else
			System.out.println("NO se ha podido realizar la transferencia de la cuenta de ahorro a la cuenta corriente.");
		
		System.out.println("\nMostrando las cuentas...");
		cc.mostrarSaldo();
		ca.mostrarSaldo();  }
  
}
