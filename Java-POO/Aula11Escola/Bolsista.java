package aula11;

public class Bolsista extends Estudante{
	private int bolsa;
	
	public void renovaBolsa() {
		System.out.println("Pagando bolsa de " + this.getNome());
	}
	@Override
	public void pagarMensalidade() {
		System.out.println(this.getNome() + " é bolsista. Pagamendo facilitado.");
	}
}
