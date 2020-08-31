package Ex1;

public class PagamentoFornecedor {
	public static void main(String args[])
	{
		Fornecedor for1 = new Fornecedor();
		for1.setNome("Jubileu");
		for1.setEndereco("Rua do Cachorro quente Nº244");
		for1.setTelefone(4002_8922);
		
		for1.setValorCredito(20.000);
		for1.setValorDivida(10.000);
		
		System.out.println("Nome: "+for1.getNome());
		System.out.println("Endereço: "+for1.getEndereco());
		System.out.println("Telefone: "+for1.getTelefone());
		System.out.printf("Valor do Crédito: R$%.3f",for1.getValorCredito());
		System.out.printf("\nValor da Divida: R$%.3f",for1.getValorDivida());
	}
}
