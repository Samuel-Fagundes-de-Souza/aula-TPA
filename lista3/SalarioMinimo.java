package prjAula03;
import java.util.Scanner;

public class SalarioMinimo {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		double salario;
		
		System.out.print("Insira seu sal�rio:");
		salario = in.nextDouble();
		
		if (salario<1302) {
			System.out.print("Seu sal�rio est� abaixo do sal�rio m�nimo(R$1302,00)");
		} else {
			System.out.print("Seu sal�rio est� acima do sal�rio m�nimo(R$1302,00)");
		}
	}

}
