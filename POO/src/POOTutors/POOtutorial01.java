package POOTutors;

public class POOtutorial01 {
	private String primeiroNome;
	private String nomesDoMeio;
	private String ultimoNome;
	
	public POOtutorial01 (String primeiro,String meio,String ultimo)
	{
		primeiroNome = primeiro;
		nomesDoMeio = meio;
		ultimoNome = ultimo;
	}
	
	public String getNomeCompleto()
	{
		String nomeCompleto = primeiroNome+" "+nomesDoMeio+" "+ultimoNome;
		return nomeCompleto;	
	}
}
