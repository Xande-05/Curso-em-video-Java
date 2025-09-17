package aula12;

public class Peixe extends Animal{
	
	private String corEscama;

	public String getCorEscama() {
		return corEscama;
	}

	public void setCorEscama(String corEscama) {
		this.corEscama = corEscama;
	}

	@Override
	public void locomover() {
		// TODO Auto-generated method stub
		System.out.println("Nadando.");
	}

	@Override
	public void alimentar() {
		// TODO Auto-generated method stub
		System.out.println("Substâncias da água.");
	}

	@Override
	public void emitirSom() {
		// TODO Auto-generated method stub
		System.out.println("Não faz som.");
	}
	public void soltarBolha() {
		System.out.println("Soltou uma bolha.");
	}
	
	
}
