package aula14;

public class Gafanhoto extends Humano{
	
	public Gafanhoto(String nome, int idade, String sexo, float experiencia, String login) {
		super(nome, idade, sexo, experiencia);
		this.login = login;
		this.totAssistido = 0;
		// TODO Auto-generated constructor stub
	}
	private String login;
	private int totAssistido;
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public int getTotAssistido() {
		return totAssistido;
	}
	public void setTotAssistido(int totAssistido) {
		this.totAssistido = totAssistido;
	}
	@Override
	public String toString() {
		return "Gafanhoto [login=" + login + ", totAssistido=" + totAssistido + "]";
	}
	
	
	
}
