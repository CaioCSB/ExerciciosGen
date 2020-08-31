package Ex1;

public class Fornecedor extends Pessoa {
	private double valorCredito;
	private double valorDivida;
	
	public Fornecedor(String nome,String endereco, int telefone,double valorCre,double div)
	{
		super(nome,endereco,telefone);
		this.valorCredito = valorCre;
		this.valorDivida = div;		
	}

	public Fornecedor() {
		// TODO Auto-generated constructor stub
	}

	public double getValorCredito() {
		return valorCredito;
	}

	public void setValorCredito(double valorCredito) {
		this.valorCredito = valorCredito;
	}

	public double getValorDivida() {
		return valorDivida;
	}

	public void setValorDivida(double valorDivida) {
		System.out.println("Valor da Divida: ");
		this.valorDivida = valorDivida;
	}
	
}
