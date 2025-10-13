package prjAula03;
import java.util.Scanner;

public class SalarioMinimo {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		double salario;
		
		System.out.print("Insira seu salário:");
		salario = in.nextDouble();
		
		if (salario<1302) {
			System.out.print("Seu salário está abaixo do salário mínimo(R$1302,00)");
		} else {
			System.out.print("Seu salário está acima do salário mínimo(R$1302,00)");
		}
	}

}
