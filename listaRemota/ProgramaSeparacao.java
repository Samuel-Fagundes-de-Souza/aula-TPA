package exerciciosRemoto;

import java.util.Scanner;

public class ProgramaSeparacao {

	public static void main(String[] args) {
		
		Scanner in = new Scanner (System.in);
		int a[], b[], i, j=0, k=0;
		final int TAM = 20;
		a = new int [TAM];
		b = new int [TAM];
		
		for (i=0; i<TAM; i++) {
			System.out.println("Insira o "+ (i + 1) +"º elemento:");
			a[i] = in.nextInt();
				if (a[i]%2==0) {
					b[j] = a[i];
					j++;
					k = j;
				}
			}
		
		for (i=0; i<TAM; i++) {
			if (a[i]%2!=0) {
				b[k] = a[i];
				k++;
			}
		}
		
		for(j=0; j<TAM; j++) {
    		System.out.print(b[j]+ " ");	
	}
  }
}
