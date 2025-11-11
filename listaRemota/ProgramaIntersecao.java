package exerciciosRemoto;

import java.util.Scanner;

public class ProgramaIntersecao {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		
		int a[], b[], i;
		double c[];
		final int TAM = 10;
		a = new int [TAM];
		b = new int [TAM];
		c = new double [TAM];
		
		for (i=0; i<TAM; i++) {
			System.out.println("Insira o "+ (i + 1) +"º elemento do conjunto A:");
			a[i] = in.nextInt();
		}
		
		for (i=0; i<TAM; i++) {
			System.out.println("Insira o "+ (i + 1) +"º elemento do conjunto B:");
			b[i] = in.nextInt();
		}	
		
		for (i=0; i<TAM; i++) {
			if (a[i] == b[i]) {
				c[i] = a[i];
			} else {
				c[i] = 0.1;
			}
		}
		
		System.out.print("Interseção C [ ");
		for(i=0; i<TAM; i++) {
			if (c[i] != 0.1) {
				System.out.print(c[i]+" ");
			}	
		}
		System.out.print("] ");
	}

}
