package Ex1;

import java.util.*;
public class Ex1Java {
	public static void main (String args[])
	{
		Scanner ler = new Scanner (System.in);
		int num1,num2,num3,mn = 0;
		
		System.out.printf("Coloque o primeiro n�mero: ");
		num1 = ler.nextInt();
		ler.nextLine();
		System.out.printf("Coloque o segundo n�mero: ");
		num2 = ler.nextInt();
		ler.nextLine();
		System.out.printf("Coloque o terceiro n�mero: ");
		num3 = ler.nextInt();
		
		if(num1>num2)
		{
			mn = num1;
			if(num1>num3)
			{
				mn = num1;
			}
		}
		if(num2>num1)
		{
			mn = num2;
			if(num2>num3)
			{
				mn = num2;
			}
		}
		if(num3>num1)
		{
			mn = num3;
			if(num3>num2)
			{
				mn = num3;
			}
		}
		
		
		System.out.printf("O maior n�mero digitado �: %d",mn);
	}
}
