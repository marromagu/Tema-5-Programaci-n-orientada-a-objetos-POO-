/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejemplos_Herencia;

/**
 *
 * @author JMRivera
 */
public class Punto2DFormato extends Punto {
	
	private String nombrePunto;
	
	public Punto2DFormato()
	{
		super();
		this.nombrePunto=new String("punto");
	}
	
	public Punto2DFormato(int x, int y,String nomPunt)
	{
		super(x,y);
		this.nombrePunto=nomPunt;
	}
	
	public String getNombrePunto()
	{
		return this.nombrePunto;
	}
	
	//ampliado funcionalidad
//	public void muestraPunto() {
//		super.muestraPunto();
//		System.out.println("El punto se llama: "+this.nombrePunto);		
//	}
	
	//sobreescribir el método
  @Override
	public void muestraPunto()
	{
		System.out.println("Nombre punto: "+this.nombrePunto);
		System.out.println("("+super.x+" , "+super.y+")");
	}
	
}
