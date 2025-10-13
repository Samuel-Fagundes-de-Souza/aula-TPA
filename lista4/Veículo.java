package prjAula4;
	import java.util.Scanner;
	
public class Veículo {

		public static void main(String[] args) {

			Scanner in = new Scanner(System.in);
			double km,l,kml;
			
			System.out.print("Insira a distância percorrida:");
			km = in.nextDouble();
			
			System.out.print("Insira a capacidade do tanque em litros:");
			l = in.nextDouble();
			
			kml = km/l;
			
			if (kml<10) {
				System.out.print("Seu veículo não é econômico");
			} else {
					System.out.print("Seu veículo é econômico");
				}
			}
		}