package Es05;

import prog.io.*;
import prog.utili.*;

/**
 * Questo programma riceve una serie di frazioni dall'utente
 * e determina la maggiore e la minore.
 */
public class Frazioni {
	public static void main(String[] args) {
		ConsoleInputManager in = new ConsoleInputManager();
		ConsoleOutputManager out = new ConsoleOutputManager();

		// Qui immagazzineremo la frazione minima e massima trovata
		// durante la nostra acquisizione dati.
		Frazione minFrazione = null;
		Frazione maxFrazione = null;

		do {
			// Chiedo i dati della frazione.
			int num = in.readInt("Numeratore? ");
			int den = 0;
			do {
				den = in.readInt("Denominatore? (diverso da 0) ");
			} while(den == 0);
			
			// Istanzio immediatamente una nuova frazione da confrontare con
			// quelle salvate.
			Frazione tempFrazione = new Frazione(num, den);

			// Se la frazione min/max è null (primo giro), salto direttamente
			// confronto e salvo la nuova frazione.
			if(minFrazione == null || minFrazione.isMaggiore(tempFrazione)) {
				minFrazione = tempFrazione;
			}

			if(maxFrazione == null || maxFrazione.isMinore(tempFrazione)) {
				maxFrazione = tempFrazione;
			}
		} while(in.readSiNo("Vuoi inserire una nuova frazione? "));

		// Stampiamo il risultato
		out.printf("La frazione minore e' %d/%d\n", minFrazione.getNumeratore(), minFrazione.getDenominatore());
		out.printf("La frazione maggiore e' %d/%d\n", maxFrazione.getNumeratore(), maxFrazione.getDenominatore());
	}
}
