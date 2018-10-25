package Es06;

import prog.io.*;
import prog.utili.*;

/**
 * Questo programma riceve un input una frazione ed
 * un esponente e calcola il risultato elevando la frazione 
 * per tale esponente.
 */
public class FrazioneEsponente {
	public static void main(String[] args) {
		ConsoleInputManager in = new ConsoleInputManager();
		ConsoleOutputManager out = new ConsoleOutputManager();

		// Acquisisco numeratore e denominatore della frazione.
		int num = in.readInt("Numeratore della frazione? ");
		int den = 0;
		do {
			den = in.readInt("Denominatore della frazione? (diverso da 0) ");
		} while(den == 0);
			
		int esp = in.readInt("Esponente? ");

		// Per facilità di calcolo, se l'esponente è minore di 0
		// inverto la frazione e mi calcolo il valore assoluto 
		// dell'esponente, da usare poi come limite superiore per 
		// il ciclo che farà il calcolo vero e proprio.
		Frazione frazioneDaMoltiplicare = null;
		if(esp >= 0) {
			frazioneDaMoltiplicare = new Frazione(num, den);
		} else {
			frazioneDaMoltiplicare = new Frazione(den, num);
		}
		
		int absEsp = esp >= 0 ? esp : -esp;

		// Dichiaro una nuova frazione di base con valore 1/1
		// questa verrà poi moltiplicata per frazioneDaMoltiplicare.
		// Se per caso l'esponente è 0, non entriamo nemmeno nel ciclo 
		// e viene stampato il risultato 1/1 che è corretto.
		Frazione frazioneRisultato = new Frazione(1);

		for(int i = 1; i <= absEsp; i++) {
			frazioneRisultato = frazioneRisultato.per(frazioneDaMoltiplicare);
		}
		
		// Stampo il risultato
		out.printf("Il valore di %d/%d EXP %d e' %d/%d.\n", num, den, esp, frazioneRisultato.getNumeratore(), frazioneRisultato.getDenominatore());
	}
}
