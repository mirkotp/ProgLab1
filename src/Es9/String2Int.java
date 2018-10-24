package Es9;

import prog.io.ConsoleInputManager;
import prog.io.ConsoleOutputManager;

public class String2Int {
	public static void main(String[] args) {
		ConsoleInputManager in = new ConsoleInputManager();
		ConsoleOutputManager out = new ConsoleOutputManager();

		String num = in.readLine("Inserisci un numero: ");
		int numInt = 0;
		int currentEsp = 1;

		for (int i = num.length() -1; i >= 0; i--) {
			char current = num.charAt(i);
			int cifra = current - 48;

			if(cifra >= 0 && cifra <= 9) {
				numInt += (int)cifra * currentEsp;
			} else {
				if(i == 0 && current == '-') {
					numInt *= -1;
				} else {
					out.println("Hai inserito una shifezza, balordo!");
					return;
				}
			}

			currentEsp *= 10;
		}

		out.printf("La cifra inserita e' %d.\n", numInt);
	}
}
