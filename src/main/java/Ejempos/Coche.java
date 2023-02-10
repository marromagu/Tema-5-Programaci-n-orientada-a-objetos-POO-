/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejempos;

/**
 *
 * @author JMRivera
 */
public class Coche {
	private String matricula;
	private String marca;
	private String color;
	private double kilometraje;
	private double cantidadGasolina;
	private double consumoALos100;
	private int numPlazas;
	private static int numeroCoches = 0; // Variable de clase
		
	//constructor vacío
	public Coche() {
		this.matricula = new String("");
		this.marca = new String("");
		this.color = new String("");
		this.kilometraje = 0.0;
		this.cantidadGasolina = 0;
		this.numPlazas = 0;
		numeroCoches++;
	}
	
	//constructor con parámetros
	public Coche(String mat, String marca, String color, double kilometraje, double cantidadGasolina, double consumoALos100,int plazas) {
		this.matricula = mat.toUpperCase();
		this.marca = marca.toUpperCase();
		this.color = color.toUpperCase();
		this.kilometraje = kilometraje;
		this.cantidadGasolina = cantidadGasolina;
		this.consumoALos100 = consumoALos100;
		this.numPlazas = plazas;
		numeroCoches++;
	}
	
	//constructor copia
	public Coche(Coche cocheCopia) {
		this.matricula = cocheCopia.matricula;
		this.marca = cocheCopia.marca;
		this.color = cocheCopia.color;
		this.kilometraje = cocheCopia.kilometraje;
		this.consumoALos100 = cocheCopia.consumoALos100;
		this.numPlazas = cocheCopia.numPlazas;
		numeroCoches++;
	}
	
	//getters
	public String getMatricula() {
		return matricula;
	}
	
	public String getMarca() {
		return marca;
	}
	
	public String getColor() {
		return color;
	}
	
	public double getKilometraje() {
		return kilometraje;
	}
	
	public double getCantidadGasolina() {
		return cantidadGasolina;
	}

	public int getNumPlazas() {
		return numPlazas;
	}
	
	public static int getNumeroCoches() {
		return numeroCoches;
	}
	
	//setters
	public void setMatricula(String nuevaMatricula)	{
		this.matricula = nuevaMatricula.toUpperCase();
	}		

	public void setMarca(String marca) {
		this.marca  =  marca;
	}		
	
	public void setColor(String color) {
		switch(color.toLowerCase()) {
			case "rojo":
			case "blanco":
			case "azul":
			case "negro":
				this.color = color.toUpperCase();
				break;
			default:
				this.color = "blanco";					
		}
	}		
	
	public void setKilometraje(double kilometraje) {
		this.kilometraje  =  kilometraje;
	}		

	public void setNumPlazas(int numPlazas) {
		this.numPlazas = numPlazas;
	}

	public static void setNumeroCoches(int numeroCoches) {
		Coche.numeroCoches  =  numeroCoches;
	}
	
  public boolean enReserva(){
    return this.cantidadGasolina < 5;
  }
  
	public boolean hacerViaje(double numKilometrosViaje) 	{
		if(this.cantidadGasolina < numKilometrosViaje*this.consumoALos100/100)
			return false;
		else {
			this.kilometraje += numKilometrosViaje;
			this.cantidadGasolina -= numKilometrosViaje*this.consumoALos100/100;
			return true;
		}
	}
	
	public String toString() {
		StringBuilder st = new StringBuilder();
		
    st.append("\n- Datos del coche -");
		st.append("\nMatrícula: "+this.matricula);
		st.append("\nMarca: "+this.marca);
		st.append("\nColor: "+this.color);
		st.append("\nKilometraje: "+this.kilometraje);
		st.append("\nPlazas: "+this.numPlazas);
		st.append("\nCantidad gasolina: "+this.cantidadGasolina);
		st.append("\nConsumo: "+this.consumoALos100);
		return st.toString();
	}
	
	public String devuelveMatriculaFormat()	{
		String cad = new String("La matrícula es: "+this.matricula);
		
		return cad;
	}

  public double getConsumoALos100() {
    return consumoALos100;
  }

  public void setConsumoALos100(double consumoALos100) {
    this.consumoALos100 = consumoALos100;
  }
		
}
