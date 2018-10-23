package Es2;

import prog.io.ConsoleInputManager;
import prog.io.ConsoleOutputManager;

/**
 * Questo programma chiede all'utente una stringa
 * e la restituisce convertendo i caratteri pari in 
 * mminuscolo e i caratteri dispari in maiuscolo.
 */
public class ConvertiStringa {
	public static void main(String[] args) {
		ConsoleInputManager in = new ConsoleInputManager();
		ConsoleOutputManager out = new ConsoleOutputManager();
		
		// Chiedo all'utente la stringa da convertire.
		String input = in.readLine("Inserisci una stringa: ");

		// Stampo carattere per carattere la nuova stringa.
		for(int i = 0; i < input.length(); i++) {
			if(i % 2 == 0) {	// È pari
				out.printf("%c", Character.toLowerCase(input.charAt(i)));
			} else {				// È dispari
				out.printf("%c", Character.toUpperCase(input.charAt(i)));
			}
		}
	}
}
