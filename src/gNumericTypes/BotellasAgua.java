package gNumericTypes;

import libs.Input;

public class BotellasAgua {

	public static void main(String[] args) {
		int minutos = get_positive_int();
		System.out.println("La cantidad de botellas es: "+minutos*12 + " botellas");
	}
	
	public static int get_positive_int()
	{
	    int n;
	    do
	    {
	    	System.out.print("Dame un número: ");
	        n = Input.get_int();
	    }
	    while (n <= 0);
	    return n;
	}
}
