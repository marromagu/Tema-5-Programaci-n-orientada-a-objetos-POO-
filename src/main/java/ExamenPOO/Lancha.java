/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ExamenPOO;

/**
 *
 * @author JMRivera
 */
public class Lancha extends Barco{
  // Atributos de la clase
  private float potencia;
  
  // Constructor de la clase
  public Lancha(float potencia, String matricula, float eslora, float manga, boolean conPatron) {
    super(matricula, eslora, manga, conPatron);
    this.potencia = potencia;
  }
  
  // Getter de la clase

  public float getPotencia() {
    return potencia;
  }

  @Override
  public float precioAlquiler() {
    return this.getEslora()*potencia+(this.isConPatron()?60:0);
  }

  @Override
  public void verDatos() {
    System.out.print("\nLancha ");
    super.verDatos();
    System.out.println("Potencia "+potencia+" CV");
  }
  
  
}
