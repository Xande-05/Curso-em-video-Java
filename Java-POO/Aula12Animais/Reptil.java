package aula12;

public class Reptil extends Animal{

	private String corDaescama;
	
	
	
	public String getCorDaescama() {
		return corDaescama;
	}

	public void setCorDaescama(String corDaescama) {
		this.corDaescama = corDaescama;
	}

	@Override
	public void locomover() {
		// TODO Auto-generated method stub
		System.out.println("Rstejando.");
	}

	@Override
	public void alimentar() {
		// TODO Auto-generated method stub
		System.out.println("Comendo vegetais.");
	}

	@Override
	public void emitirSom() {
		// TODO Auto-generated method stub
		System.out.println("Som de réptil.");
	}

}
