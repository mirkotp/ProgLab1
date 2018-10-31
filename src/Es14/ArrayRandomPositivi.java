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

		int max = in.readInt("Inserisci il valore massimo (verra' usato il valore assoluto): ");
		max = Math.abs(max);

		int[] casuali = new int[dimensione];

		Random rnd = new Random();

		for(int i = 0; i < dimensione; i++) {
			casuali[i] = rnd.nextInt(max);
		}

		out.println("Array generato:");
		String output = "[";
		for(int n : casuali) {
			output += n + ",";
		}
		output += "]";

		out.println(output);
	}
}
