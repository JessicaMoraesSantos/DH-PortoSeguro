package Exercicios;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		//EXERC�CIO 4
		//FA�A UM SISTEMA QUE LEIA UM N�MERO INTEIRO E MOSTRE UMA MENSAGEM INDICANDO SE ESTE
		//N�MERO � PAR OU �MPAR, E SE � POSITIVO OU NEGATIVO.
		
		int numero;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("--------------------------------------------");
		System.out.println("\tPAR/�MPAR    POSITIVO/NEGATIVO");
		System.out.println("--------------------------------------------");
		
		System.out.println("Informe um n�mero: ");
		numero = leia.nextInt();
		
		if (numero % 2 == 0 ) 
		{
			if (numero > 0 )
			{
				System.out.println("Par\nPositivo");
			}
			else
			{
				System.out.println("Par\nNegativo");
			}
		}
		else
		{
			if (numero < 0)
			{
				System.out.println("Impar\nNegativo");
			}
			else
			{
				System.out.println("Impar\nPositivo");
			}
		}

	}

}
