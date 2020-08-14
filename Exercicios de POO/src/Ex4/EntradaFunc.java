package Ex4;

public class EntradaFunc {
	public static void main (String args[])
	{
		Funcionario pessoa1 = new Funcionario("Nome do Funcionario: Jubileu Júnior","Código do Funcionario: 40028922","Àrea: TI");
		System.out.println(pessoa1.getNomeDoFuncionario());
		System.out.println(pessoa1.getCodigoDoFuncionario());
		System.out.println(pessoa1.getArea());
	}
}
