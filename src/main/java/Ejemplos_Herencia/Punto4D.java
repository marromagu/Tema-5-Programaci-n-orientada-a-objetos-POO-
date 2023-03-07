/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejemplos_Herencia;

/**
 *
 * @author JMRivera
 */
public class Punto4D extends Punto3D{
	private float t;
	
	public Punto4D(int x, int y, int z, float t)
	{ 
		super(x,y,z);
		this.t=t;
	}
	
	//getters y setters
	
  @Override
	public void muestraPunto()
	{
		super.muestraPunto();
		System.out.println("En el instante: "+this.t);
	}
	
	public void sumaTiempo(float newT)
	{
		this.t+=newT;
	}
}
