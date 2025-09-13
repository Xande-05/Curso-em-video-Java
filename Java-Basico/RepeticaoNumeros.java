package repeticao;

import java.util.Scanner;

public class RepeticaoNumeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n, s = 0;
		Scanner leia = new Scanner(System.in);
		String resp;
		do {
			System.out.print("Digite um número: ");
			n = leia.nextInt();
			s += n;
			System.out.print("Deseja continuar [S/N]: ");
			resp = leia.next();
		} while (resp.equals("s"));
		System.out.println("A soma de todos os valores digitados foi de: " + s);
	}

}
