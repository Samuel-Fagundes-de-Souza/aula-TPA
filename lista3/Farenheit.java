package prjAula03;
import java.util.Scanner;

public class Farenheit {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		double F,C;
		
		System.out.print("Insira a temperatura em Fahrenheit:");
		F = in.nextDouble();
		
		C = (F-32)/1.8;
		
		if (C<15) {
			System.out.print("Está frio " + C);
		} else {
			if (C<22) {
				System.out.print("Está ameno " + C);
			} else {
				System.out.print("Está calor " + C);
			}
		}
	}

}

