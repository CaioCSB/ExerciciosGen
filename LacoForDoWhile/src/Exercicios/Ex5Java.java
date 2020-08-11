package Exercicios;

import java.util.*;
public class Ex5Java {
	public static void main(String args[])
	{
		Scanner ler = new Scanner(System.in);
		
		int x,soma = 0;
		
		
		do
		{
			System.out.printf("Coloque o número desejado:");
			x = ler.nextInt();
			soma = soma+x;
		}
		while(x!=0);
		System.out.printf("Resultado da soma dos números: %d",soma);
	}
}
