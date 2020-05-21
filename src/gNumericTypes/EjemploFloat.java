package gNumericTypes;

import libs.Input;

public class EjemploFloat {

	public static void main(String[] args) {
		float f = Input.get_float(); //funcion para recibir un flotante del usuario
		
		float f2 = Input.get_float(); //funcion para recibir un flotante del usuario
		
		Input.print("f/f2 = " + (f/f2)); //funcion para imprimir en consola el cociente de dos flotantes

	}

}
