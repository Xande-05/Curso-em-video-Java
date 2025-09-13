package repeticao;

public class RepeticaoContinueBreak {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int cc = 0;
		while (cc < 10) {
			cc ++;
			if (cc == 2 || cc == 3) {
				continue;
			}
			if (cc == 7) {
				break;
			}
			System.out.println("Cambalhota n° " + cc);
		}
		System.out.println("Fim  do programa!");
	}
}
