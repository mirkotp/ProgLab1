package Es12;

import prog.io.*;

/**
 * Come String2Int ma in questo caso ci avvaliamo di alcuni metodi
 * della classe Character per facilitarci la vita.
 */
public class String2Int2 {
	public static void main(String[] args) {
		ConsoleInputManager in = new ConsoleInputManager();
		ConsoleOutputManager out = new ConsoleOutputManager();

		String num = in.readLine("Inserisci un numero: ").trim();

		// Tutto esattamente come prima ma in questo caso lascio
		// fare alla classe Character il controllo (isDigit), e 
		// l'estrazione della cifra (getNumericValue).
		int numInt = 0;
		int currentEsp = 1;

		for (int i = num.length()-1; i >= 0; i--) {
			char current = num.charAt(i);

			if(Character.isDigit(current)) {
				numInt += Character.getNumericValue(current) * currentEsp;
			} else {
				if(i == 0 && (current == '-' || current == '+')) {
					numInt = current == '-' ? numInt * -1: numInt;
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
