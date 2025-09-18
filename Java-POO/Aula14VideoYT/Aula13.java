package aula14;

public class Aula13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Video v[] = new Video[3];
		v[0] = new Video ("Aula 1 POO", 0, 0, 0, false);
		v[1] = new Video ("Aula 2 POO", 0, 0, 0, false);
		v[2] = new Video ("Aula 3 POO", 0, 0, 0, false);
		
		Gafanhoto g[] = new Gafanhoto[2];
		g[0] = new Gafanhoto("alex", 47, "M", 0, "ALicio");
		g[1] = new Gafanhoto("Jô", 54, "M", 0, "JoFroz");
		
		
		Visualizacao view[] = new Visualizacao[5];
		view [0]= new Visualizacao(g[0], v[2]);
		view[0].avaliar();

		System.out.println(view[0].toString());
		
		view [1]= new Visualizacao(g[0], v[1]);
		view[1].avaliar(35.0f);
		System.out.println(view[1].toString());
		
		/*System.out.println("VÍDEOS \n ------------------------------------");
		System.out.println(v[0].toString());
		System.out.println(v[1].toString());
		System.out.println(v[2].toString());
		
		System.out.println("GAFANHOTOS \n ---------------------------------");
		System.out.println(g[0].toString());
		System.out.println(g[1].toString());*/
	}

}
