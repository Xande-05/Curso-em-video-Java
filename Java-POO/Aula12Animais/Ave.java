package aula12;

public class Ave extends Animal{

		private String corDaPena;
		
	
	public String getCorDaPena() {
			return corDaPena;
		}

		public void setCorDaPena(String corDaPena) {
			this.corDaPena = corDaPena;
		}

	@Override
	public void locomover() {
		// TODO Auto-generated method stub
		System.out.println("Voando.");
	}

	@Override
	public void alimentar() {
		// TODO Auto-generated method stub
		System.out.println("Comendo frutas.");
	}

	@Override
	public void emitirSom() {
		// TODO Auto-generated method stub
		System.out.println("Som de ave.");
	}
	public void fazerNinho(){
		System.out.println("Fez um ninho.");
	}

}
