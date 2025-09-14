package aula03;

public class Caneta03 {
	public String modelo;
	public String cor;
	private float ponta;
	protected int carga;
	private boolean tampada;
	public void status () {
		System.out.println("Modelo: " + this.modelo);
		System.out.println("Uma caneta " + this.cor);
		System.out.println("Tamanho da pontta: " + this.ponta);
		System.out.println("Tamanho da carga: " + this.carga);
		System.out.println("Está tampada? " + this.tampada);
	}
	public void rabiscar() {
		if (this.tampada == true) {
			System.out.println("Caneta tampada, não posso rabiscar.");
		} else {
			System.out.println("Rabiscando...");
		}
	}
	public void tampar() {
		this.tampada = true;
	}
	public void destampar() {
		this.tampada  = false;
	}
}
