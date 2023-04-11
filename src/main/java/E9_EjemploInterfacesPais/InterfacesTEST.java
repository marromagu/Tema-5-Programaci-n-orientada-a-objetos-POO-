package E9_EjemploInterfacesPais;

public class InterfacesTEST {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Entero e1=new Entero(5);
		Entero e2=new Entero(2);
		Entero e3=new Entero(1);
		
		Pais p1=new Pais("España",390000000);
		Pais p2=new Pais("Portugal",12000000);
		
		System.out.println("\nN�meros enteros");
		e1.mostrar();
		e2.mostrar();
		e3.mostrar();
				
		if(e1.menorQue(e2))
			System.out.println("e1 es menor que e2");
		else
			System.out.println("e1 NO es menor que e2");
		
		System.out.println("\n\nPa�ses");
		p1.mostrar();
		p2.mostrar();
		
		if(p1.mayorQue(p2))
			System.out.println("p1 tiene m�s habitantes que p2");
		else
			System.out.println("p1 NO tiene m�s habitantes que p2");

		IOrdenable [] vec=new IOrdenable[5];
		
		if(p1.mayorQue(e1))
			System.out.println("Hola");
	}

}
