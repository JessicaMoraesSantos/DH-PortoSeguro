package Exercicios;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		//EXERC�CIO 5
		
		float indicePoluicao;
		
		Scanner leitor = new Scanner (System.in);
		
		System.out.println("--------------------");
		System.out.println("�NIDICE DE POLUI��O");
		System.out.println("--------------------");
		
		System.out.println("Informe o �ndice de polui��o: ");
		indicePoluicao = leitor.nextFloat();
		/*
		if(indicePoluicao < 0.25)
		{
			System.out.println("\n ----> �ndice aceit�vel");
		}
		else if(indicePoluicao >= 0.3 && indicePoluicao < 0.4)
		{
			System.out.println("\n ----> Ind�strias do 1� grupo devem suspender suas atividades");
		}
		else if(indicePoluicao >= 0.4 && indicePoluicao < 0.5)
		{
			System.out.println("\n ----> Ind�strias do 1� e 2� grupos devem suspender suas atividades");
		}
		else if(indicePoluicao >= 0.5)
		{
			System.out.println("\n ----> Ind�strias do 1�, 2� e 3� grupos devem suspender suas atividades");
		}*/
		
		if(indicePoluicao < 0.25)
		{
			System.out.println("\n ----> �ndice aceit�vel");
		}
		else if(indicePoluicao == 0.3f)
		{
			System.out.println("\n ----> Ind�strias do 1� grupo devem ter suas atividades suspensas");
		}
		else if(indicePoluicao == 0.4f)
		{
			System.out.println("\n ----> Ind�strias do 1� e 2� grupo devem ter suas atividades suspensas");
		}
		else if(indicePoluicao >= 0.5f)
		{
			System.out.println("\n ----> Ind�strias do 1�, 2� e 3� grupo devem ter suas atividades suspensas");
		}
	}
}


