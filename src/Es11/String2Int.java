package Es11;

import prog.io.*;

/**
 * Questo programma è un grado di parsare un numero intero
 * inserito dall'utente sotto forma di stringa.
 * Il numero può essere negativo e la stringa può avere 
 * spazi in testa o in coda.
 */
public class String2Int {
	public static void main(String[] args) {
		ConsoleInputManager in = new ConsoleInputManager();
		ConsoleOutputManager out = new ConsoleOutputManager();

		// Prendiamo in input una stringa e la puliamo direttamente da
		// eventuali spazi a inizio o fine stringa con trim();
		String num = in.readLine("Inserisci un numero: ").trim();

		// Qui teniamo il risultato.
		int numInt = 0;

		// Qui teniamo l'esponente che moltiplica l'ultima cifra parsata.
		int currentEsp = 1;

		for (int i = num.length()-1; i >= 0; i--) {
			char current = num.charAt(i);
			int cifra = current - 48;

			if(cifra >= 0 && cifra <= 9) {
				numInt += cifra * currentEsp;
			} else {
				// Il carattere non è una cifra!
				//
				// Normalmente qui si da errore e si esce, gli unici casi
				// dove ciò non succede è se becchiamo il segno meno o il segno più
				// e se questo si trova rigorosamente a inizio stringa.
				// In questo caso lasciamo com'è (+) o invertiamo il numero (-).
				if(i == 0 && (current == '-' || current == '+')) {
					numInt = current == '-' ? numInt * -1: numInt;
				} else {
					out.println("Hai inserito una schifezza!");
					return;
				}
			}

			// Moltiplichiamo il nostro esponente per il prossimo 
			// (eventuale) passaggio.
			currentEsp *= 10;
		}

		// Stampo il risultato
		out.printf("La cifra inserita e' %d.\n", numInt);
	}
}
