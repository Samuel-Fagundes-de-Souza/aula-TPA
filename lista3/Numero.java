package prjAula03;
import java.util.Scanner;

public class Numero {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		double numero;
		
		System.out.print("Insira qualquer n�mero (abaixo ou acima de zero):");
		numero = in.nextDouble();
		
		if (numero<0) {
			System.out.print("O n�mero � negativo");
		} else {
			if (numero==0){
				System.out.print("O n�mero � neutro");
			} else {
				System.out.print("O n�mero � positivo");
			}
		}
	}

}
