package Revisao;

import java.util.*;
public class Ex3Java {
	public static void main(String args[])
	{
		Scanner ler = new Scanner(System.in);
		
		int x = 0,cont25 = 0,cont50 = 0,cont75 = 0,cont100 = 0;
		
		do
		for(x=0;x<=25;x++)
		{
			System.out.println("Digite todos os números sem ser negativos: ");
			x = ler.nextInt();
			cont25++;
			for(x=26;x<=50;x++)
			{	
				System.out.println("Digite todos os números sem ser negativos: ");
				x = ler.nextInt();
				cont50++;
			}
			for(x=51;x<=75;x++)
			{	
				System.out.println("Digite todos os números sem ser negativos: ");
				x = ler.nextInt();
				cont75++;
			}
			for(x=76;x<=100;x++)
			{	
				System.out.println("Digite todos os números sem ser negativos: ");
				x = ler.nextInt();
				cont100++;
			}
		}
		while(x<-1);
		System.out.println("\nQuantos número de 0 a 25 entraram: "+cont50);
		System.out.println("\nQuantos número de 26 a 50 entraram: "+cont75);
		System.out.println("\nQuantos número de 76 a 100 entraram: "+cont100);
	}
}
