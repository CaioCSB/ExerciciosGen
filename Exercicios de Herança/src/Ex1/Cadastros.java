package Ex1;

public class Cadastros {
	public static void main (String args[])
	{
		Pessoa pessoa01 = new Pessoa();
		pessoa01.setNome("Jubileu");
		pessoa01.setEndereco("Rua do Cachorro quente Nº244");
		pessoa01.setTelefone(40028922);
		
		System.out.println("Nome: "+pessoa01.getNome());
		System.out.println("Endereço: "+pessoa01.getEndereco());
		System.out.println("Telefone: "+pessoa01.getTelefone());
		
		Pessoa pessoa02 = new Pessoa();
		pessoa02.setNome("Jubileia");
		pessoa02.setEndereco("Rua do To com fome Nº Aqui em casa");
		pessoa02.setTelefone(97070-7070);
		
		System.out.println("\nNome: "+pessoa01.getNome());
		System.out.println("Endereço: "+pessoa01.getEndereco());
		System.out.println("Telefone: "+pessoa01.getTelefone());
	}
}
