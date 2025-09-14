package aula02;

public class Caneta02 {
	String modelo;
	String cor;
	float ponta;
	int carga;
	boolean tampada;
	void status () {
		System.out.println("Modelo: " + this.modelo);
		System.out.println("Uma caneta " + this.cor);
		System.out.println("Tamanho da pontta: " + this.ponta);
		System.out.println("Tamanho da carga: " + this.carga);
		System.out.println("Está tampada? " + this.tampada);
	}
	void rabiscar() {
		if (this.tampada == true) {
			System.out.println("Caneta tampada, não posso rabiscar.");
		} else {
			System.out.println("Rabiscando...");
		}
	}
	void tampar() {
		this.tampada = true;
	}
	 void destampar() {
		this.tampada  = false;
	}
}
