package aula09;

public class ProjetoLivro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pessoa[] p = new Pessoa [2];
		Livro[] l = new Livro[3];
		
		p[0] = new Pessoa("Alex", "M", 47);
		p[1] = new Pessoa("Ana", "F", 25);
		
		l[0] = new Livro("Harry P", "JKR", 300, p[0]);
		l[1] = new Livro("The Witcher", "André Sapão", 400, p[1]);
		l[2] = new Livro("Nunca conheci os H", "Gabi Froz", 150, p[0]);
		
		l[0].abrir();
		l[0].folhear(100);
		l[0].avancarPag();
		System.out.println(l[0].detalhes());
	}

}
