package ExerciciosMatrizes;

import java.util.*;
public class Ex3Java {
	public static void main(String args[])
	{
		int[][] matriz = new int [3][3];
		int maior = 0;
		
		Scanner ler = new Scanner(System.in);
		System.out.println("Matriz M[3][3]\n");
		
		for(int linha=0;linha<3;linha++)
		{
			for(int coluna=0;coluna<3;coluna++)
			{
				System.out.printf("Insira o elemento M[%d][%d]: ",linha+1,coluna+1);
				matriz[linha][coluna]=ler.nextInt();
			}
		}
		System.out.println("\n \t A matriz ficou: ");
		for(int linha=0;linha<3;linha++)
		{
			for(int coluna=0;coluna<3;coluna++)
			{
				System.out.printf("\t %d \t",matriz[linha][coluna]);
				if(matriz[linha][coluna]>10)
				{
					maior++;
				}
			}
			System.out.println();
		}
		System.out.println("\nNúmeros maiores que 10 foram mostrados: "+maior);
			
	}
}
