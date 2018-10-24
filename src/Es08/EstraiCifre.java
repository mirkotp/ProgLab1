package Es08;

import prog.io.*;

public class EstraiCifre {
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

			out.printf("La cifra in posizione [%d] e' %d.\n", counter, resto);
			counter++;
			esp *= 10;
		} while(esp <= num);
	}
}
