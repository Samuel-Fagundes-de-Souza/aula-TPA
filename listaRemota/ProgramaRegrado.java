package exerciciosRemoto;

import java.util.Scanner;

public class ProgramaRegrado {

	public static void main(String[] args) {
		
		Scanner in = new Scanner (System.in);
		int a[], b[], i;
		final int TAM = 10;
		a = new int [TAM];
		b = new int [TAM];
		
		for (i=0; i<TAM; i++) {
			System.out.println("Insira o "+ (i + 1) +"º número:");
			a[i] = in.nextInt();
			
			if (a[i]%2 == 0) {
				b[i] = 1;
			} else {
				b[i] = 0;
			}
			
		}
		
		for(i=0; i<TAM; i++) {
			System.out.print(b[i]+ " ");
		}	
	}
}
