package ExerciciosMatrizes;

import java.util.*;
public class Ex2Java {
	public static void main(String args [])
	{
		Scanner ler = new Scanner(System.in);
		int[] numeros = new int[6];
		int soma = 0,impar=0; 
		for(int i=0;i<6;i++)
		{
			System.out.println("Digite 6 n�meros, um por vez: ");
			numeros[i]=ler.nextInt();
		}
		for(int i=0;i<6;i++)
		{
			if(numeros[i]%2==0)
			{
				System.out.println("\nOs n�meros pares digitados: "+numeros[i]);
				soma = soma+numeros[i];
			}
			else
			{				
				System.out.println("\nOs n�meros �mpares digitados: "+numeros[i]);
				impar++;
			}
		}
		System.out.printf("\nQuantidade de n�meros �mpares digitados: %d",impar);
		System.out.printf("\nA soma dos n�meros pares: %d",soma);
	}
}
