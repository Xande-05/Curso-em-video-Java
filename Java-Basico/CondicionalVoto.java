package condicional;

import java.util.Scanner;

public class CondicionalVoto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in);
		String voto = new String();
		System.out.print("Digite seu ano de nascinmento: ");
		int nascimento = leia.nextInt();
		int idade = 2025 - nascimento;
		if ((idade >= 18) && (idade <= 70)) {
				voto = "obrigatório";
		} else if ((idade > 70) || (idade >= 16 && idade < 18)) {
			voto = "opcional";
		} else {
			voto = "negado";
		}
		System.out.print("Você tem "+ idade + " anos e seu voto é " + voto + "!");
	}

}