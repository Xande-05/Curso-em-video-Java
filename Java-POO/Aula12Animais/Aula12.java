package aula12;

public class Aula12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ave a = new Ave();
		Mamifero m = new Mamifero();
		Peixe p = new Peixe();
		Reptil r = new Reptil();
		Canguru c = new Canguru();
		Cachorro k = new Cachorro();
		
		m.setPeso(5.70f);
		m.setIdade(8);
		m.setMembros(4);
		m.locomover();
		m.alimentar();
		m.emitirSom();
		
		System.out.println("-------------------------------");
		
		c.setPeso(55.30f);
		c.setIdade(3);
		c.setMembros(4);
		c.locomover();
		c.alimentar();
		c.emitirSom();
		c.usarBolsa();
		
		System.out.println("-------------------------------");

		k.setPeso(3.94f);
		k.setIdade(5);
		k.setMembros(4);
		k.locomover();
		k.alimentar();
		k.emitirSom();
		k.abanarRabo();
		}

}
