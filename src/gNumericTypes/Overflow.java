package gNumericTypes;

public class Overflow {

	public static void main(String args[])
	{
		int n = 1; // inicializa entero
	    for (int i = 0; i < 64; i++) // ciclo que itera 64 veces
	    {
	    	System.out.print("n: " + n + "\n"); //funci�n que imprime en consola
	        n = n * 2; //funci�n que multiplica por 2 lo que ten�a el entero
	    }
	}
}



