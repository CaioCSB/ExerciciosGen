package Ex4;

import java.util.*;
public class Ex4Java {
	public static void main (String args[])
	{
		Scanner ler = new Scanner (System.in);
		int num;
		
		System.out.println("Digite um número:");
		num = ler.nextInt();
		
		if(num%2==0)
		{
			System.out.println("\nO número digitado foi: "+num+ "\né par e a raiz quadrada é: "+Math.sqrt(num));
		}
		else if(num%3==1)
		{
			System.out.println("\nO número digitado foi: "+num+ "\né ímpar e a raiz quadrada é: "+Math.pow(num,2));
		}
	}
}
