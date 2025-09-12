package condicional;

import java.util.Scanner;

public class CondicionalEscolhaCaso {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in);
		String tipo = new String();
		System.out.print("Digite a quantidade de peras do animal: ");
		int pernas = leia.nextInt();
		switch (pernas) {
			case 1:
				tipo = "Saci";
				break;
			case 2:
				tipo = "Bípede";
				break;
			case 4:
				tipo = "Quadrúpede";
				break;
			case 6, 8:
				tipo = "Aracnídeo";
				break;
			default:
				tipo = "ET";
		}
		System.out.println(tipo);
		System.out.print("Fim do programa!");
	}

}
