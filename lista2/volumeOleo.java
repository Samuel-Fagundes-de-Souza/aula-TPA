package something_right;
import java.util.Scanner; 
public class volumeOleo {

	public static void main(String[] args) {
		 Scanner ler= new Scanner(System.in);
		 
		 double r,h,v;
		
		 System.out.println("Insira a altura da lata de �leo:");
		 h = ler.nextDouble();
		 
		 System.out.println("Insira o raio da lata de �leo:");
		 r = ler.nextDouble();
		 
		 v=3.14*r*r*h;
		 System.out.println("O volume da lata de �leo �:" + v);
		 ler.close();
		// TODO Auto-generated method stub

	}

}
