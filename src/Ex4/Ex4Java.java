package Ex4;

import java.util.*;
public class Ex4Java {
	public static void main (String args[])
	{
		Scanner ler = new Scanner (System.in);
		int num;
		
		System.out.println("Digite um n�mero:");
		num = ler.nextInt();
		
		if(num%2==0)
		{
			System.out.println("\nO n�mero digitado foi: "+num+ "\n� par e a raiz quadrada �: "+Math.sqrt(num));
		}
		else if(num%3==1)
		{
			System.out.println("\nO n�mero digitado foi: "+num+ "\n� �mpar e a raiz quadrada �: "+Math.pow(num,2));
		}
	}
}
