package Ex1;

import java.util.*;
public class Ex1Java {
	public static void main (String args[])
	{
		Scanner ler = new Scanner (System.in);
		int num1,num2,num3,mn = 0;
		
		System.out.printf("Coloque o primeiro número: ");
		num1 = ler.nextInt();
		ler.nextLine();
		System.out.printf("Coloque o segundo número: ");
		num2 = ler.nextInt();
		ler.nextLine();
		System.out.printf("Coloque o terceiro número: ");
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
		
		
		System.out.printf("O maior número digitado é: %d",mn);
	}
}
