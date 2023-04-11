/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ExamenPOO;

/**
 *
 * @author JMRivera
 */
public class Velero extends Barco{
  // Atributos de la Clase
  private int numeroMastiles;
  private float superficieVela;
  
  // Constructor
  public Velero(int numeroMastiles, float superficieVela, String matricula, float eslora, float manga, boolean conPatron) {
    super(matricula, eslora, manga, conPatron);
    this.numeroMastiles = numeroMastiles;
    this.superficieVela = superficieVela;
  }

  // Getters de la clase
  public int getNumeroMastiles() {
    return numeroMastiles;
  }

  public float getSuperficieVela() {
    return superficieVela;
  }

  @Override
  public float precioAlquiler() {
    return this.getEslora()*numeroMastiles+superficieVela+(this.isConPatron()?100:0);
  }

  @Override
  public void verDatos() {
    System.out.print("\nVelero ");
    super.verDatos(); 
    System.out.println(numeroMastiles+" mástiles y "+superficieVela+" mts2 de vela");
  }
  
  
}
