import prog.io.ConsoleInputManager;
import prog.io.ConsoleOutputManager;

/**
 * Questo programma riceve in input dall'utente l'equazione di
 * una parabola e ne calcola le eventuali soluzioni reali.
 */
public class Delta {
	public static void main(String[] args) {

		// Chiedo all'utente i parametri della parabola: a, b, c
		ConsoleInputManager in = new ConsoleInputManager();
		ConsoleOutputManager out = new ConsoleOutputManager();
		double a, b, c;
		
		System.out.printf("Scrivi a: ");
		a = in.readInt();

		System.out.printf("Scrivi b: ");
		b = in.readInt();

		System.out.printf("Scrivi c: ");
		c = in.readInt();

		// Calcolo il delta della parabola e in base ad
		// posso mostro il risultato corretto:
		//
		// dt < 0 non ha soluzioni.
		// dt == 0 ha una soluzione.
		// dt > 1 (else) ha due soluzioni.
		double dt = (b * b) - (4 * a * c);

		if (dt < 0) {
			System.out.println("Non esistono soluzioni reali. (Prova con -a).");
		} else if (dt == 0) {
			System.out.println("L' equazione ha una sola soluzione.");
			System.out.printf("X = %.2f \n", (-b) / 2 * a);
		} else {
			System.out.println("L' equazione ha due soluzioni.");
			System.out.printf("X1 = %.2f \n", (-b - Math.sqrt(dt)) / 2 * a);
			System.out.printf("X2 = %.2f \n", (-b + Math.sqrt(dt)) / 2 * a);
		}
	}
}
