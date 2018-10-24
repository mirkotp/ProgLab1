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

		int num = in.readInt("Numeratore della frazione? ");
		int den = 0;
		do {
			den = in.readInt("Denominatore della frazione? (diverso da 0) ");
		} while(den == 0);
			
		int esp = in.readInt("Esponente? ");


		// Se l'esponente è minore di 0 inverto la frazione.
		Frazione frazioneDaMoltiplicare = null;
		if(esp >= 0) {
			frazioneDaMoltiplicare = new Frazione(num, den);
		} else {
			frazioneDaMoltiplicare = new Frazione(den, num);
		}
		
		int absEsp = esp >= 0 ? esp : -esp;
		Frazione frazioneRisultato = new Frazione(1);

		for(int i = 1; i <= absEsp; i++) {
			frazioneRisultato = frazioneRisultato.per(frazioneDaMoltiplicare);
		}


		out.printf("Il valore di %d/%d EXP %d e' %d/%d.\n", num, den, esp, frazioneRisultato.getNumeratore(), frazioneRisultato.getDenominatore());
	}
}
