package PortoSeguro;

import java.util.Scanner;

public class Metodos {

	public static void main(String[] args) {
		
		// ------------------- M�TODOS ------------------- //
				int x, y;
				double raiz, potencia;
				
				Scanner leia = new Scanner(System.in);
				
				System.out.println("CALCULANDO RA�Z E POT�NCIA\n");
				System.out.println("Informe o valor de X: ");
				x = leia.nextInt();
				System.out.println("Informe o valor de Y: ");
				y = leia.nextInt();
				
				raiz = Math.sqrt(y); //Raiz quadrada
				potencia = Math.pow(x, 3); //Pot�ncia
				
				System.out.printf("Pot�ncia de " + x + " ^3 " + " = " + potencia);
				System.out.println("Ra�z quadrada de " + y + " = " + raiz);
		
	}

}
