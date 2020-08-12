package ExerciciosMatrizes;

import java.util.*;
public class Ex4Java {
	public static void main(String args[])
	{
		float matrizA[][] = new float[2][2];
		float matrizB[][] = new float[2][2];
		float matrizC[][] = new float[2][2];
		float val;
		
		int op; // testando com o switch
		
		Scanner ler = new Scanner (System.in);
		
		for(int x=0;x<2;x++)
		{
			for(int y=0;y<2;y++)
			{
				System.out.println("Matriz A:");
				matrizA[x][y] = ler.nextFloat();
				System.out.println("Matriz B:");
				matrizB[x][y] = ler.nextFloat();
			}
		}
		
		System.out.printf("1 -- Soma as Matrizes\n2 -- Subtrai as Matrizes\n3 -- Adicionar uma constante as duas matrizes");
		op = ler.nextInt();
		switch(op)
		{
		case 1:
			for(int x=0;x<2;x++)
			{
				for(int y=0;y<2;y++)
				{
					matrizC[x][y] = matrizA[x][y]+matrizB[x][y];
					System.out.println("Soma das matrizes: "+matrizC[x][y]);
				}
			}
			break;
		case 2:
			for(int x=0;x<2;x++)
			{
				for(int y=0;y<2;y++)
				{
					matrizC[x][y] = matrizA[x][y]-matrizB[x][y];
					System.out.println("Soma das matrizes: "+matrizC[x][y]);
				}
			}
			break;
		case 3:
			System.out.println("Entre com um valor: ");
			val = ler.nextFloat();
			for(int x=0;x<2;x++)
			{
				for(int y=0;y<2;y++)
				{
					matrizA[x][y] = matrizA[x][y]+val;
					System.out.println("Soma das matrizes: "+matrizC[x][y]);
				}
			}
		case 4:
			for(int x=0;x<2;x++)
			{
				for(int y=0;y<2;y++)
				{
					System.out.println("MatrizA: "+matrizA[x][y]);
					
				}
			}
			for(int x=0;x<2;x++)
			{
				for(int y=0;y<2;y++)
				{
					System.out.println("MatrizB: "+matrizB[x][y]);
				}
			}
			break;
			default:
				System.out.println("Opção inválida :D");
		}
	}
}
