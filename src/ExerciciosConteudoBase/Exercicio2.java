package ExerciciosConteudoBase;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		//EXERC�CIO 2
		
		int codigoOperario, numeroHorasTrabalhadas;
		float valorExcedido, salario, salarioTotal, salarioExcedente;
		
		Scanner leitor = new Scanner (System.in);
		
		System.out.println("\nInforme o c�digo do oper�rio: ");
		codigoOperario = leitor.nextInt();
		
		System.out.println("\nInforme o n�mero de horas trabalhadas: ");
		numeroHorasTrabalhadas = leitor.nextInt();

		
		
		if(numeroHorasTrabalhadas < 50)
		{
			salario = numeroHorasTrabalhadas * 10;
			valorExcedido = 0;
			salarioExcedente = 0;
			salarioTotal = salario + salarioExcedente;
			System.out.println("----------------------------");
			System.out.println("C�digo do oper�rio: " + codigoOperario + "\nSal�rio excedente: R$ " + valorExcedido + "\nSal�rio total: R$ " + salarioTotal);
			System.out.println("----------------------------");
		}
		else
		{
			valorExcedido = numeroHorasTrabalhadas - 50;
			salarioExcedente = valorExcedido * 20;
			salario = (numeroHorasTrabalhadas - valorExcedido) * 10;
			salarioTotal = salario + salarioExcedente;
			System.out.println("----------------------------");
			System.out.println("C�digo do oper�rio: " + codigoOperario + "\nSal�rio excedente: R$ " + salarioExcedente + "\nSal�rio total: R$ " + salarioTotal);
			System.out.println("----------------------------");
			
		}
		leitor.close();
	}

}
