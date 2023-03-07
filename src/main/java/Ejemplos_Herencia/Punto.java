/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejemplos_Herencia;

/**
 *
 * @author JMRivera
 */
public class Punto {
	protected int x;
	protected int y;
	
	public Punto()
	{
		this.x=0;
		this.y=0;
	}
	
	public Punto(int x, int y)
	{
		this.x=x;
		this.y=y;
	}
	
	public int getX()
	{
		return this.x;
	}
	
	public int getY()
	{
		return this.y;
	}
	
	public void setX(int newX)
	{
		this.x=newX;
	}
	
	public void setY(int newY)
	{
		this.y=newY;
	}
	
	public void adelante(int sumaX)
	{
		this.x+=sumaX;
	}
	
	public void atras(int restaX)
	{
		this.x-=restaX;
	}
	
	public void arriba(int sumaY)
	{
		this.y+=sumaY;
	}
	
	public void abajo(int restaY)
	{
		this.y-=restaY;
	}
	
	public void muestraPunto()
	{
		System.out.println("El punto está en la posición: ("+this.x+","+this.y+")");
	}
}