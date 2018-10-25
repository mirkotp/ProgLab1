package Es10;

import prog.io.*;

/**
 * Come EstraiCifre ma le cifre vengono stampate in ordine inverso.
 */
public class EstraiCifreInvertito {
	public static void main(String[] args) {
		ConsoleInputManager in = new ConsoleInputManager();
		ConsoleOutputManager out = new ConsoleOutputManager();

		int num = in.readInt("Inserisci un numero: ");
		
		if(num >= 0) {
			out.println("Il numero e' positivo.");
		} else {
			out.println("Il numero e' negativo.");
		}

		// Tutto uguale a EstraiCifre, ma in questo caso stampo le cifre 
		// in ordine inverso.
		// Il trucco qui è non mandare il testo direttamente in output ma 
		// salvare tutto in una stringa, concatenando ogni nuova riga 
		// all'inizio di essa...
		num = num >= 0 ? num : -num;
		
		int counter = 0;
		int resto = 0;
		int esp = 1;
		String output = "";
		do {
			resto = (num % (esp*10)) / (esp);

			output = "La cifra in posizione [" + counter + "] e' " + resto + ".\n" + output;

			counter++;
			esp *= 10;
		} while(esp <= num);

		// ... per poi stampare tutto insieme alla fine.
		out.print(output);
	}
}
