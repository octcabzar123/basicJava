package gNumericTypes;

import libs.Input;

public class Ints {

	public static void main(String args[])
	{
		// prompt user for x
		System.out.print("x is "); //función para imprimr en consola
	    int x = Input.get_int(); //función para recibir un flotante del usuario
	    
	    // prompt user for y
	    System.out.print("y is "); //función para imprimr en consola
	    int y = Input.get_int(); //función para recibir un flotante del usuario
	    
	    // perform calculations for user
	    System.out.print(x + " plus " + y + " is " + (x + y) + "\n"); //función para imprimr en consola
	    System.out.print(x + " minus " + y + " is " + (x - y) + "\n"); //función para imprimr en consola
	    System.out.print(x + " times " + y + " is " + (x * y) + "\n"); //función para imprimr en consola
	    System.out.print(x + " divided by " + y + " is " + (x / y) + "\n"); //función para imprimr en consola
	    System.out.print("The reminder of " + x + " over "+ y + " is " + (x % y) + "\n"); //función para imprimr en consola
	}
}


