package Es15;

import java.util.Random;

import prog.io.*;

public class ArrayRandom {
	public static void main(String[] args) {
		ConsoleInputManager in = new ConsoleInputManager();
		ConsoleOutputManager out = new ConsoleOutputManager();

		int dimensione = in.readInt("Inserisci la dimensione dell' array: ");
		if(dimensione < 0) {
			out.println("La dimensione dell'array dev'essere >= 0.");
			return;
		}

		int max = in.readInt("Inserisci il valore massimo: ");
		max = Math.abs(max);

		int casuali[] = new int[dimensione];

		Random rnd = new Random();

		for(int i = 0; i < dimensione; i++) {
			casuali[i] = rnd.nextInt(max * 2) - max;
		}

		out.println("Array generato:");

		for(int i = 0; i < dimensione; i++) {
			out.printf("%d ", casuali[i]);
		}
	}
}
