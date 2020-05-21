package gNumericTypes;

import libs.Input;

public class Floats {

	public static void main(String args[])
	{
		// prompt user for x
		System.out.print("x is "); //función para imprimr en consola
	    float x = Input.get_float(); //función para recibir un flotante del usuario
	    
	    // prompt user for y
	    System.out.print("y is "); //función para imprimr en consola
	    float y = Input.get_float(); //función para recibir un flotante del usuario
	    
	    // perform division for user
	    System.out.print(x + " divided by " + y + " is " + ( x / y) + "\n"); //función para imprimir en consola el cociente de dos flotantes
	}
}


