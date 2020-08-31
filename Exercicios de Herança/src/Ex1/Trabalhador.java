package Ex1;

public class Trabalhador {
	public static void main(String args[])
	{
		Empregado p1 = new Empregado();
		p1.setNome("Jubileu");
		p1.setEndereco("Rua do Cachorro quente Nº244");
		p1.setTelefone(40028922);
	
		p1.setCodigoSetor(5);
		p1.setSalarioBase(1.100);
		p1.setImposto(2);
		p1.setSalcal(1.500);
		
		System.out.println("Nome: "+p1.getNome());
		System.out.println("Endereço: "+p1.getEndereco());
		System.out.println("Telefone: "+p1.getTelefone());
		System.out.printf("Código do Setor: %d",p1.getCodigoSetor());
		System.out.printf("\nSalário base: R$%.3f",p1.getSalarioBase());
		System.out.printf("\nSálario total: R$%.3f",p1.getSalcal());

	}
}
