package Es1;

import prog.io.ConsoleInputManager;
import prog.io.ConsoleOutputManager;

/**
 * Questo programma riceve in input dall'utente  due numeri
 * interi e ne mostra la somma.
 */
public class Somma {
	public static void main(String[] args) {

		// Chiedo all'utente i due numeri interi
		ConsoleInputManager in = new ConsoleInputManager();
		ConsoleOutputManager out = new ConsoleOutputManager();
		int a, b;
		
		out.printf("Scrivi a: ");
		a = in.readInt();

		out.printf("Scrivi b: ");
		b = in.readInt();

		out.printf("%d + %d = %d", a, b, a+b);
	}
}
