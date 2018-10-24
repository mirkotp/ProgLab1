package Es10;

import prog.io.*;

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

		// Trovo il valore assoluto
		num = num >= 0 ? num : -num;

		out.println("Estraggo il numero...");
		
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

		out.print(output);
	}
}
