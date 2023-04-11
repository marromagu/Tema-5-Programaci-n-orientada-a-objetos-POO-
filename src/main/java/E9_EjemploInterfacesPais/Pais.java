package E9_EjemploInterfacesPais;


public class Pais implements IMostrable,IOrdenable{
	private String nombre;
	private long numHabitantes;

	
	public Pais(String n,long hab)
	{
		this.nombre=n;
		this.numHabitantes=hab;
	}
	
	public void mostrar()
	{
		System.out.println("El pa�s se llama: "+this.nombre);
		System.out.println("El n�mero de habitantes es: "+this.numHabitantes);
	}
	
	public boolean menorQue(IOrdenable otro) {
		return this.numHabitantes<((Pais)otro).numHabitantes;
	}
	
	public boolean mayorQue(IOrdenable otro) {
		return this.numHabitantes>((Pais)otro).numHabitantes;
	}
	
	public boolean igualQue(IOrdenable otro) {
		return this.numHabitantes==((Pais)otro).numHabitantes;
	}
}
