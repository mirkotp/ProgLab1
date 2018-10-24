package Es09;

import prog.io.*;
import prog.utili.*;

public class EstraiCifre2 {
	public static void main(String[] args) {
		ConsoleInputManager in = new ConsoleInputManager();
		ConsoleOutputManager out = new ConsoleOutputManager();

		int num = in.readInt("Inserisci un numero: ");
		
		if(num >= 0) {
			out.println("Il numero e' positivo.");
		} else {
			out.println("Il numero e' negativo.");
		}

		// Trovo il valore assoluto
		num = num >= 0 ? num : -num;

		out.println("Estraggo il numero...");
		
		int counter = 0;
		int resto = 0;
		int esp = 1;
		do {
			resto = (num % (esp*10)) / (esp);
			Intero intero = new Intero(resto);
			out.printf("La cifra in posizione [%d] e' %d, cioe' %s.\n", counter, resto, intero.toString());
			counter++;
			esp *= 10;
		} while(esp <= num);
	}
}
