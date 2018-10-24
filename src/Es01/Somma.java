package Es01;

import prog.io.*;

/**
 * Questo programma riceve in input dall'utente  due numeri
 * interi e ne mostra la somma.
 */
public class Somma {
	public static void main(String[] args) {
		ConsoleInputManager in = new ConsoleInputManager();
		ConsoleOutputManager out = new ConsoleOutputManager();
		
		// Chiedo all'utente i due numeri interi
		int a = in.readInt("Scrivi a: ");
		int b = in.readInt("Scrivi b: ");

		out.printf("%d + %d = %d\n", a, b, a+b);
	}
}
