package Ex1;

public class Empregado extends Pessoa {
	private int codigoSetor;
	private double salarioBase;
	private double imposto;
	private double salcal;
	
	public Empregado(String nome,String endereco,int telefone,int codSetor,int salBase,int imposto,int salCal)
	{
		super(nome,endereco,telefone);
		this.codigoSetor = codSetor;
		this.salarioBase = salBase;
		this.imposto = imposto;
		this.salcal = salCal;
		imposto = salBase*imposto;
		salCal = salBase+imposto;
	}

	public Empregado() {
		// TODO Auto-generated constructor stub
	}

	public int getCodigoSetor() {
		return codigoSetor;
	}

	public void setCodigoSetor(int codigoSetor) {
		this.codigoSetor = codigoSetor;
	}

	public double getSalarioBase() {
		return salarioBase;
	}

	public void setSalarioBase(double salarioBase) {
		this.salarioBase = salarioBase;
	}

	public double getImposto() {
		return imposto;
	}

	public void setImposto(double imposto) {
		this.imposto = imposto;
	}

	public double getSalcal() {
		return salcal;
	}

	public void setSalcal(double salcal) {
		this.salcal = salcal;
	}
	
	
	
}	
