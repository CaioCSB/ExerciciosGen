package Ex2;

public class Viagem {
	public static void main (String args[])
	{
		Aviao aviao01 = new Aviao("Guarulhos","Pernambuco");
		System.out.println(aviao01.getAeroporto());
		System.out.println(aviao01.getDestinoPais());
	}
}
