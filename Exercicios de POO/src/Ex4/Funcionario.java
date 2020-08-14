package Ex4;

public class Funcionario {
	private String nomeDoFuncionario;
	private String codigoDoFuncionario;
	private String area;
	
	public Funcionario (String nome,String cod,String ar)
	{
		nomeDoFuncionario = nome;
		codigoDoFuncionario = cod;
		area = ar;
	}

	public String getNomeDoFuncionario() {
		return nomeDoFuncionario;
	}

	public void setNomeDoFuncionario(String nomeDoFuncionario) {
		this.nomeDoFuncionario = nomeDoFuncionario;
	}

	public String getCodigoDoFuncionario() {
		return codigoDoFuncionario;
	}

	public void setCodigoDoFuncionario(String codigoDoFuncionario) {
		this.codigoDoFuncionario = codigoDoFuncionario;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}
	
	
}
