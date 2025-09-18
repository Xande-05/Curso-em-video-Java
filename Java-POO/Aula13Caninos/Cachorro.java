package aula13;

public class Cachorro extends Lobo{
	@Override
	public void emitirSom() {
		System.out.println("Au Au Au.");
	}
	public void reagir(String frase) {
		if (frase == "Toma comida" || frase == "Olá") {
			System.out.println("Abanar e latir.");
		}else {
			System.out.println("Rosna.");
		}
	}
	
	public void reagir(int hora, int min) {
		if (hora < 12) {
			System.out.println("Abanar o rabo.");
		}else if (hora >= 18){
			System.out.println("Ignorar");
		}else {
			System.out.println("Abanar o rrabo e latir.");
		}
	}
	public void reagir(boolean dono) {
		if (dono) {
			System.err.println("Abana o rabo.");
		}else {
			System.out.println("Rosnar e latir.");
		}
	}
	public void reagir(int idade, float peso) {
		if (idade < 5) {
			if (peso < 10) {
				System.out.println("Abanar o rabo");
			}else {
				System.out.println("Latir");
			}
		}else {
			if (peso < 10) {
				System.out.println("Rosnar");
			}else {
				System.out.println("Ignorar");
			}
		}
	}
}
