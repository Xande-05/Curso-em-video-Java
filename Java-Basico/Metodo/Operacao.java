package metodo02;

public class Operacao {
	public static String contador (int a, int b) {
		String s = "";
		for (int c = a; c <= b; c++) {
			s += c + " ";
		}
		return s;
	}
}
