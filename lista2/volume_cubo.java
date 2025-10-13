package something_right;
import java.util.Scanner;

public class volume_cubo {
    public static void main(String[] args) {
	
	Scanner ler = new Scanner(System.in);
	
	double l, v;
	
	System.out.println("Insira a medida dos lados do cubo");
	l = ler.nextDouble();
	
	v = l*l*l;
	System.out.println("O volume do cubo é: " + v);
	ler.close();

	}

}
