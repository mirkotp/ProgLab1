package Es16;

import java.util.Random;

import prog.io.*;

public class SommaVettori {
	public static void main(String[] args) {
		ConsoleOutputManager out = new ConsoleOutputManager();

		int dimensione = Integer.parseInt(args[0]);
		int max = 100;

		int vettoreA[] = new int[dimensione];
		int vettoreB[] = new int[dimensione];

		Random rnd = new Random();

		for(int i = 0; i < dimensione; i++) {
			vettoreA[i] = rnd.nextInt(max * 2) - max;
			vettoreB[i] = rnd.nextInt(max * 2) - max;
		}

		// Stampo A
		out.printf("a =\t");
		for(int i = 0; i < dimensione; i++) {
			out.printf("%d ", vettoreA[i]);
		}
		out.println();
		// Stampo B
		out.printf("b =\t");
		for(int i = 0; i < dimensione; i++) {
			out.printf("%d ", vettoreB[i]);
		}
		out.println();

		// Stampo Somma
		out.printf("somma =\t");
		for(int i = 0; i < dimensione; i++) {
			out.printf("%d ", vettoreA[i] + vettoreB[i]);
		}
	}
}
