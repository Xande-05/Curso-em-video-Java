package condicional;

import java.util.Scanner;

public class CondicionalIdade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in);
		String maioridade = new String();
		System.out.print("Digite seu ano de nascinmento: ");
		int nascimento = leia.nextInt();
		int idade = 2025 - nascimento;
		if (idade >= 18) {
			maioridade = "maior";
		} else {
			maioridade = "menor";
		}
		System.out.print("Você tem "+ idade + " anos e você é " + maioridade + " de idade.");
	}

}
