package aula12;

public class Mamifero extends Animal{
	
	private String corDePele;
	
	public String getCorDePele() {
		return corDePele;
	}

	public void setCorDePele(String corDePele) {
		this.corDePele = corDePele;
	}

	@Override
	public void locomover() {
		// TODO Auto-generated method stub
		System.out.println("Correndo.");
	}

	@Override
	public void alimentar() {
		// TODO Auto-generated method stub
		System.out.println("Mamando.");
	}

	@Override
	public void emitirSom() {
		// TODO Auto-generated method stub
		System.out.println("Som de mamífero.");
	}

}
