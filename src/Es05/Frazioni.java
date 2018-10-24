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

		Frazione minFrazione = null;
		Frazione maxFrazione = null;

		do {
			int num = in.readInt("Numeratore? ");
			int den = 0;
			do {
				den = in.readInt("Denominatore? (diverso da 0) ");
			} while(den == 0);
			
			
			Frazione tempFrazione = new Frazione(num, den);

			if(minFrazione == null || minFrazione.isMaggiore(tempFrazione)) {
				minFrazione = tempFrazione;
			}

			if(maxFrazione == null || maxFrazione.isMinore(tempFrazione)) {
				maxFrazione = tempFrazione;
			}
		} while(in.readSiNo("Vuoi inserire una nuova frazione? "));

		out.printf("La frazione minore e' %d/%d\n", minFrazione.getNumeratore(), minFrazione.getDenominatore());
		out.printf("La frazione maggiore e' %d/%d\n", maxFrazione.getNumeratore(), maxFrazione.getDenominatore());
	}
}
