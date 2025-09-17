package aula11;

public class Aula11 {

	public static void main(String[] args) {
		Visitante v1 = new Visitante();
		Estudante e1 = new Estudante();
		Bolsista b1 = new Bolsista();
		
		b1.setNome("Ana");
		b1.renovaBolsa();
		b1.pagarMensalidade();
		
		e1.setNome("Leandro");
		e1.pagarMensalidade();
		
		v1.setNome("Alex");
		v1.setIdade(22);
		System.out.println(v1.toString());
	}

}
