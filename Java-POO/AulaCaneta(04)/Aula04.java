package aula04;

public class Aula04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Caneta04 c1 = new Caneta04("Bic", "Preta", 0.5f);
		c1.status();
		System.out.println("tenho uma caneta de ponta " + c1.getPonta());
		System.out.println("-----------------------------------------");
		Caneta04 c2 = new Caneta04("HostNet", "Vermelha", 0.7f);
		c2.status();
	}

}
