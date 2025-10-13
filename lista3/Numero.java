package prjAula03;
import java.util.Scanner;

public class Numero {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		double numero;
		
		System.out.print("Insira qualquer número (abaixo ou acima de zero):");
		numero = in.nextDouble();
		
		if (numero<0) {
			System.out.print("O número é negativo");
		} else {
			if (numero==0){
				System.out.print("O número é neutro");
			} else {
				System.out.print("O número é positivo");
			}
		}
	}

}
