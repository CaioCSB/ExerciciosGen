package Ex3;

public class Celular {
	private String numeroCelular;
	private String musica;
	private String email;
	
	public Celular(String num,String mus,String mail)
	{
		numeroCelular = num;
		musica = mus;
		email = mail;
	}

	public String getNumeroCelular() {
		return numeroCelular;
	}

	public void setNumeroCelular(String numeroCelular) {
		this.numeroCelular = numeroCelular;
	}

	public String getMusica() {
		return musica;
	}

	public void setMusica(String musica) {
		this.musica = musica;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	
}
