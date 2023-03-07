/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejemplos_Herencia;

/**
 *
 * @author JMRivera
 */
public class Punto3D extends Punto {

	private int z;
	
	public Punto3D(int x, int y, int z)
	{
		super(x,y);
		this.z=z;
	}
	
	public int getZ()
	{
		return this.z;
	}
	
	public void setZ(int newZ)
	{
		this.z=newZ;
	}
	
	public void adentro(int sumaZ)
	{
		this.z+=sumaZ;
	}
	
	public void fuera(int restaZ)
	{
		this.z-=restaZ;
	}
	
  @Override
	public void muestraPunto()
	{
		super.muestraPunto();
		System.out.println("z: "+this.z);
	}
}

