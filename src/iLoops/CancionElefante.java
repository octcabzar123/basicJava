package iLoops;

public class CancionElefante {

	public static void main(String[] args) {
		String plural = "elefante se columpiaba";
		for(int i =1; i <= 100; i++){
			System.out.println(i + " "+ plural+ " sobre la tela de una ara�a. \n Como ve�a que resist�a fueron a llamar a otro elefante...");
			plural = "elefantes se columpiaban";
		}
		System.out.println("Se acab� la canci�n");
	}
}
