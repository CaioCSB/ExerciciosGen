package Exercicios;

import java.util.*;
public class Ex2Java {
	public static void main (String args[])
	{
		Scanner ler = new Scanner (System.in);
		int x;
		
		for(x=1;x<=10;x++)
		{
			if(x%2==0)
			{
				System.out.printf("\n N�mero par: %d",x);
			}
			else if(x%2==1)
			{
				System.out.printf("\n N�mero �mpar: %d",x);
			}
		}
		System.out.println("\n5 N�meros s�o �mpares");
		System.out.println("\n5 N�meros s�o pares");
	}
}
