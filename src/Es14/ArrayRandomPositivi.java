package Es14;

import java.util.Random;

import prog.io.*;

public class ArrayRandomPositivi {
	public static void main(String[] args) {
		ConsoleInputManager in = new ConsoleInputManager();
		ConsoleOutputManager out = new ConsoleOutputManager();

		int dimensione = in.readInt("Inserisci la dimensione dell' array: ");
		if(dimensione < 0) {
			out.println("La dimensione dell'array dev'essere >= 0.");
			return;
		}

		int max = in.readInt("Inserisci il valore massimo: ");
		int casuali[] = new int[dimensione];

		Random rnd = new Random();

		for(int i = 0; i < dimensione; i++) {
			casuali[i] = rnd.nextInt(max);
		}

		out.println("Array generato:");

		for(int i = 0; i < dimensione; i++) {
			out.printf("%d ", casuali[i]);
		}
	}
}
