package Exercicios;

import java.util.Scanner;

public class Exercicio8 {

	public static void main(String[] args) {
		//EXERC�CO 8
		//L� UMA VARI�VEL NUM�RICA N E IMPRIME SOMENTE SE A MESMA FOR MAIOR QUE 100,
		//CASO CONTR�RIO IMPRIME COM VALOR 0.

		
		float N;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Informe um n�mero");
		N = leia.nextFloat();
		
		if(N > 100)
		{
			System.out.println("\nN�MERO MAIOR QUE 100");
			System.out.println("*************************");
			System.out.println(N);
			System.out.println("*************************");
		}
		else
		{
			N = 0;
			System.out.println(N);
		}
	}

}
