package something_right;
import java.util.Scanner;


public class imc {

 public static void main(String[] args) {
	 Scanner ler= new Scanner(System.in);
			 
			 double peso, h, imc;
			 
			 System.out.println("Insira seu peso:");
			 peso = ler.nextDouble();
			 
			 System.out.println("Digite sua altura");
			 h= ler.nextDouble();
			 
			 imc = peso/h*h;
			 System.out.println("Seu imc é:" + imc);
			 ler.close();
		// TODO Auto-generated method stub

	}

}
