package Es07;

import prog.io.*;
import prog.utili.*;

/**
 * Questo programma richiede n all'utente e calcola il numero
 * della serie armonica H(n). L'output viene restituito sotto forma
 * di frazione e double.
 */
public class NumeroArmonico {
	public static void main(String[] args) {
		ConsoleInputManager in = new ConsoleInputManager();
		ConsoleOutputManager out = new ConsoleOutputManager();

		// Chiediamo n all'utente, se è minore di 1 diamo errore e usciamo.
		int n = in.readInt("Calcoliamo il numero armonico H(n). Inserisci n: ");
		if(n < 1) {
			out.println("n non valido, dev'essere un intero positivo >= 1. Adios!");
			return;
		}

		// Calcoliamo il risultato...
		Frazione frazione = new Frazione(1);

		for(int i = 2; i <= n; i++) {
			frazione = frazione.piu(new Frazione(1,i));
		}

		// ... e lo mostriamo all'utente.
		out.printf("H(n) come frazione e' %d/%d\n", frazione.getNumeratore(), frazione.getDenominatore());
		out.printf("H(n) come double e' %f\n", (double)frazione.getNumeratore() / (double)frazione.getDenominatore());
	}
}
