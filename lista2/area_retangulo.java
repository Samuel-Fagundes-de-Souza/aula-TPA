package something_right;
import java.util.Scanner;


public class area_retangulo {
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
				
		double base, h, area;
		
		System.out.println("Digite a base do retângulo:");
		base = ler.nextDouble();
		
		System.out.println("Digite a altura do retângulo:");
		h = ler.nextDouble();
		
		area = base * h;
		System.out.println("A base do retângulo é: " + area);
		ler.close();
	}

}
