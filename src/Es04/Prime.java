package Es04;

import prog.io.*;

/**
 * Questo programma riceve un numero dall'utente e determina
 * se è primo.
 */
public class Prime {
	public static void main(String[] args) {
		ConsoleInputManager in = new ConsoleInputManager();
		ConsoleOutputManager out = new ConsoleOutputManager();

		int num = in.readInt("Inserisci un numero: ");

		// Determino se il numero è primo controllando il resto
		// della divisione con tutti i numeri che potrebbero essere suoi 
		// divisori (da 2 a num/2).
		for(int i = 2; i <= (num/2); i++) {
			if(num % i == 0) {
				out.printf("%d non e' un numero primo.\n", num);
				return;
			}
		}

		out.printf("%d e' un numero primo.\n", num);
	}
}
