package Exercicios;

public class Ex1Java {
	public static void main (String args [])
	{
		int x;
		
		for(x=1000;x<=1999;x++)
		{
			if(x%11==5)
			{
				System.out.printf("\nOs n�meros com o resto 5 s�o: %d",x);
			}
		}
	}
}
