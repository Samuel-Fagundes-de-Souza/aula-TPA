package prjAula07;

import java.util.Scanner;

public class MediaAluno2 {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		double n1, n2, n3, n4, mi, ex, nm;
		
		System.out.print("Insira a nota 1");
		n1 = in.nextDouble();
		
		System.out.print("Insira a nota 2");
		n2 = in.nextDouble();
		
		System.out.print("Insira a nota 3");
		n3 = in.nextDouble();
		
		System.out.print("Insira a nota 4");
		n4 = in.nextDouble();
		
		mi = (n1 + n2 + n3 + n4)/4;
		
		System.out.println(mi);
		
		if (mi >= 7) {
			System.out.println("Aprovado");
		} else {
			if (mi < 5) {
				System.out.println("Reprovado");
			} else {
				System.out.println("Exame");
				
				System.out.print("Insira a nota de exame");
				ex = in.nextDouble();
				
				nm = (mi + ex)/2;
				
				System.out.println(nm);
				
				if (nm >= 7) {
					System.out.println("Aprovado em exame");
				} else {
					System.out.println("Reprovado em exame");
				}
			}
		}
	}

}
