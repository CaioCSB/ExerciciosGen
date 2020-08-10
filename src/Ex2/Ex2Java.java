package Ex2;

import java.util.*;
public class Ex2Java {
	public static void main (String args[])
	{
		Scanner ler = new Scanner (System.in);
		int num1,num2,num3,ord1 = 0,ord2 = 0,ord3 = 0;
		
		System.out.printf("Coloque o primeiro número: ");
		num1 = ler.nextInt();
		ler.nextLine();
		System.out.printf("Coloque o segundo número: ");
		num2 = ler.nextInt();
		ler.nextLine();
		System.out.printf("Coloque o terceiro número: ");
		num3 = ler.nextInt();
		
		if(num1<num2)
		{
			if(num2<num3)
			{
				System.out.println(num1+"\n"+num2+"\n"+num3);
			}
			else if (num1<num3)
			{
				System.out.println(num1+"\n"+num3+"\n"+num2);
			}
			else
			{
				System.out.println(num3+"\n"+num1+"\n"+num2);
			}
		}
		else if(num2<num3)
		{
			if(num1<num3)
			{
				System.out.println(num2+"\n"+num1+"\n"+num3);
			}
			else
			{
				System.out.println(num2+"\n"+num3+"\n"+num1);
			}
		}
		else
		{
			System.out.println(num3+"\n"+num2+"\n"+num1);
		}
	}
}
