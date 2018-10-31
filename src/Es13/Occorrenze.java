package Es13;

import prog.io.*;

public class Occorrenze {
	public static void main(String[] args) {
		ConsoleInputManager in = new ConsoleInputManager();
		ConsoleOutputManager out = new ConsoleOutputManager();

		String stringa = in.readLine("Inserisci una stringa: ");
		int occorrenze[] = new int[26];

		for(int i = 0; i < stringa.length(); i++) {
			int c = (int)Character.toLowerCase(stringa.charAt(i)) - 97;

			if(Character.isLetter(stringa.charAt(i))) {
				occorrenze[c]++;
			}
		}
		
		out.println("La stringa e' composta da:");

		for(int i = 0; i < 26; i++) {
			if(occorrenze[i] > 0) {
				out.printf("%c - %d occorrenze.\n", i + 97, occorrenze[i]);
			}
		}

	}
}
