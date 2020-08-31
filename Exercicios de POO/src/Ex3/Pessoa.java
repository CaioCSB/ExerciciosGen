package Ex3;

public class Pessoa {
	public static void main (String args[])
	{
		Celular pessoa01 = new Celular("Número Celular: 97070-7070","Música atual: Surra - Bom dia senhor","E-mail: jubileujrdesouza@gmail.com");
		System.out.println(pessoa01.getNumeroCelular());
		System.out.println(pessoa01.getMusica());
		System.out.println(pessoa01.getEmail());
	}
}
