package Ex2;

public class Aviao {
	private String aeroporto;
	private String destinoPais;
	
	public Aviao (String aer,String destino)
	{
		aeroporto = aer;
		destinoPais = destino;
	}

	public String getAeroporto() {
		return aeroporto;
	}

	public void setAeroporto(String aeroporto) {
		this.aeroporto = aeroporto;
	}

	public String getDestinoPais() {
		return destinoPais;
	}

	public void setDestinoPais(String destinoPais) {
		this.destinoPais = destinoPais;
	}
	
	
}
