package Revisao;

import java.util.*;
public class Ex2Java {
	public static void main (String args[])
	{
		Scanner ler = new Scanner(System.in);
		
		float peso = 0;
		float alt = 0;
		float cal = 0;
		
		System.out.println("Digite seu peso: ");
		peso = ler.nextFloat();
		System.out.println("Digite sua Altura: ");
		alt = ler.nextFloat();
		
		cal = peso/(alt*2);
		System.out.println("Seu IMC é: "+cal);
		if(cal<18.5)
		{
			System.out.println("Abaixo do peso");
		}
		if(cal>=18.5 && cal<=25)
		{
			System.out.println("Peso normal");
		}
		if(cal>25 && cal<=30)
		{
			System.out.println("Acima do peso");
		}
		if(cal>30)
		{
			System.out.println("Obeso");
		}
	}
}
