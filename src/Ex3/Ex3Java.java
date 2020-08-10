package Ex3;

import java.util.*;
public class Ex3Java {
	public static void main (String args[])
	{
		Scanner ler = new Scanner (System.in);
		int idade;
		
		System.out.printf("Coloque sua idade: ");
		idade = ler.nextInt();
		
		if(idade<=14)
		{
			System.out.println("Idade infantil");
		}
		if(idade>=15 && idade<=17)
		{
			System.out.println("Idade Juvenil");
		}
		if(idade>=18)
		{
			System.out.println("VAI COMEÇAR A PAGAR BOLETOS...");
		}
	}
}
