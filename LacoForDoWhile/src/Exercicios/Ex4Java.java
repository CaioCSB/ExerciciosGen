package Exercicios;

import java.util.*;
public class Ex4Java {
	public static void main(String args[])
	{
		Scanner ler = new Scanner(System.in);
		
		int idade,sexo,sit,cal=0,mner=0,hagr=0,sexot=0,neracima=0,calabaixo=0,x=1;
		
		
		while (x<=150)
		{
			System.out.printf("\nColoque sua idade:");
			idade = ler.nextInt();
			System.out.printf("\nColoque seu genero sexual / 1 - Homem / 2 - Mulher / 3 - Outros:");
			sexo = ler.nextInt();
			System.out.printf("\nIndique em qual você se identificou // 1 - Uma pessoa calma / 2 - Uma pessoa nervosa / 3 - Uma pessoa agressiva");
			sit = ler.nextInt();
			if(sit == 1)
			{
				cal++;
			}
			if(sexo == 2 && sit == 2)
			{
				mner++;
			}
			if(sexo == 1 && sit == 3)
			{
				hagr++;
			}
			if(sexo == 3 && sit == 1)
			{
				sexot++;
			}
			if(sit == 2 && idade>40)
			{
				neracima++;
			}
			if(sit == 1 && idade<18)
			{
				calabaixo++;
			}
			x++;
		}
		System.out.println("\nNúmero de pessoas calmas: "+cal);
		System.out.println("\nNúmero de Mulheres nervosas: "+cal);
		System.out.println("\nNúmero de Homens agressivos: "+cal);
		System.out.println("\nNúmero de Outros calmos: "+cal);
		System.out.println("\nNúmero de Pessoas nervosas com mais de 40 anos: "+cal);
		System.out.println("\nNúmero de Pessoas calmas com menos de 18 anos: "+cal);
	}
}
