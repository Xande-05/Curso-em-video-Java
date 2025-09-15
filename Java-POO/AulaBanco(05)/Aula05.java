package aula05;

public class Aula05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ContaBanco p1 = new ContaBanco();
		p1.setNumConta(11111);
		p1.setDono("Jubileu");
		p1.abrirConta("cc");
		
		ContaBanco p2 = new ContaBanco();
		p2.setNumConta(2222);
		p2.setDono("Creusa");
		p2.abrirConta("cp");
		
		p1.depositar(100);
		p2.depositar(500);
		
		p2.sacar(100f);
		
		p1.estadoAtual();
		p2.estadoAtual();
	}

}
