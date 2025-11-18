package exerciciosRemoto;

import java.util.Scanner;

public class ProgramaIntersecao {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);

		int a[], b[], c[], i, j=0;
        int TAM = 10;
		a = new int [TAM];
		b = new int [TAM];
		c = new int [TAM];

		for (i=0; i<TAM; i++) {
			System.out.println("Insira o "+ (i + 1) +"º elemento do conjunto A:");
			a[i] = in.nextInt();
		}

		for (i=0; i<TAM; i++) {
			System.out.println("Insira o "+ (i + 1) +"º elemento do conjunto B:");
			b[i] = in.nextInt();
			b[j] = b[i];
		}	

		for (i=0; i<TAM; i++) {
			for (j=0; j<TAM; j++) {
				if (a[i] == b[j]) {
					c[i] = a[i];
				}
			}

		}

		System.out.print("Interseção C [ ");
		for(i=0; i<TAM; i++) {
				System.out.print(c[i]+" ");
		}
		System.out.print("] ");
	}

}
