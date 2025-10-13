package something_right;
import java.util.Scanner; 
public class volumeOleo {

	public static void main(String[] args) {
		 Scanner ler= new Scanner(System.in);
		 
		 double r,h,v;
		
		 System.out.println("Insira a altura da lata de óleo:");
		 h = ler.nextDouble();
		 
		 System.out.println("Insira o raio da lata de óleo:");
		 r = ler.nextDouble();
		 
		 v=3.14*r*r*h;
		 System.out.println("O volume da lata de óleo é:" + v);
		 ler.close();
		// TODO Auto-generated method stub

	}

}
