package Exercicios;

import java.util.*;
public class Ex3Java {
	public static void main (String args[])
	{
		Scanner ler = new Scanner (System.in);
		
		int idade,menor= 0,acima=0;
		System.out.printf("Coloque sua idade:");
		idade = ler.nextInt();
		
		while(idade>=1)
		{
			if(idade<21)
			{
				menor++;
				idade = menor;
			}
			else
			{
				if(idade>50)
				{
				acima++;
				idade = acima;
				}
			}
			System.out.printf("Coloque sua idade:");
			idade = ler.nextInt();
		}
		System.out.printf("\nSua idade �: %d",idade);
		System.out.printf("\nContagem de quantos s�o menor de 21 anos: %d", menor);
		System.out.printf("\nContagem de quantos s�o acima de 50 anos: %d", acima);
	}
}
