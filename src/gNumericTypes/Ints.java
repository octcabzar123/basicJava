package gNumericTypes;

import libs.Input;

public class Ints {

	public static void main(String args[])
	{
		// prompt user for x
		System.out.print("x is "); //funci�n para imprimr en consola
	    int x = Input.get_int(); //funci�n para recibir un flotante del usuario
	    
	    // prompt user for y
	    System.out.print("y is "); //funci�n para imprimr en consola
	    int y = Input.get_int(); //funci�n para recibir un flotante del usuario
	    
	    // perform calculations for user
	    System.out.print(x + " plus " + y + " is " + (x + y) + "\n"); //funci�n para imprimr en consola
	    System.out.print(x + " minus " + y + " is " + (x - y) + "\n"); //funci�n para imprimr en consola
	    System.out.print(x + " times " + y + " is " + (x * y) + "\n"); //funci�n para imprimr en consola
	    System.out.print(x + " divided by " + y + " is " + (x / y) + "\n"); //funci�n para imprimr en consola
	    System.out.print("The reminder of " + x + " over "+ y + " is " + (x % y) + "\n"); //funci�n para imprimr en consola
	}
}


