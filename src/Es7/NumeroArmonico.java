package Es7;

import Es7.Frazione;
import prog.io.ConsoleInputManager;
import prog.io.ConsoleOutputManager;

/**
 * Questo programma determina il numero armonico H(n)
 * una volta ricevuto n dall' utente.
 */
public class NumeroArmonico {
	public static void main(String[] args) {
		ConsoleInputManager in = new ConsoleInputManager();
		ConsoleOutputManager out = new ConsoleOutputManager();

		int n = in.readInt("Calcoliamo il numero armonico H(n). Inserisci n: ");
		Frazione frazione = new Frazione(0,1);

		for(int i = 1; i <= n; i++) {
			frazione.add(new Frazione(1,i));
		}

		out.printf("H(n) come frazione e' %d/%d\n", frazione.getNumeratore(), frazione.getDenominatore());
		out.printf("H(n) come double e' %f\n", frazione.getResultAsDouble());
	}
}
