package Es11;

import prog.io.*;

public class String2Int {
	public static void main(String[] args) {
		ConsoleInputManager in = new ConsoleInputManager();
		ConsoleOutputManager out = new ConsoleOutputManager();

		// Prendiamo in input una stringa e la puliamo direttamente da
		// eventuali spazi a inizio o fine stringa con trim();
		String num = in.readLine("Inserisci un numero: ").trim();

		int numInt = 0;
		int currentEsp = 1;

		for (int i = num.length()-1; i >= 0; i--) {
			char current = num.charAt(i);
			int cifra = current - 48;

			if(cifra >= 0 && cifra <= 9) {
				numInt += cifra * currentEsp;
			} else {
				if(i == 0 && current == '-') {
					numInt *= -1;
				} else {
					out.println("Hai inserito una schifezza!");
					return;
				}
			}

			currentEsp *= 10;
		}

		out.printf("La cifra inserita e' %d.\n", numInt);
	}
}
