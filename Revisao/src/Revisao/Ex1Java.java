package Revisao;

import java.util.*;
public class Ex1Java {
	public static void main(String args[])
	{
		Scanner ler = new Scanner (System.in);
		
		int op;
		double val = 0, porc20 = 0.20,porc15 = 0.15,jur = 0.10;
		
		System.out.println("Digite o valor a ser pago: ");
		val = ler.nextInt();
		
		System.out.printf("\n\t Como você deseja efetuar o pagamento\n \n1 -- À vista em dinheiro ou cheque com Desconto \n2 -- À vista no cartão de crédito com Desconto \n3 -- Em duas vezes sem juros \n4 -- Em três vezes com juros");
		op = ler.nextInt();
		switch(op)
		{
		case 1:
			val = val-(val*porc20);
			System.out.println("\nValor total a ser pago é de: "+val);
			break;
		case 2:
			val = val-(val*porc15);
			System.out.println("\nValor total a ser pago é de: "+val);
			break;
		case 3:
			val = val;
			System.out.println("\nValor total a ser pago é de: "+val);
			break;
		case 4:
			val = val+(val*jur);
			System.out.println("\nValor total a ser pago é de: "+val);
			break;
			default:
				System.out.println("Opção inválida");
		}
			
	}
}
