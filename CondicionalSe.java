package condicional;

import java.util.Scanner;

public class EstruturaSe {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in);
		System.out.print("Digite sua primeira nota: ");
		float n1 = leia.nextFloat();
		System.out.print("Digite sua segunda nota: ");
		float n2 = leia.nextFloat();
		float m = (n1 + n2)/2;
		System.out.println("Sua média foi: " + m);
		if (m > 9) {
			System.out.println("Parabens!");
		}
	}
}