package aula14;

public class Video implements AcoesVideo{

		private String titulo;
		private int avaliacao;
		private  int view;
		private int curtidas;
		private boolean reproduzindo;
		
		
		
		
	
	public Video(String titulo, int avaliacao, int view, int curtidas, boolean reproduzindo) {
			super();
			this.titulo = titulo;
			this.avaliacao = 1;
			this.view = 0;
			this.curtidas = 0;
			this.reproduzindo = false;
		}

	public String getTitulo() {
			return titulo;
		}

		public void setTitulo(String titulo) {
			this.titulo = titulo;
		}

		public int getAvaliacao() {
			return avaliacao;
		}

		public void setAvaliacao(int avaliacao) {
			int novaA;
			novaA = (this.avaliacao + avaliacao)/this.view;
			this.avaliacao = novaA;
		}

		public int getView() {
			return view;
		}

		public void setView(int view) {
			this.view = view;
		}

		public int getCurtidas() {
			return curtidas;
		}

		public void setCurtidas(int curtidas) {
			this.curtidas = curtidas;
		}

		public boolean getReproduzindo() {
			return reproduzindo;
		}

		public void setReproduzindo(boolean reproduzindo) {
			this.reproduzindo = reproduzindo;
		}

	@Override
	public void play() {
		// TODO Auto-generated method stub
		this.reproduzindo = true;
	}

	@Override
	public void pause() {
		// TODO Auto-generated method stub
		this.reproduzindo = false;
	}

	@Override
	public void like() {
		// TODO Auto-generated method stub
		this.curtidas = 0;
	}

	@Override
	public String toString() {
		return "Video: titulo = " + titulo + ", avaliacao = " + avaliacao + ", view = " + view + ", curtidas = " + curtidas
				+ ", reproduzindo = " + reproduzindo;
	}
	
	

}
