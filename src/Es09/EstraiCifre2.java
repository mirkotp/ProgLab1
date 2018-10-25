package Es09;

import prog.io.*;
import prog.utili.*;

/**
 * Come EstraiCifre, ma questa volta stampiamo anche il numero in lettere.
 */
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

		// Tutto come nell'esercizio precedente ma ora mi avvalgo della classe Intero
		// e del suo metodo toString() per stampare ogni cifra anche in lettere.
		num = num >= 0 ? num : -num;
		
		int counter = 0;
		int resto = 0;
		int esp = 1;
		do {
			resto = (num % (esp*10)) / (esp);

			out.printf("La cifra in posizione [%d] e' %d, cioe' %s.\n", counter, resto, new Intero(resto).toString());
			counter++;
			esp *= 10;
		} while(esp <= num);
	}
}
