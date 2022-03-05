package ConteudoBase;

import java.util.Scanner;

public class Condicionais {

	public static void main(String[] args) {
		
		String nome;
		int opcao;
		double nota1, nota2, nota3, media;
		float n1, n2, resultado = 0;
		
		// ---------------------- IF ---------------------- //
		
		Scanner leia = new Scanner(System.in);
		
		
		System.out.println("Entre com o nome do aluno: ");
		nome = leia.nextLine();
		
		System.out.println("Entre com a primeira nota: ");
		nota1 = leia.nextFloat();
		
		System.out.println("Entre com a segunda nota: ");
		nota2 = leia.nextFloat();
		
		System.out.println("Entre com a terceira nota: ");
		nota3 = leia.nextFloat();
		
		media = (nota1 + nota2 + nota3)/3;
		
		System.out.println("--------------");
		System.out.printf("ALUNO: " + nome + "\nMEDIA = %2.2f", media);
		System.out.println("\n--------------");
		
		if (media <=10 && media >= 7) 
		{
			System.out.println("Aluno Aprovado");
		}
		else if(media < 7 && media >= 5) 
		{
			System.out.println("Aluno de exame");
		}
		else if(media < 5) 
		{
			System.out.println("Aluno reprovado");
		}
		else
			System.out.println("M�dia inv�lida");
		
		
		// ---------------------- SWITCH CASE ---------------------- //
		
		System.out.println("----------------------------");
		System.out.println("\t CALCULADORA");
		System.out.println("----------------------------");
		
		System.out.println("Entre com o primeiro n�mero: ");
		n1 = leia.nextFloat();
		
		System.out.println("Entre com o segundo n�mero: ");
		n2 = leia.nextFloat();
		
		System.out.println("----------------------------");
		System.out.println("\t MENU");
		System.out.println("----------------------------");
		System.out.println("1 - Soma");
		System.out.println("2 - Diferen�a");
		System.out.println("3 - Multiplica��o");
		System.out.println("4 - Divis�o");
		opcao = leia.nextInt();
		
		switch(opcao)
		{
		case 1:
			resultado = n1  + n2;
			break;
			
		case 2:
			resultado = n1  - n2;
			break;
			
		case 3:
			resultado = n1  * n2;
			break;
			
		case 4:
			if (n2 == 0)
			{
				System.out.println("N�o � poss�vel fazer a divis�o por 0");
			}
			else
			{
			resultado = n1  / n2;
			}
			break;
			
		default:
			System.out.println("Op��o inv�lida");
		}
		
		System.out.println("Resultado " + resultado); // Vari�vel precisa ser inicializada, pois em caso de default n�o haver� c�lculo		
	}

}
