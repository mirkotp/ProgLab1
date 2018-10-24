package Es07;

import prog.io.*;
import prog.utili.*;

public class NumeroArmonico {
	public static void main(String[] args) {
		ConsoleInputManager in = new ConsoleInputManager();
		ConsoleOutputManager out = new ConsoleOutputManager();

		int n = in.readInt("Calcoliamo il numero armonico H(n). Inserisci n: ");
		if(n < 1) {
			out.println("n non valido, dev'essere un intero positivo >= 1. Adios!");
			return;
		}

		Frazione frazione = new Frazione(1);

		for(int i = 2; i <= n; i++) {
			frazione = frazione.piu(new Frazione(1,i));
		}

		out.printf("H(n) come frazione e' %d/%d\n", frazione.getNumeratore(), frazione.getDenominatore());
		out.printf("H(n) come double e' %f\n", (double)frazione.getNumeratore() / (double)frazione.getDenominatore());
	}
}
