package Exercicios;

import java.util.Scanner;

public class Exercicio7 {

	public static void main(String[] args) {
		// EXERC�CO 7
		// RECEBER VALORES DE BASE E ALTURA DE UM TRI�NGULO E VERIFICAR SE S�O VALORES
		// V�LIDOS
		// (POSITIVOS MAIORES QUE 0). EM CASO AFIRMATIVO, CALCULAR A �REA DO TRI�NGULO.

		float base, altura, area;

		Scanner leia = new Scanner(System.in);

		System.out.println("-------------------------------");
		System.out.println("CALCULO DA �REA DO TRI�NGULO");
		System.out.println("-------------------------------");

		System.out.println("Informe o valor da base: ");
		base = leia.nextFloat();

		System.out.println("Informe o valor da altura: ");
		altura = leia.nextFloat();

		if (base > 0) {
			if (altura > 0) {
				area = (base + altura) / 2;
				System.out.println("--------> �REA = " + area);
			} else {
				System.out.println("N�mero inv�lido! Informe novamente o valor da altura: ");
				altura = leia.nextFloat();

				area = (base + altura) / 2;
				System.out.println("--------> �REA = " + area);
			}
		} else {
			System.out.println("N�mero inv�lido! Informe novamente o valor da base: ");
			base = leia.nextFloat();

			area = (base + altura) / 2;
			System.out.println("--------> �REA = " + area);

		}

	}

}
