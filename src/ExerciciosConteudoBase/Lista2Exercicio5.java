package Exercicios;

import java.util.Scanner;

public class Lista2Exercicio5 {

	public static void main(String[] args) {
		// EXERC�CIO 5
		
		int numero, soma = 0;
		
		Scanner leitor = new Scanner(System.in);
		
		do
		{
			System.out.println("Digite um n�mero: ");
			numero = leitor.nextInt();
			soma = soma + numero;
		}
		while
			(numero != 0);
		
		System.out.println("\n---------------------------------------------");
		System.out.println("A soma dos n�mero digitados = : " + soma);
		System.out.println("---------------------------------------------");
		
		leitor.close();
	}

}
