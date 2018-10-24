package Es8;

import prog.io.ConsoleInputManager;
import prog.io.ConsoleOutputManager;
import prog.utili.Intero;

/**
 * Questo programma riceve un numero dall'utente e determina
 * se è primo.
 */
public class EstraiNumero {
	public static void main(String[] args) {
		ConsoleInputManager in = new ConsoleInputManager();
		ConsoleOutputManager out = new ConsoleOutputManager();

		int num = in.readInt("Inserisci un numero: ");
		
		if(num >= 0) {
			out.println("Il numero e' positivo.");
		} else {
			out.println("Il numero e' negativo.");
		}

		num = Math.abs(num);

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
		} while(esp < num);
	}
}
