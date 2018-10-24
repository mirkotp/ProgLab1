package Es5;

import prog.io.ConsoleInputManager;
import prog.io.ConsoleOutputManager;

/**
 * Questo programma riceve una serie di frazioni dall'utente
 * e determina la maggiore e la minore.
 */
public class Frazioni {
	public static void main(String[] args) {
		ConsoleInputManager in = new ConsoleInputManager();
		ConsoleOutputManager out = new ConsoleOutputManager();

		double minNum = 0, minDen = 0;
		double maxNum = 0, maxDen = 0;

		Boolean exit = false;
		do {
			double tempNum = in.readInt("Numeratore? ");

			double tempDen;
			do {
				tempDen = in.readInt("Denominatore (diverso da 0)? ");
			} while(tempDen == 0);

			if(minDen == 0 || (tempNum/tempDen < minNum/minDen)) {
				minNum = tempNum;
				minDen = tempDen;
			}

			if(maxDen == 0 || (tempNum/tempDen > maxNum/maxDen)) {
				maxNum = tempNum;
				maxDen = tempDen;
			}

			exit = in.readSiNo("Vuoi inserire una nuova frazione? ");
		} while(exit);

		out.printf("La frazione minore e' %.0f/%.0f\n", minNum, minDen);
		out.printf("La frazione maggiore e' %.0f/%.0f\n", maxNum, maxDen);
	}
}
