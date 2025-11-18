package exerciciosRemoto;

import java.util.Scanner;

public class ProgramaTabuadaVetor {
	
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		
		int a[], i, r, t;
		final int TAM = 5;
		a = new int [TAM];
		
		for (i=0; i<TAM; i++) {
			System.out.println("Insira o "+ (i + 1) +"º número:");
			a[i] = in.nextInt();
		}
		
		for (i=0; i<TAM; i++) {
			System.out.println(" ");
			for (t=1; t<11; t++) {
				r = a[i] * t;
				System.out.println(r);
			}
		}
	}
}
