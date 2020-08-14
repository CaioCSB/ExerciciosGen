package Ex1;

public class CadCliente {
	public static void main(String args[])
	{
		Cliente cliente01 = new Cliente("Jubileu Júnior de Souza", "449.449.499.49", "14-08-2020");
		System.out.println(cliente01.getNomeCompleto());
		System.out.println(cliente01.getCpf());
		System.out.println(cliente01.getDataDeCadastro());
	}
}
