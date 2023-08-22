package playLeo;

public class PlayLeo {
	// atributos
		private String titulo;
		private String publisher;
		private String tamanho;
		private String genero;
		private float preco;

		// Construtores
		

		public PlayLeo() { } //default
		// Construtor Sobrecarregado

		
		public PlayLeo(String titulo, String publisher, String tamanho, String genero, float preco) {
			this.titulo = titulo;
			this.publisher = publisher;
			this.tamanho = tamanho;
			this.genero = genero;
			this.preco = preco;
		}
		// Métodos

		public String getTitulo() {
			return titulo;
		}

		public void setTitulo(String titulo) {
			this.titulo = titulo;
		}

		public String getPublisher() {
			return publisher;
		}

		public void setPublisher(String Publisher) {
			this.publisher = publisher;
		}

		public String getTamanho() {
			return tamanho;
		}

		public void setTamanho(String tamanho) {
			this.tamanho = tamanho;
		}

		public String getGenero() {
			return genero;
		}

		public void setGenero(String genero) {
			this.genero = genero;
		}

		public float getPreco() {
			return preco;
		}

		public void setPreco(float preco) {
			this.preco = preco;
		}
		
		//Metodos da classe
		public String imprimir() {
			return "Título: " + titulo + "\nPublisher: " + publisher +
					"\nTAMANHO: " + tamanho + "\nGenero " + genero +
					String.format("\nPreço R$ %.2f \n",preco);
		}

	}


