package exerciciosRemoto;

import java.util.Scanner;

public class ProgramaMaisRegrado {

	public static void main(String[] args) {
		
		Scanner in = new Scanner (System.in);
		int a[], b[], c[], i;
		final int TAM = 10;
		a = new int [TAM];
		b = new int [TAM];
		c = new int [TAM];
		
		for (i=0; i<TAM; i++) {
			System.out.println("Insira o "+ (i + 1) +"º número do vetor A:");
			a[i] = in.nextInt();
			System.out.println("Insira o "+ (i + 1) +"º número do vetor B:");
			b[i] = in.nextInt();
			
			if (a[i]>b[i]) {
				c[i] = 1;
			} else if (a[i] == b[i]) {
				c[i] = 0;
			} else {
				c[i] = -1;
			}
			
		}
		
		for(i=0; i<TAM; i++) {
			System.out.print(c[i]+ " ");
		}	
	}
}