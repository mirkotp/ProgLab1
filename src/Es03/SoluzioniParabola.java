package Es03;

import prog.io.*;

/**
 * Questo programma riceve in input dall'utente l'equazione di
 * una parabola e ne calcola le eventuali soluzioni reali.
 */
public class SoluzioniParabola {
	public static void main(String[] args) {
		ConsoleInputManager in = new ConsoleInputManager();
		ConsoleOutputManager out = new ConsoleOutputManager();

		// Chiedo all'utente i parametri della parabola: a, b, c		
		double a = in.readInt("Scrivi a: ");
		double b = in.readInt("Scrivi b: ");
		double c = in.readInt("Scrivi c: ");

		// Calcolo il delta della parabola e in base ad
		// posso mostro il risultato corretto:
		//
		// dt < 0 non ha soluzioni.
		// dt == 0 ha una soluzione.
		// dt > 1 (else) ha due soluzioni.
		double dt = (b * b) - (4 * a * c);

		if (dt < 0) {
			out.println("Non esistono soluzioni reali. (Prova con -a).");
		} else if (dt == 0) {
			out.println("L' equazione ha una sola soluzione.");
			out.printf("X = %.2f \n", (-b) / 2 * a);
		} else {
			out.println("L' equazione ha due soluzioni.");
			out.printf("X1 = %.2f \n", (-b - Math.sqrt(dt)) / 2 * a);
			out.printf("X2 = %.2f \n", (-b + Math.sqrt(dt)) / 2 * a);
		}
	}
}
