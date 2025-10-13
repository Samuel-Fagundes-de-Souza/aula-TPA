package prjAula4;
import java.util.Scanner;

public class Idade {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		double idade;
		
		System.out.print("Insira a sua idade:");
		idade = in.nextDouble();
		
		if (idade<=9) {
			System.out.print("Criança");
		} else {
			if (idade<=17) {
				System.out.print("Adolescente");
			} else {
				if (idade<=59) {
					System.out.print("Adulto");
				} else {
					System.out.print("Idoso");
				}
			}
		}
	}

}