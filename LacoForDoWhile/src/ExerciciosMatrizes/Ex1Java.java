package ExerciciosMatrizes;

import java.util.*;
public class Ex1Java {
	public static void main(String args[])
	{
	
		Scanner ler = new Scanner(System.in);
		
		int[] a = {1,0,5,-2,-5,7};
		int soma = 0;
		
		for(int i=0;i<a.length;i++)
		{
			soma = a[0]+a[1]+a[4];
			a[3] = 100;
		}
		for(int i : a) 
		{
			System.out.println(i);
		}
		System.out.printf("A soma dentre as posições desejadas foi: %d",soma);
	}
}
