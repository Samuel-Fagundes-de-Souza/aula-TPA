package prjAula4;
import java.util.Scanner;

public class IMC {

}
public static void main(String[] args) {

	Scanner in = new Scanner(System.in);
	double altura, peso, imc;
	
	System.out.print("Insira a distância percorrida:");
	altura = in.nextDouble();
	
	System.out.print("Insira a capacidade do tanque em litros:");
	peso = in.nextDouble();
	
	imc = altura/peso;
	
	if (imc<18.5) {
		System.out.print("Você está com excesso de magreza");
	} else {
		if (imc<25) {
			System.out.print("Você está com o peso normal");
			} else {
				if (imc<30) {
					System.out.print("Você está com excesso de peso");
				} else {
					if (imc<35) {
						System.out.print("Você está com obesidade grau 1");
					} else { 
						if (imc<40) {
							System.out.print("Você está com obesidade grau 2");
						} else {
							System.out.print("Você está com obesidade grau 3");
						}
					}
				}
		}
	}