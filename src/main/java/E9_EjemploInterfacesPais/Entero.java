package E9_EjemploInterfacesPais;

public class Entero implements IMostrable,IOrdenable{
	private int num;
	
	Entero(int n)
	{
		this.num=n;
	}
	
	public int getNum()
	{
		return num;
	}	
	
	public void mostrar()
	{
		System.out.println("Es el n�mero entero "+this.num);
	}
	
	public boolean menorQue(IOrdenable otro) {
		if(this.num<((Entero)otro).num)
			return true;
		else
			return false;
	}
	public boolean mayorQue(IOrdenable otro) {
		return this.num>((Entero)otro).num;
	}
	public boolean igualQue(IOrdenable otro) {
		return this.num==((Entero)otro).num;
	}
}
